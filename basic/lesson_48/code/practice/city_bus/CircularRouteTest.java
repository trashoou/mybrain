package practice.city_bus;

import static org.junit.jupiter.api.Assertions.*;

class CircularRouteTest {
    private CircularRoute route;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        route = new CircularRoute();
    }

    @org.junit.jupiter.api.Test
    void addStop() {
        route.addStop("Berlin");
        assertEquals(1,route.getSize());
        assertEquals("Berlin",route.head.getStopName());

        route.addStop("Frankfurt");
        assertEquals(2,route.getSize());
        assertEquals("Berlin", route.head.getStopName());
        assertEquals("Frankfurt", route.head.next.getStopName());

        route.addStop("Paris");
        route.addStop("Cologne");
        assertEquals(4, route.getSize());
        assertEquals("Berlin", route.head.getStopName());
        assertEquals("Paris", route.head.prev.prev.getStopName());
        assertEquals("Cologne", route.head.prev.getStopName());
    }

    @org.junit.jupiter.api.Test
    void removeStop() {
        route.addStop("Berlin");
        route.addStop("Frankfurt");
        route.addStop("Paris");

        assertTrue(route.removeStop("Frankfurt"));
        assertEquals(2, route.getSize());
        assertEquals("Paris", route.head.next.getStopName());

        assertFalse(route.removeStop("Cologne"));
        assertEquals(2, route.getSize());

        assertTrue(route.removeStop("Berlin"));
        assertEquals(1, route.getSize());
        assertEquals("Paris", route.head.getStopName());

        assertTrue(route.removeStop("Paris"));
        assertEquals(0,route.getSize());

        route.addStop("Cologne");
        assertEquals("Cologne", route.head.getStopName());
    }

    @org.junit.jupiter.api.Test
    void whenToGetOff() {
        route.addStop("Berlin");
        route.addStop("Frankfurt");
        route.addStop("Paris");
        route.addStop("Munich");

        assertEquals("Выходите на следующей остановке: Munich", route.whenToGetOff("Berlin", "Munich"));
        assertEquals("Такой остановки нет в маршруте", route.whenToGetOff("Berlin", "Prague"));
        assertEquals("Такой остановки нет в маршруте", route.whenToGetOff("Prague", "Berlin"));
    }
}