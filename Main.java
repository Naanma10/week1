import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(30, 15, 100, 50, 27, 1, 5, 66, 10);
        List<String> words = List.of("Dayil", "Naanma", "is", "Great", "noon");

        //Count odd numbers
        int oddCount = Utils.countIf(numbers, n -> n % 2 != 0);
        System.out.println("Odd numbers: " + oddCount);

        //Count prime numbers
        int primeCount = Utils.countIf(numbers, Main::isPrime);
        System.out.println("Prime numbers: " + primeCount);

        //Count palindromes
        int palindromeCount = Utils.countIf(words, s -> s.equals(new StringBuilder(s).reverse().toString()));
        System.out.println("Palindromes: " + palindromeCount);
    }

    //method for checking primes
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
