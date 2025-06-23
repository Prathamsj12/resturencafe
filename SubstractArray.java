import java.util.Arrays;
class SubstractArray{
public static void main(String [] arg){
int Array[]={14,17,6,23,20,15,24,18,11};
int Array2[]=new int[Array.length-1];
	for(int i=0;i<Array.length-1;i++){
		int ans=Array[i]-Array[i+1];
		
Array2[i]=Math.abs(ans)	;}
System.out.println(Arrays.toString(Array2));

}
	}
