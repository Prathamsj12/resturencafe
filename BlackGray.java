import java.util.Arrays;
class BlackGray{
public static void main(String[] args){
	int Array[]={34,18,24,16,12,20,32,44,15,41};
	for(int i=0;i<Array.length;i++){

		if(Array[i]%10==4 && Array[i]%4==0){
			System.out.println(Array[i]=-3);
				}
		else if(Array[i]%10==4){
			System.out.println(Array[i]=-2);
				}
		else if(Array[i]%4==0 )
				{
			System.out.println(Array[i]=-1);			
				}
		else{
			System.out.println(Array[i]);
		}
	}
	System.out.println(Arrays.toString(Array));
	}
}