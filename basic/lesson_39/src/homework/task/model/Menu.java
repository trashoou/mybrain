package homework.task.model;

public enum Menu {
    LIST(1), ADD(2), FIND(3), REMOVE(4), EXIT(5);

    private int menuItem;

    Menu(int menuItem) {
        this.menuItem = menuItem;
    }

    public int getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(int menuItem) {
        this.menuItem = menuItem;
    }

    public static void printMenu() {
        Menu[] menu = Menu.values();
        for (int i = 0; i < Menu.values().length; i++) {
            System.out.println((menu[i].menuItem)+" - "+menu[i]+" | ");
        }
    }
}
