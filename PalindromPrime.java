class PalindromPrime{
public static void main(String[] args){	
for(int i=0;i<=100;i++){
int number=i;
int sum=0;
int temp=number;
while(temp!=0){
	sum*=10;
	sum+=temp%10;
	temp/=10;
}
if(sum==number){
System.out.println(number +"  ==Number Palindrom number ");
	}
else{
System.out.println(number+"  == Not Palindrom");
	}
		}

		}
	  }