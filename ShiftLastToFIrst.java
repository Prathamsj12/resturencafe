import.java.util.Arrays;
import.java.util.Math;
class ShiftLastToFirst{
public static void main(String [] args)
	{
int a[]={124,165,6389,746,423,797,354,32,746,523,211,5,21};
for(int i=0; i<Array.length;i++){
	int last=a[i]%10;
	a[i]/=10;
	int temp=a[i],length=0;
	while(temp!=0){
	length++;
	temp/=10;
  			}
last*=Math.pow(10,length);
last+=a[i];
a[i]=last;
		}
System.out.println(Arrays.toString(a));
	}
}