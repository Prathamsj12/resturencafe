class primeNumber{
public static void main(String [] args){
	int a=0;last=35,first=0;
int arr[]=new int[last];
int last=0;
while(true){
boolean b=false;
if(a==0 ||a==1){
 	b=true;	
}
else{
	for(int i=2; i<=Math.sqrt(a);i++)
	if(a%i==0)
{	b=true;
	break;
		}
if(!b)
arr[arr.length-1-first++]=a;
if(first==last){
	break;
a++;
}	
System.out.println(Arrays.toString(arr));
		}
	}
				}
		}