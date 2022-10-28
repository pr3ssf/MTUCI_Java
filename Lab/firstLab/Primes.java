package Lab.firstLab;
/*
*Class Primes used to check wether numbers up to 100 are a prime number
*/
public class Primes {
    /*
    *main function processes main number we check and data
    */
    public static void main(String[] args){
        for (int i=2; i<100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    /*
    *isPrime function used to check is N number is prime
    */
    public static boolean isPrime(int n) {
        for (int i=2; i<n; i++) {
            if ((n%i)==0) {
                return false;
            }
        }
        return true; 
    }
}
