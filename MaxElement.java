class MaxElement{
public static void main(String[] args){
int Array[]= {534,125,437,1247,312,29,26,12,84};
int Temp=Array[0];
for(int i=0; i<Array.length;i++){
	if(Temp<Array[i]){
Temp=Array[i];
System.out.println("Your Maximun Element is="+Array[i]);
				}
		}
	}
		}