/**
 * TODO Прудполагается, что sales.length >= 3
 */
public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
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
    public long trimmedMean() {
        long max = -1, tm, sum = 0;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
            sum += sale;
        }
        long min = max;
        for (long sale : sales) {
            if (sale < min) {
                min = (int) sale;
            }
        }
        tm = (sum - (min + max))/ (sales.length - 2);
        return tm;
    }
}
