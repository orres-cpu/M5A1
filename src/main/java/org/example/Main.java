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



public static void main (String[] args)
{
    countDown(5);
    System.out.println(gcd(5, 2));
}

