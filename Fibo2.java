public class Fibo2 {
    public static void main(String[] args) {
        System.out.println(fibo(45, 40));
    }

    static long fibo(long n, long print) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        long start = 0;
        if (n == print) {
            start = System.currentTimeMillis();
        }
        long result = fibo(n - 1, print) + fibo(n - 2, print);
        if (n == print) {
            System.out.println(System.currentTimeMillis() - start);
        }

        return result;
    }
}
