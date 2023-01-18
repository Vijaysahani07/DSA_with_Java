public class Sort {
    public static void main(String[] args) {

        //An Array to be Sortedddd
        int[] my_array = {64, 34, 25, 12, 22, 11, 90, 5};
        int n = my_array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (my_array[j] > my_array[j + 1]) {
                    int temp = my_array[j];
                    my_array[j] = my_array[j + 1];
                    my_array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        // Print sorted array
        System.out.print("Sorted array: ");
        for (int num : my_array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
