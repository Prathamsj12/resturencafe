WAP Replace elements their first and last digit
import java.util.Arrays;
class ReplaceFirstLast{
public static void main(String []args){
int Array[]={124,651,3896,467,234,977,543,467,235,112,5,12};
	//{14,61,36,467,97,53,47,25,12,5,12};
for(int  i=0; i<=a.length;i++)
	{
		int last=Array[i]%10;
		int first=0;
		if(Array[i]>10)	
			{
			while(temp!=0){
				
				first=Array[i]%10;
				Array[i]/=10;
	  		}
				first*=10;
		}
				first+=last;
				Array[i]=first;
			}
System.out.println(Arrays.toString(Array))

	}
}
