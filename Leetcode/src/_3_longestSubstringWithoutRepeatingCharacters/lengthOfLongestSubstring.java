package _3_longestSubstringWithoutRepeatingCharacters;

public class lengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int count = 0;
        int index = 0;
        int tempCount = 0;
        while(index < s.length()){
            int[] ascArray = new int[256];
            tempCount = 0;
            for(int i = index;  i < s.length(); i++){
            	if(ascArray[(int)s.charAt(i)] == 0){
            		ascArray[(int)s.charAt(i)]++;
            		tempCount++;
            	}else if(ascArray[(int)s.charAt(i)] == 1){
            		break;
            	}
            	count = Math.max(count, tempCount);
            }
            index++;
        }
        return count;
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		char c = 'a';
//		char b = 'A';
//		System.out.println((int)c);
//		System.out.println((int)b);
		String s = "dvdf";
		System.out.println(lengthOfLongestSubstring(s));

	}

}
