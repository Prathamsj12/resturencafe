class Palindrom1{
public static void main(String[] args)
	{
		int n=123;
		int sum=0;
		int temp=n;
		int count=0;
		int last=81;
while(temp!=0)
	{
		sum*=10;
		sum+=temp%10;
		temp/=10;
	}
if(sum==n)
	count++;
if(count==last){
	System.out.println(count+"the palindrom number is "+a);
	break;
	}
	a++;
		}
}