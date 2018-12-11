public class WaterbottleRunner {
    public static void main(String[] args) {
        Waterbottle waterbottle = new Waterbottle(100);
        System.out.println(waterbottle.getVolume());
        System.out.println(waterbottle.drink());
        System.out.println(waterbottle.empty());
        System.out.println(waterbottle.fill());
    }
}
