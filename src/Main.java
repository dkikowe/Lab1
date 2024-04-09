import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        System.out.println("Which problem would you want to check? 1 - 10");
        Scanner sc = new Scanner(System.in);
        int problem = sc.nextInt();

        int[] arr = {1, 2, 3, 4, 0};
        int num = 5;

        switch (problem){
            case 1:
        }
    }

    /**
     * first task
     * This method find the Minimum number in the array
     * It uses a recursive approach
     * Time complexity I wrote in the case
     * @param n is the quantity of the elements in the array, used for recursion
     * @param arr is the array
     * @return minimum Number in the array
     */
    public static int findMinimum(int n, int[] arr){
        if(n == 1){
            return arr[0];
        }
        return Math.min(arr[n-1], findMinimum(n-1, arr));
    }


    /** second task

     Calculates the average of the elements in the given array up to index n.
     If n is 1, returns the only element in the array.
     Otherwise, recursively computes the sum of elements up to index n-1 and divides it by n.
     @param n The index up to which the average is calculated.
     @param arr The array of elements.
     @return The average of the elements up to index n.
     */

    public static double average(int n, double[] arr){
        if(n==1){
            return arr[0];
        }
        else{
            return (arr[n-1]+average(n-1, arr))/n;
        }
    }
    /**
     third task
     Checks if the given integer is a prime number.
     @param n The integer to be checked for primality.
     @return True if the integer is prime, false otherwise.
     */
    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        for(int i = 2 ; i<=Math.sqrt(n); i++) {
            if(n % i == 0){
                return false ;
            }
        }
        return true;

    }
    /**
        4th task
     Calculating the factorial of the given integer recursively.
     @param n The integer for which factorial is calculated.
     @return The factorial of the given integer.
     */

    public static int factorial(int n) {
        if (n == 1) {
            return 1;

        } else {
            return n * factorial(n - 1);
        }
    }


    /**
            5th task
     Calculates the nth Fibonacci number recursively.
     @param n The index of the Fibonacci number to be calculated.
     @return The nth Fibonacci number.
     */

    public static int fibonnacci(int n){
        if(n <= 2){
            return 1;
        }
        else{
            return fibonnacci(n-1) + fibonnacci(n-2);
        }
    }


}


