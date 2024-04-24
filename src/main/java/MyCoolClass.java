public class MyCoolClass {
    private static int totalCount = 0;
    private int instanceCount = 0;

    public static void incrementTotalCount() {
        totalCount++;
    }

    public void incrementInstanceCount() {
        this.instanceCount++;
    }

    @Override
    public String toString() {
        return "MyCoolClass{" +
                "instanceCount=" + instanceCount + "/" +
                "totalCount=" + totalCount +
                '}';
    }
}
