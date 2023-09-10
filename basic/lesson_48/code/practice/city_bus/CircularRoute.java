package practice.city_bus;

public class CircularRoute {
    public BusStopNode head;
    private int size;

    public CircularRoute() {
        head = null;
        size = 0;
    }

    // Berlin -> Frankfurt -> Paris

    // Berlin -> Frankfurt -> Munich -> Praha

    public void addStop(String stopName) {
        BusStopNode newNode = new BusStopNode(stopName);
        if (head == null) {
            head = newNode;
            head.next = head; // кольцевая связь
            head.prev = head;
        } else {
            BusStopNode tail = head.prev;
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
        }
        size++;
    }

    public boolean removeStop(String stopName) {
        if (head == null) return false;

        BusStopNode current = head;
        do {
            if (current.stopName.equals(stopName)) {
                BusStopNode prev = current.prev;
                BusStopNode next = current.next;

                prev.next = next;
                next.prev = prev;

                if (current == head) {
                    head = next;
                }
                size--;
                return true;
            }
            current = current.next;
        } while (current != head);

        return false;
    }

    // метод возвращает количство остановок от start до end
    public String whenToGetOff(String start, String end) {
        if (head == null) return "Маршрут пуст";

        BusStopNode temp = head;
        boolean foundStart = false;
        do {
            if (temp.stopName.equals(start)) foundStart = true;
            if (foundStart && temp.stopName.equals(end)) return "Выходите на следующей остановке: " + end;

            temp = temp.next;
        } while (temp != head);

        return "Такой остановки нет в маршруте";
    }

    public int getSize() {
        return size;
    }
}

