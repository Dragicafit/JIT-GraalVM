public class Blender6 {

	private static class Color {
		double r;

		private Color(double r) {
			this.r = r;
		}

		public void add(Color other) {
			r += other.r;
		}
	}

	private static final Color[] colors = new Color[1000000];

	public static void main(String[] args) {
		for (int j = 0; j < 10; j++) {
			long t = System.nanoTime();
			for (int i = 0; i < 100; i++) {
				initialize(new Color(j / 20));
			}
			long d = System.nanoTime() - t;
			System.out.println(d / 1_000_000 + " ms");
		}
	}

	private static void initialize(Color id) {
		for (int x = 0; x < colors.length; x++) {
			Color color = new Color(x);
			color.add(id);
			if (color.r % 42 == 0) {
				colors[x] = color;
			}
		}
	}
}
