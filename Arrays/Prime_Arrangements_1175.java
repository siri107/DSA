//prime arrangements 1175
//lhttps://leetcode.com/problems/prime-arrangements/
//approach:
// 1. Count the prime numbers from 1 to n
// 2. Check each number for primality using divisors up to √number
// 3. Find the number of non-prime numbers: n - primeCount
// 4. Calculate factorial of primeCount and nonPrimeCount
// 5. Multiply both factorials and return the result modulo 10^9 + 7
public class Prime_Arrangements_1175 {
    public int numPrimeArrangements(int n) {
        int np = 0; 
        for (int j = 2; j <= n; j++) {
            boolean prime = true;
            for (int i = 2; i <= Math.sqrt(j); i++) {

                if (j % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime)
                np++;
        }
        int mod = 1000000007;
        int nonPrime = n - np;
        long fact1 = 1;
        long fact2 = 1;
        for (int i = np; i >= 1; i--) {
            fact1 = (fact1 * i) % mod;
        }
        for (int i = nonPrime; i >= 1; i--) {
            fact2 = (fact2 * i) % mod;
        }
        long res = (fact1 * fact2) % mod;
        return (int) res;
    }
    public static void main(String[] args) {
        Prime_Arrangements_1175 obj = new Prime_Arrangements_1175();
        int n = 5;
        System.out.println(obj.numPrimeArrangements(n));
    }
    //time complexity: O(n*sqrt(n)), where n is the input number. We check each number from 2 to n for primality, and for each number, we check for divisors up to its square root.
    //space complexity: O(1), as we are using a constant amount of extra space
}
