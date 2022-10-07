public class Main {
    public static void main(String[] args) {
        MagicBox<String> names = new MagicBox<>(5);

        names.add("Nikolay");
        names.add("Olga");
        names.add("Timofei");
        names.add("Vasilisa");
        names.add("Maksim");
        names.add("Anastasia");

        System.out.println(names.pick());

        MagicBox<Integer> numbers = new MagicBox<>(5);

        numbers.add(100);
        numbers.add(200);

        System.out.println(numbers.pick());
    }
}
