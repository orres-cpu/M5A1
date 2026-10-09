//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
static void countDown(int num)
{

    if (num == 0) // test

        System.out.println("Blastoff!");

    else {

        if (num % 2 == 0)
            System.out.println(num);

        countDown(num-1); // recursive call

    }
}
/*
The time complexity of this code is O(n)
makes one recursive call for everyvalue of num.
 */


static int gcd(int x, int y) {

    if (x == y)
        return x;
    else if (x > y)
        return gcd(x - y, y);
    else
        return gcd(x, y - x);

}
/*
The time complexity of this code is O(x + y)
makes two recursive calls one for y and x .

Output : an integer of the GCD.
 */


static int fib(int n)

{

    if (n <= 0) // base case

        return 0;

    else if (n == 1) // base case

        return 1;

    else

        return fib(n - 1) + fib(n - 2);

}
/*
The time complexity of this code is O(2^n)
makes one recursive call for everyvalue of num.
 */

public static void helloWorld(int n)
{
    if (n <= 0 )
        return;

    System.out.println("Hello World");
    helloWorld(n-1);
}

/*
The time complexity of this code is O(n)
makes one recursive call for everyvalue of num.
 */

public static int sumMultipleOf7(int n1, int n2)
{
    if (n1 > n2)
        return 0;

    if ( n1 % 7 == 0)
        return n1 + sumMultipleOf7(n1 + 1, n2);

    return sumMultipleOf7(n1 + 1, n2);
}

/*
The time complexity of this code is O(2n)
makes one recursive call for everyvalue of n1 & n2.
 */


public static int binarySearch(int[] arr, int target, int left, int right)
{
    if (left > right)
        return -1;


    int mid = left + (right - left) / 2;

    if (arr[mid] == target)
        return mid;

    if (target < arr[mid])
        return binarySearch(arr, target, left, mid -1);

    return binarySearch(arr, target, mid + 1, right);
}


public static void main (String[] args)
{
    countDown(5);
    System.out.println(gcd(5, 2));
}

