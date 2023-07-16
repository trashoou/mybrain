package homework.students.model;

public class Group {
    private Students[] students;
    private int size;
    private Students[] group1;
    private Students[] group2;

    public Group(int capacity) {
        students = new Students[capacity];
        size = 0;
    }

    public void addStudent(Students student) {
        if (size < students.length) {
            students[size] = student;
            size++;
        }
    }

    public void studentsGroup() {
        int totalStudents = size;
        int groupSize = totalStudents / 2;

        group1 = new Students[groupSize];
        group2 = new Students[totalStudents - groupSize];
        for (int i = 0; i < totalStudents; i++) {
            if (i < groupSize) {
                group1[i] = students[i];
            } else {
                group2[i - groupSize] = students[i];
            }
        }
        System.out.println("Группа 1:");
        for (Students student : group1) {
            System.out.println(student.getLastName());
        }

        System.out.println("Группа 2:");
        for (Students student : group2) {
            System.out.println(student.getLastName());
        }
    }

    public int getGroupCount() {
        if (group1 != null && group2 != null) {
            return 2;
        }
        return 0;
    }

    public Students[] getGroup1() {
        return group1;
    }

    public Students[] getGroup2() {
        return group2;
    }

    public int getSize() {
        return size;
    }
}
