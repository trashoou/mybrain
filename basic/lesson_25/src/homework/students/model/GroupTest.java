package homework.students.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GroupTest {

    Group group;

    @BeforeEach
    void setUp() {
        group = new Group(10);
    }

    @Test
    void addStudentTest() {
        Students student1 = new Students("Ivanov");
        Students student2 = new Students("Petrov");
        Students student3 = new Students("Khramov");

        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student3);

        Assertions.assertEquals(3,group.getSize());
    }

    @Test
    public void testStudentsGroup() {
        Students student1 = new Students("Ivanov");
        Students student2 = new Students("Petrov");
        Students student3 = new Students("Sidorov");
        Students student4 = new Students("Kozlov");

        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student3);
        group.addStudent(student4);

        // Вызываем метод studentsGroup(), чтобы распределить студентов по группам
        group.studentsGroup();

        // Проверяем, что две группы были созданы
        Students[] group1 = group.getGroup1();
        Students[] group2 = group.getGroup2();
        Assertions.assertEquals(2, group.getGroupCount());
        Assertions.assertEquals(2, group1.length);
        Assertions.assertEquals(2, group2.length);
    }

}
