import java.util.Arrays;
class CountAdd{
public static void main(String [] args){
int Array[]={14,17,6,23,20,20,15,24,18,11,2,9,22,12,4,28,10};
for(int i=0;i<=Array.length;i++){
	int length=0;
	int n=i+1;
	while(n!=0){
		length++;
		n/=10;	
		}
	Array[i]*=Math.pow(10,length);
	Array[i]+=i+1;
		
	}	
System.out.println(Arrays.toString(Array));
		}
	}
