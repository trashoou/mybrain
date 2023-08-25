package homework.forum.model;

public enum Menu {
    ADD_POST(1),REMOVE_POST(2),UPDATE_POST(3),GET_POST_BY_ID(4),GET_POSTS_BY_AUTHOR(5),GET_POSTS_BY_AUTHOR_DATE(6),SAVE(7),READ(8),EXIT(9);

    private int menuItem;

    Menu(int menuItem) {
        this.menuItem = menuItem;
    }

    public int getMenuByItem() {
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
