package homework.students.controller;

import homework.students.model.Group;
import homework.students.model.Students;

public class StudentsAppl {
    public static void main(String[] args) {
        Group fullGroup = new Group(20);

        fullGroup.addStudent(new Students("Khramov"));
        fullGroup.addStudent(new Students("Rasulov"));
        fullGroup.addStudent(new Students("Ivanyo"));
        fullGroup.addStudent(new Students("Kleimann"));
        fullGroup.addStudent(new Students("Metzger"));
        fullGroup.addStudent(new Students("Bart"));
        fullGroup.addStudent(new Students("Frank"));
        fullGroup.addStudent(new Students("Brinster"));
        fullGroup.addStudent(new Students("Shein"));
        fullGroup.addStudent(new Students("Manschulow"));

        fullGroup.studentsGroup();

    }
}
