package presentation;

public class Fibo {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(fibo(45));
        System.out.println("time: "+(System.currentTimeMillis()-start)+" ms");
    }
    
    static int fibo(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return fibo(n - 1) + fibo(n - 2);
	}
}
