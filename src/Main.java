public class Main {
    public static void main(String[] args) {
        SalesManager manager = new SalesManager(new int[]{100, 200, 300});
        System.out.println("Максимальная цена " + manager.max());

    }
}
