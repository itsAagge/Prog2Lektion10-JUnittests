package examples.note.controller;

import examples.note.models.models.Student;
import examples.note.models.models.Team;
import examples.note.storage.Storage;

public abstract class Controller {
    private static Storage storage;

    public static void setStorage(Storage storage) {
        Controller.storage = storage;
    }

    //-----------------------------------------------------

    public static Team createTeam(String name, String room) {
        Team team = new Team(name, room);
        storage.addTeam(team);
        return team;
    }

    public static Student createStudent(String name, int age) {
        Student student = new Student(name, age);
        storage.addStudent(student);
        return student;
    }

    public static void addStudentToTeam(Student student, Team team) {
        team.addStudent(student);
    }
}
