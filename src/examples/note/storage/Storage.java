package examples.note.storage;

import examples.note.models.models.Student;
import examples.note.models.models.Team;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private final List<Team> teams = new ArrayList<>();
    private final List<Student> students = new ArrayList<>();

    public void addTeam(Team team) {
        teams.add(team);
    }

    public List<Team> getAllTeams() {
        return new ArrayList<>(teams);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }

}
