package _190_reverseBits;

public class reverseBits {
        public int reverseBits(int n) {
            int result = 0;
            if(n==0) return 0;
            for(int i = 0; i < 32; i++){
            	result <<= 1;
            	if((n&1)==1){
            		result++;
            	}
            	n >>= 1;
            }
            return result;
        }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int j = i<<1;
		int k = i>>1;
		System.out.println(j);
		System.out.println(k);
	}
}
