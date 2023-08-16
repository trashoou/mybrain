package practice.seasons;

public class SeasonAppl {
    public static void main(String[] args) {

        Season season = Season.WINTER;
        System.out.println(season);
        System.out.println(Season.AUTUMN);

        System.out.println(season.name());

        System.out.println("========values========");
        Season[] seasons = Season.values();
        for (Season element : Season.values()) {
            System.out.println(element);
        }

        System.out.println("========original========");
        System.out.println(season.name());
        System.out.println(season.ordinal());
        System.out.println(season.SPRING.ordinal());
        System.out.println(season.AUTUMN.ordinal());
    }
}
