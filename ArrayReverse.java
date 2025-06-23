import java.util.Arrays;
class ArrayReverse	
	{
public static void main(String[] args)
		{
		int Array[]={10,20,30,40,50};
		int Temp=Array[Array.length-1];
		Array[Array.length-1]=Array[0];
		Array[0]=Temp;
//System.out.println(Array.toString());
}
for(int i=0;i<=Array.length;i++)
{
System.out.println(Array[i]);
   		}
}
	}