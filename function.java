import java.util.*;

class Function {

  // Print prime numbers
  public static boolean isPrime(int n) {
    if (n == 2) {
      return true;
    }
    for (int i = 2; i <= (int) (Math.sqrt(n)); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  // Convert Binary number to Decimal number
  public static void binaryToDecimal(int n) {
    int lastDigit = 0, pow = 0, decNum = 0, myNum = n;
    while (n > 0) {
      lastDigit = n % 10;
      decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
      pow++;
      n = n / 10;
    }
    System.out.println("Binary number is " + myNum + " and their decimal number is " + decNum);
  }

  // Convert Decimal number to Binary number
  public static void decimalToBinary(int n) {
    int remaider = 0, myNum = n, pow = 0, binNum = 0;
    while (n > 0) {
      remaider = n % 2;
      binNum = binNum + (remaider * (int) Math.pow(10, pow));
      pow++;
      n = n / 2;
    }
    System.out.println("Decimal number is " + myNum + " and their binary number is " + binNum);
  }

  public static void main(String[] args) {
    // System.out.println("Hello");
    Scanner sc = new Scanner(System.in);

    // // Prime no. in range
    // System.out.println("Enter the range of prime number ");
    // int n = sc.nextInt();
    // for (int i = 0; i <= n; i++) {
    // if (isPrime(i)) {
    // System.out.print(i + " ");
    // }
    // }

    // System.out.println("Enter the Binary number ");
    // int binNum = sc.nextInt();
    // binaryToDecimal(binNum);

    System.out.println("Enter the Decimal number ");
    int decNum = sc.nextInt();
    decimalToBinary(decNum);

  }

}