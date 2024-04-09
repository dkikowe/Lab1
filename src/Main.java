import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        System.out.println("Which problem would you want to check? 1 - 10");
        Scanner sc = new Scanner(System.in);
        int problem = sc.nextInt();

        int n = 4;
        int[] arr = {1,2,3,4,5};




        switch (problem){
            case 1:
                System.out.println("Min:" + findMinimum(n,arr));
                break;
            case 2:
                System.out.println("average:" + average(n, arr) );
                break;
            case 3:
                System.out.println(isPrime(n));
                break;
            case 4:
                System.out.println("factorial is:" + factorial(n));
                break;
            case 5:
                System.out.println("fibbonacci element: " + fibonnacci(n) );
                break;
            case 6:
                System.out.println("a to the power n" + powerOf(2,5));
                break;
            case 7:
                System.out.println("reversed array: " );
                reverseArr(n ,arr);
                break;
            case 8:
                System.out.println(consistDigit("st123", 1));
                break;
            case 9:
                System.out.println(binomialCoeff(14,17));
                break;
            case 10:
                System.out.println("gcd:" + findGSD(45 , 58));
                break;



        }
    }

    /**
     * first task
     * Finding the Minimum number in the array
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

     Calculating the average of the elements in the given array up to index n.
     If n is 1, returns the only element in the array.
     Otherwise, recursively computes the sum of elements up to index n-1 and divides it by n.
     @param n The index up to which the average is calculated.
     @param arr The array of elements.
     @return The average of the elements up to index n.
     */

    public static double average(int n, int[] arr){
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

    /**
        6th task
     Calculating the power of a number recursively.
     @param a The base number.
     @param n The exponent.
     @return The result of raising 'a' to the power of 'n'.
     */

    public static int powerOf(int a , int n){
        if (n==1){
            return a;
        }
        else if (n==0){
            return 1;
        }
        else{
            return a*powerOf(a,n-1);
        }
    }
    /**
     * 7th task
     * This function reversed given Array with recusrsion
     * @param n how many elements in the array
     * @param arr given array
     */
    public static void reverseArr(int n, int[] arr){
        if(n == 1){
            System.out.print(arr[0] + " ");
            return;
        }
        System.out.print(arr[n-1] + " ");
        reverseArr(n-1, arr);
    }

    /**
     *8th task
     * This function checked, given str has digit or not
     * There are I used Character.isDigit to check every letter in my stroke
     * s.charAt give me letter by index
     * @param s it`s given stroke
     * @param index given index for recursion function to iteration before end of the stroke
     * @return true or false, have we digit on stroke or not
     */

    public static boolean consistDigit(String s, int index){
        if(index == s.length()){
            return false;
        }

        if(Character.isDigit(s.charAt(index))){
            return true;
        }
        return consistDigit(s, index+1);

    }

    /**
     * 9th task
     * There are function which calculate Binomial Coefficient
     * @param n parametr which needed for formula C, n, k
     * @param k parametr which needed for formula C, n, k
     * @return result of the formula
     */
    public static int binomialCoeff(int n, int k){
        if(k == 0 || n == k){
            return 1;
        }
        return binomialCoeff(n-1, k-1) + binomialCoeff(n-1, k);
    }

    /**
     * 10th task
     * There is function which find GSD of 2 numbers with Euclidean Algorithm and with recursion
     * @param a number 1
     * @param b number 2
     * @return GSD of 2 numbers
     */
    public static int findGSD(int a, int b){
        if(b == 0){
            return a;
        }
        return findGSD(b, a%b);
    }


}


