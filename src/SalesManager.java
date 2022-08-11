public class SalesManager {

    protected long[] sales;
    protected long min;
    protected long max;


    public SalesManager(long[] sales, long max, long min) {
        this.sales = sales;
        this.max = max;
        this.min = min;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min() {
        min = sales[0];
        for (long sale1 : sales) {
            if (min > sale1) {
                min = sale1;
            }
        }
        return min;
    }

    public long stat() {
        long sum = 0;
        for (long sale2 : sales) {
            sum += sale2;
        }
        long stat = (sum - min() - max()) / (sales.length - 2);
        return stat;
    }
}