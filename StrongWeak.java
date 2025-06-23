import java.util.Arrays;
class StrongWeak{
public static void main(String [] args)
	{
		int Array[]={15,16,18,28,38,24,32,42,36};
	for(int i=0;i<Array.length;i++){
		if(Array[i]%6==0 && Array[i]%4==0){
			System.out.println(Array[i]=-3);
					}
 		else if(Array[i]%6==0)
		{
			System.out.println(Array[i]=-2);
					}
		else if( Array[i]%4==0){
			System.out.println( Array[i]=-1);
					}
		else{
			System.out.println(Array[i]);
					}

	}
 System.out.println(Arrays.toString(Array));
					}
}