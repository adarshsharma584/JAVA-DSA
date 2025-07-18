// printing an array :-

public class PrintArray {

    // printing an array in normal order
    static void printArray(int arr[], int n) {

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }

    ;

    // printing an array in reverse order

    static void PrintReverseArray(int arr[], int n) {

        for (int i = n - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

    }

    ;

    static void printEvenIndicesElements(int arr[], int n) {
        for (int i = 0; i < n; i += 2) {
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String args[]) {
        int array[] = {1, 2, 3, 4, 5};
        printArray(array, array.length);
        System.out.println("");
        PrintReverseArray(array, array.length);
        System.out.println("");
        printEvenIndicesElements(array, array.length);
        System.out.println("No Errors");
    }
}

// input : [1,2,3,4,5];
//output:1 2 3 4 5;
