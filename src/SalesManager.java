public class SalesManager {
    protected int[] sales;
    int max;
    int min;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min() {
        min = sales[0];
        for (int sale1 : sales) {
            if (min > sale1) {
                min = sale1;
            }
        }
        return min;
    }

    public int stat() {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        int stat = (sum - min - max) / sales.length - 2;
        return stat;
    }
}