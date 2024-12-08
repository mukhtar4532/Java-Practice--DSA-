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
    int start = 0, end = arr.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] == key) {
        return mid;
      }
      if (arr[mid] > key) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return -1;
  }

  // Reverse of an Array
  public static void reverseArray(int arr[]) {
    int start = 0, end = arr.length - 1;
    while (start < end) {
      int temp = arr[end];
      arr[end] = arr[start];
      arr[start] = temp;
      start++;
      end--;
    }
  }

  // Pairs in an Array
  public static void printPairs(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        System.out.print("(" + arr[i] + ", " + arr[j] + ")");
      }
      System.out.println();
    }
  }

  // Print Subarrays
  public static void printSubarrays(int arr[]) {
    int total = 0;
    for (int i = 0; i < arr.length; i++) {
      int start = i;
      for (int j = i; j < arr.length; j++) {
        int end = j;
        for (int k = start; k < end; k++) {
          System.out.print(arr[k] + ", ");
          total++;
        }
        System.out.println();
      }
    }
    System.out.println("Total subarrays " + total);
  }

  // Print max Subarrays sum ----->>>>>> O(n^3)
  public static void subArraySum(int arr[]) {
    int total = 0;
    int maxSum = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      int start = i;
      for (int j = i; j < arr.length; j++) {
        int end = j;
        int currSum = 0;
        for (int k = start; k < end; k++) {
          System.out.print(arr[k] + ",  ");
          currSum += arr[k];
          total++;
        }
        System.out.print("CurrSum " + currSum);
        if (currSum > maxSum) {
          maxSum = currSum;
        }
        System.out.println();
      }
    }
    System.out.println("Maximum sum is " + maxSum);
    System.out.println("Total subarrays " + total);
  }

  // Print max Subarrays sum ----->>>>>> O(n^2)
  public static void subArraySum2(int arr[]) {
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    int prefix[] = new int[arr.length];

    prefix[0] = arr[0];

    for (int i = 1; i < prefix.length; i++) {
      // calculate prefix array
      prefix[i] = prefix[i - 1] + arr[i];

    }

    for (int i = 0; i < arr.length; i++) {
      int start = i;
      for (int j = i; j < arr.length; j++) {
        int end = j;
        currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
        if (currSum > maxSum) {
          maxSum = currSum;
        }
      }
    }

    System.out.println("maxSum = " + maxSum);

  }

  public static void main(String[] args) {
    // System.out.println("Hello");
    // Scanner sc = new Scanner(System.in);

    // int arr[] = { 3, 4, 15, 6, 7 };
    // largestNumber(arr);

    // int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
    // int key = 11;
    // int index = binarySearch(arr, key);
    // if (index == -1) {
    // System.out.println("NOT FOUND");
    // } else {
    // System.out.println("Key at index " + index);
    // }

    // int arr[] = { 1, 2, 3, 4 };
    // reverseArray(arr);
    // for (int i = 0; i < arr.length; i++) {
    // System.out.print(arr[i] + " ");
    // }

    int arr[] = { 1, -2, 6, -1, 3 };
    // printPairs(arr);
    // printSubarrays(arr);
    // subArraySum(arr);
    subArraySum2(arr);

  }
}