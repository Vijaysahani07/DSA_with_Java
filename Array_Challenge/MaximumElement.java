// Write a program to find the maximum element in an array

public class MaximumElement {

    public static void main(String[] args) {

        int[] arr = { 23, 24, 21, 7656, 23, 564, 465, 23, 54, 654, 345 };

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        // Printing the maximum element of an Array
        System.out.println("The maximum element in an array is " + max);
    }
}