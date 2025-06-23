class SecondMax{
public static void main(String [] args){
int Array[]={534,124,437,1247,327,29,12,84};
int max=0,Secmax=0;
for(int i=0; i<=Array.length;i++){
	if(max<Array[0])
	{
	smax=max;
	max=Array[i]	;
			}
else{
	if(smax<Array[i] && Array[i]!=max){
System.out.println("Max"+max);
			}
		}
	}
}
	}