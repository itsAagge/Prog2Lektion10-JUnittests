package examples.note.storage;

import examples.note.models.models.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StorageTest {
    private Storage storage;

    @BeforeEach
    public void setUp() {
        storage = new Storage();
    }

    @Test
    public void addTeamToEmptyStorage() {
        //arrange
        Team team = new Team("A", "1");

        // act
        storage.addTeam(team);
        // assert
        List<Team> expected = new ArrayList<>();
        expected.add(team);
        assertEquals(expected, storage.getAllTeams());
    }

    @Test
    public void addTeamToNotEmptyStorage() {
        // arrange
        Team teamA = new Team("A", "1");
        storage.addTeam(teamA);
        Team teamB = new Team("B", "2");

        // act
        storage.addTeam(teamB);
        // assert
        List<Team> expected = new ArrayList<>();
        expected.add(teamA);
        expected.add(teamB);
        assertEquals(expected, storage.getAllTeams());
    }

    @Test
    public void addStudentToEmptyStorage() {
        // arrange
        Student student = new Student("Hans", 22);
        // act
        storage.addStudent(student);
        // assert
        List<Student> expected = new ArrayList<>();
        expected.add(student);
        assertEquals(expected, storage.getAllStudents());
    }

    @Test
    public void addStudentToNotEmptyStorage() {
        // arrange
        Student student1 = new Student("Hans", 22);
        storage.addStudent(student1);
        Student student2 = new Student("Ib", 20);

        // act
        storage.addStudent(student2);
        // assert
        List<Student> expected = new ArrayList<>();
        expected.add(student1);
        expected.add(student2);
        assertEquals(expected, storage.getAllStudents());
    }
}