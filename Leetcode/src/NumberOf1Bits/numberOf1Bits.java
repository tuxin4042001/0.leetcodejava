package NumberOf1Bits;

public class numberOf1Bits {
	public int numberOf1Bits(int num){
		int count = 0;
		if(num == 0) return 0;
		while(num != 0){
			if((num & 1) == 1){
				count++;
			}
			num >>>= 1 ;
		}
		return count;
	}
	
	public static void main(String args[]){
		int num = 7;
		numberOf1Bits number = new numberOf1Bits();
		int number_of_1 = number.numberOf1Bits(num);
		System.out.println(number_of_1);
	}

}
