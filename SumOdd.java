class SumOdd{
public static void main(String[] args){	
int Array[]={1,3,4,4,5,7};
int Sum=0;
for(int i=0;i<=Array.length-1;i++){
	if(Array[i]%2!=0)
{
	Sum+=Array[i];
	}
}
System.out.println(Sum);
}
	}