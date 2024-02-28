package examples.note.controller;

import examples.note.models.models.*;
import examples.note.storage.Storage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ControllerTest {
    private Storage storage;

    @BeforeEach
    void setUp() {
        storage = new Storage();
        Controller.setStorage(storage);
    }

    @Test
    void createTeam() {
        // arrange

        // act
        Team team = Controller.createTeam("T1", "R1");
        // assert
        assertEquals("T1", team.getName());
        assertEquals("R1", team.getRoom());
        assertEquals(0, team.getNumberOfStudents());
        assertArrayEquals(new Team[0], team.getStudents());

        List<Team> expected = new ArrayList<>();
        expected.add(team);
        assertEquals(expected, storage.getAllTeams());
    }

    @Test
    void createStudent() {
        // arrange

        // act
        Student s = Controller.createStudent("N1", 20);
        // assert
        assertEquals("N1", s.getName());
        assertEquals(20, s.getAge());
        assertEquals(new ArrayList<Integer>(), s.getGrades());
        List<Student> expected = new ArrayList<>();
        expected.add(s);
        assertEquals(expected, storage.getAllStudents());
    }
}