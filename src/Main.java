public class Main {
    public static void main(String[] args) {
        MagicBox<String> names = new MagicBox<>(3);
        names.add("Nikolay");
        names.add("Olga");
        //names.add("Timofei");

        System.out.println(names.pick());
    }
}
