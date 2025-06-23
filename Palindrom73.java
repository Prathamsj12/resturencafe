class Palindrom73{
public static void main(String [] args){
for(int j=0;j<=1000;j++){
int n=j;
int temp=n;
int sum=0;
int count=0;
int number=73;
for(int i=0;i<=100;i++)
	{
	while(temp!=0){
		sum*=10;
		sum+=temp%10;
		temp/=10;
			}

if(sum==n){
    count++;
if(count==number){
System.out.println(sum);	
	}
		}
}
		}
	}
		}