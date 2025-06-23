class Average {
	int avg(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
			sum += arr[i];
		return sum / arr.length;
	}

	public static void Main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		Average d1 = new Average();
		System.out.println("avarage is:" + d1.avg(arr));
	}
}