class PrimePalindrom{
public static void main(String [] args){
int n=121;
int temp=n;
int sum=0;
int number=73;
for(int i=0;i<=100;i++)
	{
	while(temp!=0){
		sum*=10;
		sum+=temp%10;
		temp/=10;
			}
if(sum==n){
	if(i==number){
System.out.println(n"palindrom");
		}
}
			}
	}
		}