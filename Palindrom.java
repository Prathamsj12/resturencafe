class Palindrom {
	public static void main(String[] args) {
		for (int i = 0; i <= 1000; i++) {
			int n = 121;
			int sum = 0;
			int temp = n;
			while (temp != 0) {
				sum *= 10;
				sum += temp % 10;
				temp /= 10;
			}
			if (sum == n) {
				System.out.println(n + "Palindrom number ");
			}
		}
	}
}
