package lesson2.loop_in_java.exercise;

public class display_prime_number_smaller_then_100 {
    public static void main(String[] args) {
        System.out.println("Display PrimeNumber smaller then 100");

        for (byte i = 2; i < 100; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i + " ");
            }
        }
    }

    public static boolean isPrimeNumber (int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++){
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
            }
        }
