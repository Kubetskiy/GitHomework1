/**
 * TODO Прудполагается, что sales.length >= 3
 */
    public class SalesManager {
    protected int[] sales;

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
    public int trimmedMean() {
        int max = -1, tm, sum = 0;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
            sum += sale;
        }
        int min = max;
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        tm = (sum - (min + max))/ (sales.length - 2);
        return tm;
    }
}
