package _14_longestCommonPrefix;

public class longestCommonPrefix {
	//解法一：一个一个字符比较，找出最长的longest common prefix
	//     a.为了避免数组out of bound例外，先找strs[]中strs[i]最短长度
	//     b.在index <　maxLen的条件下，遍历所有strs[i].charAt(index)，看是否有一样的strs[i].charAt(index) != strs[0].charAt(index)
	//       如果有strs[i].charAt(index) != strs[0].charAt(index)，就找到了longest common prefix strs[i].substring(0, index)
	//       如果没有strs[i].charAt(index) != strs[0].charAt(index)，最短的strs[i]就应该是longest common prefix了
    public String longestCommonPrefix(String[] strs) {
    	if(strs.length == 0) 
    		return "";
    	
    	int minLen = strs[0].length();
    	for(int i = 0; i < strs.length; i++){
    		minLen = Math.min(minLen, strs[i].length());
    	}
    	
        int index = 0;
        while(index < minLen){
            for(int i = 0; i < strs.length; i++){
            	if(strs[i].charAt(index) != strs[0].charAt(index))
            		return strs[i].substring(0, index);
            }
        	index++;
        }

        return strs[0].substring(0, index);
    }
    
    //解法二：利用String.indexOf(prefix)结合String.subString(int start, int end)求解
    //     关键在于理解String.indexOf(prefix)的用法，如果返回值=0，说明prefix是前缀，如果返回值!=0，说明prefix不是前缀
    //     如果prefix不是前缀，再拿prefix = prefix.substring(0, prefix.length() - 1)【减一位】来试一下
    public String longestCommonPrefix2(String[] strs) {
        if(strs.length == 0)
        	return "";
        
        String prefix = strs[0];
        int index = 1;
        while(index < strs.length){
        	while(strs[index].indexOf(prefix) != 0){
        		prefix = prefix.substring(0, prefix.length() - 1);
        	}
        	index++;
        }
        return prefix;
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
