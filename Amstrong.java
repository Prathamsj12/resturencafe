class Amstrong {
	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			int n = i, length = 0, temp = n, sum = 0;
			while (temp != 0) {
				length++;
				temp /= 10;
			}
			temp = n;
			while (temp != 0) {
				sum += Math.pow(temp % 10, length);
				temp /= 10;
			}
			if (sum == n) {
				System.out.println(n + "Number is Amstorng Number ");
			} else {
				System.out.println(n + "Number is not Amstrong Number");
			}
		}

	}
}