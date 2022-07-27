public class Main {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                System.out.println(i + " " + (i + 2));
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n / 2; i++) {

            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}