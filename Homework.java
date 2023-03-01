package sem4Homework;
public class Homework {
    public static void main(String[] args) {
        int[] arr = new int[] {34, 3, 4, 1, 0, 5, 134, 23, 43, -2, -32};
        printArray(arr);
        System.out.println();
        printSortArray(hempSort(arr));
    }
    private static int[] hempSort(int[] arr) {
        for (int i = arr.length / 2 - 1; i >= 0 ; i--) hemp(arr, arr.length, i);
        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            hemp(arr, i, 0);
        }
        return arr;
    }
    private static void hemp(int[] arr, int n, int i) {
        int larg = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && arr[left] > arr[larg]) larg = left;
        if (right < n && arr[right] > arr[larg]) larg = right;
        if (larg != i) {
            int temp = arr[i];
            arr[i] = arr[larg];
            arr[larg] = temp;
            hemp(arr, n, larg);
        }
    }
    private static void printArray(int arr[]) {
        System.out.printf("изначальный массив: ");
        for (int i = 0; i < arr.length; i++) System.out.printf(arr[i]+" ");
    }
    private static void printSortArray(int arr[]) {
        System.out.printf("отсортированный массив: ");
        for (int i = 0; i < arr.length; i++) System.out.printf(arr[i]+" ");
    }
}
