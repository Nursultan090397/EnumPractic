public class Main {
    public static void main(String[] args) {


        Animal animal = Animal.CAT;
        System.out.println(animal);

        Animal animal2 = Animal.FROG;
        System.out.println(animal2);

        Animal animal3 = Animal.DOG;
        System.out.println(animal3);
        System.out.println(animal3.name());

        Season season = Season.WINTER;
        System.out.println(season.getTemperature());

        Season season2 = Season.AUTUMN;
        System.out.println(season2.getTemperature());

        Season season3 = Season.SPRING;
        System.out.println(season3.getTemperature());

        Season season4 = Season.SUMMER;
        System.out.println(season4.getTemperature());
        System.out.println(season4.name());

        Animal cat = Animal.valueOf("CAT");
        System.out.println(cat.getTranslation());


        Season winter = Season.WINTER;
        System.out.println(winter.ordinal());


    }

}