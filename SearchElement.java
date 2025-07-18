
public class SearchElement {

    // This method searches for a target value in an array and returns true if found, otherwise false.
    static boolean searchElementInArray(int arr[], int n, int target) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    };

    // This method returns the index of the target value in the array, or -1 if not found.

    static int printIndex(int arr[], int n, int target) {

        int idx = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                idx = i;
                return idx; // Return the index immediately if found
            }
        }
        return idx;

    };

    // This method prints all indices of the target value in the array.

   static void printAllIndices(int arr[], int n, int target) {

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                System.out.println("idx: " + i);
            }
        }

    };

    public static void main(String[] args) {
        int[] array = {10, 25, 30, 15, 7,30 ,30 ,45 ,30};
        int target = 30;
        System.out.println("Searching for " + target + " in the array: ");
        if (searchElementInArray(array, array.length, target)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
        System.out.println("Index of " + target + " is: " + printIndex(array, array.length, target));
        System.out.println("");
        System.out.println("All indices of " + target + " in the array: ");
        printAllIndices(array, array.length, target);
        System.out.println("No Errors");
    }
}
