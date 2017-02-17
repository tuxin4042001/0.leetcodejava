package threePower;
import java.lang.Math;

public class threePower {
public static boolean threePower(int n){
	int power = 0;
	int i = 1;
	while(power<Integer.MAX_VALUE){
		System.out.println(i);
		System.out.println((int)Math.pow(3, i));
		if((int)Math.pow(3, i) >= Integer.MAX_VALUE){
			power = (int)Math.pow(3, i-1);
			break;
		}
		else power = (int)Math.pow(3, i);
		i++;
	}
	System.out.println(power);
	
	if(power%n==0)return true;
	return false;
}

public static boolean twoPower(int n){
	int power = 0;
	int i = 1;
	while(power<Integer.MAX_VALUE){
		System.out.println(i);
		System.out.println((int)Math.pow(2, i));
		if((int)Math.pow(2, i) >= Integer.MAX_VALUE){
			power = (int)Math.pow(2, i-1);
			break;
		}
		else power = (int)Math.pow(2, i);
		i++;
	}
	System.out.println(power);
	
	if(n>0&power%n==0)return true;
	return false;
} 

public static void main(String args[]){
	int n = 32;
	boolean result = threePower(n);
	System.out.println(result);
}
}
