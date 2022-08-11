public class Main {
    public static void main(String[] args) {

        SalesManager manager = new SalesManager(new long[]{200, 100, 600, 300, 400, 500},-1,0);

        //System.out.println("Максимальная цена " + manager.max());
        //System.out.println("Минимальное значение " + manager.min());
        System.out.println("Расчет обрезанного среднего:" + manager.stat());

    }
}
