public class Fibo2 {
    public static void main(String[] args) {
        fibo(45, 40);
    }
    
    static long fibo(long n, long print){
        if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}

        if (n == print) {
            long start = System.currentTimeMillis();
            long result = fibo(n - 1, print) + fibo(n - 2, print);
            long end = System.currentTimeMillis() - start;
            System.out.println("fibo("+print+") in : "+end+" ms");
        }

		return fibo(n - 1, print) + fibo(n - 2, print);
    }
}
