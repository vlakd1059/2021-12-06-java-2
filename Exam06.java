
public class Exam06 {

	public static void main(String[] args) {
		add(3, 5);
		sub(3, 5);
		mul(3, 5);
		aiv(3, 5);
	}

	private static int add(int i, int j) {
		System.out.println(i + j);
		return i + j;

	}

	private static int sub(int i, int j) {
		System.out.println(i - j);
		return i - j;

	}

	private static int mul(int i, int j) {
		System.out.println(i * j);
		return i * j;
	}

	private static int aiv(int i, int j) {
		System.out.println(i / j);
		return  i / j;
	}

}
