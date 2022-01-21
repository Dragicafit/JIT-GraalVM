
public class Fibo {
	public static void main(String args[]) {
		long start = System.currentTimeMillis();
		System.out.println(fibo(40));
		System.out.println(System.currentTimeMillis() - start);

		start = System.currentTimeMillis();
		System.out.println(fibo(40));
		System.out.println(System.currentTimeMillis() - start);

		start = System.currentTimeMillis();
		System.out.println(fibo(40));
		System.out.println(System.currentTimeMillis() - start);

		start = System.currentTimeMillis();
		System.out.println(fibo(40));
		System.out.println(System.currentTimeMillis() - start);

		start = System.currentTimeMillis();
		System.out.println(fibo(40));
		System.out.println(System.currentTimeMillis() - start);

	}

	static long fibo(long n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return fibo(n - 1) + fibo(n - 2);
	}
}
