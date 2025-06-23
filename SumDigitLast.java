import java.util.Array;
class SumDigitLast{
public static void main(String [] args)
  {
int Array[]={53,67,12,63,28,467,124,35};
	for(int i=0;i<Array.length;i++)
   	{
   		int first=Array[i]%10;
   		int second=Array[i]/10;
		int Sum=first+second;
System.out.println(Sum);
}
	}
		}