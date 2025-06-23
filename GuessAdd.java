class GuessAdd{
public static void main(String [] args){
int Array[]={14,17,6,23,20,15,24,18,11}; 
int key=26;
for(int i=0;i<Array.length-1;i++){
 	for(int j=i+1;j<Array.length-1;j++){
		if(key==Array[i]+Array[j])
			System.out.println(Array[i]+"\t"+Array[j]);
		}
	}
	
	}
}