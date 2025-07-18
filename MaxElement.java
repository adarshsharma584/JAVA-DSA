public class MaxElement {
    // finding the maximum element in an array
    static int findMax(int arr[], int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    };

    // finding the minimum element in an array
    static int findMin(int arr[], int n) {
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    };

    //finding the second maximum element in an array
     static int secondMax(int arr[],int n){
       int max =arr[0];
       int secondMax=arr[0];
       for(int i = 0; i<n;i++){
           if(arr[i]>max){
               secondMax=max;
               max=arr[i];
           }else if(arr[i]<max && arr[i]>secondMax){
               secondMax=arr[i];
           }
       }
       return secondMax;
   }

    public static void main(String[] args) {
        int[] array = {12, 5, 9, 21, 7};
        int maxElement = findMax(array, array.length);
        System.out.println("Maximum element in the array: " + maxElement);
        int minElement = findMin(array, array.length);
        System.out.println("Minimum element in the array: " + minElement);
        int secondMaxElement = secondMax(array, array.length);
        System.out.println("Second maximum element in the array: " + secondMaxElement);
        System.out.println("No Errors");
    }
}
