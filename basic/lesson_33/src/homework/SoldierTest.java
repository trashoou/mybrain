package homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import homework.Soldier;

import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class SoldierTest {
    Soldier[] soldiers;

    @BeforeEach
    void setUp() {
        soldiers = new Soldier[] {
                new Soldier("John", 180, 75, 50),
                new Soldier("Alice", 165, 60, 75),
                new Soldier("Bob", 175, 70, 30)
        };
    }

    @Test
    void testPrintArray() {
        Soldier.printArray(soldiers);
    }

    @Test
    void testFindSoldierByName() {
        Soldier foundSoldier = Soldier.findSoldierByName(soldiers,"Alice");
        if (foundSoldier != null) {
            System.out.println("Found Soldier: " + foundSoldier);
        } else {
            System.out.println("Soldier not found");
        }
    }

    @Test
    void testFindByPredicate() {
        // Тестирование findByPredicate на числах
        Integer[] numbers = {1, 2, 3, 4, 5};
        int targetNumber = 3;
        int foundNumber = Soldier.findByPredicate(numbers, (num) -> num.equals(targetNumber));
        if (foundNumber != -1) {
            System.out.println("Found number: " + foundNumber);
        } else {
            System.out.println("Number not found.");
        }

        // Тестирование findByPredicate на строках
        String[] names = {"John", "Alice", "Bob"};
        String targetName = "Alice";
        String foundName = Soldier.findByPredicate(names, (name) -> name.equals(targetName));
        if (foundName != null) {
            System.out.println("Found name: " + foundName);
        } else {
            System.out.println("Name not found.");
        }
    }

}