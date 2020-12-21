public class Tester {
    public static void main(String[] args) {
        int[] x = {5, 1, 12, 5, 16};
        Sorts.bubbleSort(x);
        System.out.println(myPrint(x));

        x = new int[]{2, 3, 4, 5, 1};
        Sorts.bubbleSort(x);
        System.out.println(myPrint(x));

        x = new int[]{6, 1, 2, 3, 4, 5};
        Sorts.bubbleSort(x);
        System.out.println(myPrint(x));

        // Selection Sort
        x = new int[]{64, 25, 12, 22, 11};
        Sorts.bubbleSort(x);
        System.out.println(myPrint(x));
        
    }
    public static String myPrint(int[] x){
        for (int i : x){
            System.out.print(i + ",");
        }
        return "";
    }
}
