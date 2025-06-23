class OddEven{
public static void main(String [] args){
int Array[]={10,20,30,40,50,60,70,80,90};
int OddSum=0;
int EvenSum=0;
int AvgOdd=0;
int AvgEven=0;
	for(int i=0;i<Array.length;i++){
	if(i%2==0){
	AvgOdd=(OddSum+=Array[i])/Array.length;
			}
	else{
	AvgEven=(EvenSum+=Array[i])/Array.length;
			}
	
			}
System.out.println(AvgOdd);
System.out.println(AvgEven);
	}
		}