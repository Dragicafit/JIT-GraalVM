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
			long t = System.currentTimeMillis();
			for (int i = 0; i < 100; i++) {
				initialize(new Color(j / 20));
			}
			System.out.println(System.currentTimeMillis() - t);
			System.out.println(colors.length);
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
