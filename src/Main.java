public class Main {
    public static void main(String[] args) {
        var sm = new SalesManager(new int[]{66, 22, 11, 33, 44});
        System.out.printf("Max of {66, 22, 11, 33, 44} = %d\n", sm.max());
        System.out.printf("TrimmedMean of {66, 22, 11, 33, 44} = %d\n", sm.trimmedMean());
    }
}
