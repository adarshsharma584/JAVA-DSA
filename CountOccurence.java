
public class CountOccurence {

    //This method counts the occurrences of a target value in an array.
    static int CountElementOccurence(int arr[], int n, int target) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }

    //This method counts and prints elements greater than a target value in an array.

    static void CountGreaterElementsOccurence(int arr[], int n, int target) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > target) {
                count++;
                System.out.println("Elements greater than " + target + " are: " + arr[i]);
            }
        }
        System.out.println("Count of elements greater than " + target + " is: " + count);
       
    }

    public static void main(String args[]) {
        int[] array = {3, 5, 3, 2, 3, 8, 2, 3, 3, 3, 3, 5, 6, 3};
        int target = 3;
        System.out.println(CountElementOccurence(array, array.length, target));
        System.out.println("");
        CountGreaterElementsOccurence(array, array.length, target);
        System.out.println("");
        System.out.println("No Errors");
    }
}
