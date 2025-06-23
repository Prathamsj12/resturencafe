 class PerfectNumber{
public static void main(String [] args){
int n=28;
for(int j=0;j<=n; j++)
	{
	 	n=j;
		boolean b= false;
		if(n==0 || n==1)
			b=true;
		else
		for(int i=2;i<=n/2; i++)
			if(n%i==0){
			b=true;
			break;	
	}
if(!b){
System.out.println(n+"");
			}
		}
	}
		}