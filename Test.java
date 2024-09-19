public class Test {

    public static void initializeArray(IntegerArrayList arrayList) {
        for (int i = 0; i < 11; i++) {
            arrayList.add(i + 1);
        }

        System.out.println("Initializing Array. Expected Value: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]");
        System.out.println(arrayList);
    }

    public static void addTest(IntegerArrayList arrayList) {
        arrayList.add(1);
        System.out.println("Add Test. Expected Value: 1");
        System.out.println(arrayList.get(arrayList.size() - 1));
    }

    public static void addIndexTest(IntegerArrayList arrayList) {
        arrayList.add(5, 20);
        System.out.println("Add Index Test. Expected Value: [1, 2, 3, 4, 5, 20, 6, 7, 8, 9, 10, 11, 1]");
        System.out.println(arrayList);
    }

    public static void setIndexTest(IntegerArrayList arrayList) {
        arrayList.set(3, 40);
        System.out.println("Set Index Test. Expected Value: [1, 2, 3, 40, 5, 20, 6, 7, 8, 9, 10, 11, 1]");
        System.out.println(arrayList);
    }

    public static void removeIndexTest(IntegerArrayList arrayList) {
        arrayList.remove(4);
        System.out.println("Remove Index Test. Expected Value: [1, 2, 3, 40, 20, 6, 7, 8, 9, 10, 11, 1]");
        System.out.println(arrayList);
    }

    public static void getIndexTest(IntegerArrayList arrayList) {
        System.out.println("Get Index Test. Expected Value: 7");
        System.out.println(arrayList.get(6));
    }

    public static void findSizeTest(IntegerArrayList arrayList) {
        System.out.println("Find Size Test. Expected Value: 12");
        System.out.println(arrayList.size());
    }

    public static void containsIndexTest(IntegerArrayList arrayList) {
        System.out.println("Contains Index Test. Expected Value: true, false");
        System.out.println(arrayList.contains(20) + ", " + arrayList.contains(30));
    }

    public static void indexOfTest(IntegerArrayList arrayList) {
        System.out.println("Index of Test. Expected Value: 6");
        System.out.println(arrayList.indexOf(7));
    }

    public static void equalsTest(IntegerArrayList arrayList) {
        System.out.println("Equals Test. Expected Value: true, false");
        IntegerArrayList arrayList2 = new IntegerArrayList();
        arrayList2.add(20);
        System.out.println(arrayList.equals(arrayList) + ", " + arrayList.equals(arrayList2));
    }

    public static void main(String[] args) {
        IntegerArrayList arrayList = new IntegerArrayList();
        initializeArray(arrayList);
        addTest(arrayList);
        addIndexTest(arrayList);
        setIndexTest(arrayList);
        removeIndexTest(arrayList);
        getIndexTest(arrayList);
        findSizeTest(arrayList);
        containsIndexTest(arrayList);
        indexOfTest(arrayList);
        equalsTest(arrayList);
    }
}
