import java.lang.Math;
class SumDigit{
public static void main(String args[])
{
	int Array[]={53,67,12,63,28,467,124,35};//{538}
 	for(int i=0;i<Array.length;i++){
	int first=Array[i]%10;
	int Second=Array[i]/10;
	int Sum=first+Second;
	int n=2;
	if(Sum<10)
		{

		System.out.println(Second*Math.pow(10,2)+first*Math.pow(10,1)+Sum);
			}
	else if(Sum>=10 && Sum<=20){
	System.out.println(Second*Math.pow(10,3)+first*Math.pow(10,2)+Sum);
			}


	
			}
		}
	}