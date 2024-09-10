public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int steps = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n--;
            }
            steps++;
        }
        System.out.println("answer is" + steps);
    }
}

/*

Math.pow( base, exponent ) - Perform exponential calculation, base raised to exponent.
Math.sqrt( num ) - What is the square root of num?
Math.round( num ) - Round num to the nearest integer value
Math.floor( num ) - Truncate any decimals off of num down to the nearest integer value
Math.abs( num ) - What is the absolutele value of num?
Math.random() - Generate a random number between 0 and 1
Math.max( a, b ) - Which number is larger out of a or b?
Math.min( a, b ) - Which number is smaller out of a or b?

A while/ for loop that counts from 0 to 9:
int a = 0;
while (a < 10){
    system.out.println( a );
    a = a + 1

for (int i=0; i<10; i=i+1){
    system.out.println( i );
}

 */