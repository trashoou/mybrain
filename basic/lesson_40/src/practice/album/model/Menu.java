package practice.album.model;

public enum Menu {
    GET_PHOTO_FROM_ALBUM(1), GET_ALL_PHOTO_FROM_ALBUM(2), GET_PHOTO_BETWEEN_DATE(3), ADD(4), REMOVE(5), UPDATE(6),SAVE(7),READ(8), EXIT(9);

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
