package _70_climbingStairs;

public class climbStairs2 {
    public int climbStairs(int n) {
        int[] stair = new int[n + 1];
        stair[0] = 1;
        stair[1] = 1;
        for(int i = 2; i <= n; i++){
        	stair[i] = stair[i - 1] + stair[i - 2];
        }
        return stair[n];
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
