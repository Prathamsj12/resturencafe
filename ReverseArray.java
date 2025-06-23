class ReverseArray{
public static void main(String[] args){
int Array[]={1,7,4,9,2};
for(int i=0;i<Array.length;i++){
     Array[i+1]=Array[Array.length-i] ;	
	}
for(int i=0;i<Array.length;i++)
System.out.println((Array[i]));
}

	}
