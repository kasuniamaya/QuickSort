package quickSort;

public class QuickSort {


    // Method to perform quicksort on the array
    public void quickSort(long[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(arr, low, high);

            // Recursively sort the elements before and after the partition
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Method to partition the array and return the index of the pivot
    private int partition(long[] arr, int low, int high) {
        // Select the pivot element
        long pivot = arr[high];
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                swap(arr, i, j);
            }
        }

        // Swap the pivot element with the element at i+1
        swap(arr, i + 1, high);

        // Return the partitioning index
        return i + 1;
    }

    // Method to swap two elements in the array
    private void swap(long[] arr, int i, int j) {
        long temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Main method to test the quicksort implementation
    public static void main(String[] args) {
        QuickSort sorter = new QuickSort();
        long[] array = {10, 7, 8, 9, 1, 5};

        // Print the original array
        System.out.print("Original array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Perform quicksort on the array
        sorter.quickSort(array, 0, array.length - 1);

        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


}
