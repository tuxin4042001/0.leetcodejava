package _204_countPrimes;

public class countPrimes {
    public int countPrimes(int n) {
    	int count = 0;
        boolean[] notPrimes = new boolean[n];
        for(int i = 2; i < n; i++){
        	if(notPrimes[i] != true){
        		count++;
        	}
        	for(int j = 2; i*j < n; j++){
        		notPrimes[i*j] = true;
        	}
        }
        return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
