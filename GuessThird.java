class GuessThird{	
public static void main(String[] args){
int Array[]={14,17,6,23,20,15,24,18,11,2,9,22,12,28,10};
int key=70;
for(int i=0;i<Array.length-2;i++){
	for(int j=i+1;j<Array.length-1;j++){	
		for(int k=j+1;k<Array.length;k++)
				if(key==Array[i]+Array[j]+Array[k])
			System.out.println(Array[i]+"\t "+Array[j]+" \t"+Array[k]);	
				}	
		}
}
	}