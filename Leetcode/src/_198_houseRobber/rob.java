package _198_houseRobber;

public class rob {
    public int rob(int[] nums) {
        int preNo = 0;
        int preYes = 0;
        int currNo = 0;
        int currYes = 0;
        for(int n : nums){
        	currNo = Math.max(preNo,preYes);
        	currYes = n + preNo;
        	preNo = currNo;
        	preYes = currYes;
        }
        return Math.max(preNo, preYes);
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
