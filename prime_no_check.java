 class PrimeNumberCheck {
    public static void main(String[] args) {
        int number = 30; // You can change this value to test other numbers

        // Check if the number is prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true; // 2 is the only even prime number
        }
        if (num % 2 == 0) {
            return false; // All other even numbers are not prime
        }
        for (int i = 3; i <= num / 2; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
