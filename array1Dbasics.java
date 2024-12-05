import java.util.*;

class Array1Dbasics {

  // Largest Number
  public static void largestNumber(int arr[]) {
    int maxNum = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > maxNum) {
        maxNum = arr[i];
      }
    }
    System.out.println("Largest Number is " + maxNum);
  }

  // Binary Search
  public static int binarySearch(int arr[], int key) {
    int start = 0, end = arr.length;
    while (start <= end) {
      int mid = (start + end) / 3;
      if (arr[mid] == key) {
        return mid;
      } else if (arr[mid] > key) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    // System.out.println("Hello");
    Scanner sc = new Scanner(System.in);

    // int arr[] = { 3, 4, 15, 6, 7 };
    // largestNumber(arr);

    int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
    int key = 11;
    int index = binarySearch(arr, key);
    if (index == -1) {
      System.out.println("NOT FOUND");
    } else {
      System.out.println("Key at index " + index);
    }
  }
}