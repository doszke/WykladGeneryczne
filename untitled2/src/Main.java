import java.util.Arrays;

public class Main {

    /*
    public static int maximum(int x1, int x2, int x3){
        int greater = (x1 > x2) ? x1: x2;
        return (greater > x3) ? greater : x3;
    }

    public static void printArray(Object[] inputArray){
        System.out.println(Arrays.toString(inputArray).replace("[", "")
                .replace("]", "").replace(",", "") + "\n");
    }
    */

    //wymazywanie- zastępowanie T obiektami Object
    public static <T> void printArray(T[] inputArray){
        System.out.println(Arrays.toString(inputArray).replace("[", "")
                .replace("]", "").replace(",", ""));
    }

    public static <T extends Comparable<T>> T maximum(T x1, T x2, T x3){
        T greater = (x1.compareTo(x2) > 0) ? x1: x2;
        return (greater.compareTo(x3) > 0) ? greater : x3;
    }



    public static void main(String[] args) {

        printArray(new Integer[]{1, 2, 3});

        printArray(new Double[]{1.0, 2.0, 3.0});

        Object o = new Object();


        Stack stack = new Stack();


    }

}

