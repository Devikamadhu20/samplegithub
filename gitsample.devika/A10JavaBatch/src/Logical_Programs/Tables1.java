package Logical_Programs;

public class Tables1 {
	static void tables() {
		for (int j = 1; j <= 100; j++) {
			int no = j;
			for (int i = 1; i <= 10; i++) {
				System.out.println(no + "*" + i + "=" + (no * i));
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		tables();
	}

}
