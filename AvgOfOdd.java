class AvgOfOdd{
public static void main(String[] args){
int Array[]={10,20,30,40,50,60};
int avgodd=0;
int sum=0;

for(int i=0;i<Array.length-1;i++){
	if(i%2!=0){
	avgodd=(sum+=Array[i])/Array.length;
	}
 		}
System.out.println(avgodd);

}
		}