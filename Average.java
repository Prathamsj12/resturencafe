class Average {
	void avg (int [] arr){
		int sum = 0;
		int Average;
		for(int i =0; i<arr.length;i++)
			sum+=arr[i];
		Average=sum/arr.length;	
		for(int i =0; i<arr.length; i++){
			if(arr[i]>Average)
				System.out.println(arr[i]);
				}
	}
	public static void main(String [] args){
		int arr[] = {10, 20, 30, 40, 50,60,70};
		Average d1 = new Average();
		d1.avg(arr);
		}
}