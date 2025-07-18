public class PrintSum {

    // calculating the sum of all elements in an array

static int calculateSum(int arr[] , int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // calculating the sum of elements at even indices

     static int sumOfEvenIndices(int arr[], int n) {
         int sum = 0;
         for (int i = 0; i < n; i++) {
             if (i % 2 == 0) {
                 sum += arr[i];
             }
         }
         return sum;
     };
      
    // calculating the average of an array 
    static int average(int arr[],int n){
        int sum=0;
        int average = 0;

    for(int i=0;i<n;i++){
        sum+=arr[i];
    }
    return (average=sum/n);
    }
         

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = calculateSum(array, array.length);
        System.out.println("Sum of the array elements: " + sum);
        int sumEvenIndices = sumOfEvenIndices(array, array.length);
        System.out.println("Sum of elements at even indices: " + sumEvenIndices);
        int avg = average(array, array.length);
        System.out.println("Average of the array elements: " + avg);
        System.out.println("No Errors");
    }
}
