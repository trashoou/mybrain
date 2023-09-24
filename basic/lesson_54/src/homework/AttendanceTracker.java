package homework;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class AttendanceTracker {
    private Map<String, Map<LocalDate, Boolean>> attendanceMap;

    public AttendanceTracker() {
        attendanceMap = new HashMap<>();
    }

    // Добавление нового ученика
    public void addStudent(String name) {
        attendanceMap.put(name, new HashMap<>());
    }

    // Добавление новой даты урока
    public void addLessonDate(LocalDate date) {
        for (Map<LocalDate, Boolean> studentAttendance : attendanceMap.values()) {
            studentAttendance.put(date, false); // Изначально все ученики отмечаются как отсутствующие
        }
    }

    // Отметить посещение ученика на уроке
    public void markAttendance(String name, LocalDate date, boolean attended) {
        if (attendanceMap.containsKey(name) && attendanceMap.get(name).containsKey(date)) {
            attendanceMap.get(name).put(date, attended);
        }
    }

    // Вывести список всех учеников с их посещаемостью
    public void printAllAttendance() {
        for (Map.Entry<String, Map<LocalDate, Boolean>> entry : attendanceMap.entrySet()) {
            String name = entry.getKey();
            Map<LocalDate, Boolean> studentAttendance = entry.getValue();
            System.out.println("Ученик: " + name);
            for (Map.Entry<LocalDate, Boolean> lessonEntry : studentAttendance.entrySet()) {
                LocalDate date = lessonEntry.getKey();
                boolean attended = lessonEntry.getValue();
                System.out.println("Дата: " + date + ", Посещение: " + (attended ? "Посетил" : "Пропустил"));
            }
            System.out.println();
        }
    }

    // Вывести посещаемость отдельного ученика
    public void printStudentAttendance(String name) {
        if (attendanceMap.containsKey(name)) {
            Map<LocalDate, Boolean> studentAttendance = attendanceMap.get(name);
            System.out.println("Ученик: " + name);
            for (Map.Entry<LocalDate, Boolean> entry : studentAttendance.entrySet()) {
                LocalDate date = entry.getKey();
                boolean attended = entry.getValue();
                System.out.println("Дата: " + date + ", Посещение: " + (attended ? "Посетил" : "Пропустил"));
            }
            System.out.println();
        } else {
            System.out.println("Ученик с именем '" + name + "' не найден.");
        }
    }

    public static void main(String[] args) {
        AttendanceTracker tracker = new AttendanceTracker();

        // Добавление учеников
        tracker.addStudent("Alice");
        tracker.addStudent("Bob");

        // Добавление дат уроков
        tracker.addLessonDate(LocalDate.of(2023, 9, 1));
        tracker.addLessonDate(LocalDate.of(2023, 9, 3));

        // Отметка посещения
        tracker.markAttendance("Alice", LocalDate.of(2023, 9, 1), true);
        tracker.markAttendance("Bob", LocalDate.of(2023, 9, 1), false);
        tracker.markAttendance("Alice", LocalDate.of(2023, 9, 3), true);
        tracker.markAttendance("Bob", LocalDate.of(2023, 9, 3), true);

        // Вывод посещаемости
        tracker.printAllAttendance();
        tracker.printStudentAttendance("Alice");
        tracker.printStudentAttendance("Charlie"); // Ученик с именем "Charlie" не существует
    }
}
