import java.lang.Math;
import java.util.Arrays;

class FirstAtLast {
	public static void main(String[] args) {
		int Array[] = { 124, 651, 3896, 467, 234, 977, 534, 23, 467, 235, 112 };
		// {241,};
		for (int i = 0; i < Array.length; i++) {
			int first = 0;
			int temp = Array[i];
			int length = 0;
			while (temp != 0) {
				first = temp % 10;
				temp /= 10;
				length++;
			}
			temp += Array[i] % (Math.pow(10, --length));
			temp *= 10;
			temp += first;
			Array[i] = temp;
		}
		System.out.println(Arrays.toString(Array));
	}
}