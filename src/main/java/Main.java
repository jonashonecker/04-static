public class Main {
    public static void main(String[] args) {
        MyCoolClass cc1 = new MyCoolClass();
        cc1.incrementInstanceCount();
        MyCoolClass.incrementTotalCount();
        System.out.println(cc1);

        MyCoolClass cc2 = new MyCoolClass();
        cc2.incrementInstanceCount();
        MyCoolClass.incrementTotalCount();
        System.out.println(cc2);

        MyCoolClass cc3 = new MyCoolClass();
        cc3.incrementInstanceCount();
        MyCoolClass.incrementTotalCount();
        System.out.println(cc3);

        MyCoolClass cc4 = new MyCoolClass();
        cc4.incrementInstanceCount();
        MyCoolClass.incrementTotalCount();
        System.out.println(cc4);
    }
}
