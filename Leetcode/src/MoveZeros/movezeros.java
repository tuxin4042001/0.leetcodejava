package MoveZeros;

public class movezeros {

    public static int[] movezeros(int[] num){
    int[] num1 = new int[num.length];
    int i=0;
    int j=0;
    
    /**
     * 利用另外一个数组存储非零元素，将零值放在最后即可;
     */
	for(int k=0;k<num.length;k++){
		if(num[k]!=0){
			num1[j]=num[k];
			j++;
		}		
	}
	for(int x=j;x<num.length;x++){
		num1[x]=0;
	}
	return num1;
   }
   public static void main(String args[]){
	   int[] num = {1,2,0,3,4,0,5,6,7};
	   int[] num2 = movezeros(num);
	   for(int x:num2){
		   System.out.println(x);
	   }
   }
    
}