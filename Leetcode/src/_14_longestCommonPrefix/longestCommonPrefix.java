package _14_longestCommonPrefix;

public class longestCommonPrefix {
	//解法二改进，还是先找最短strs[index]，然后再找longest common prefix，如果不找最短strs[index]可能会index out of bound
    public String longestCommonPrefix(String[] strs) {
    	if(strs.length == 0) return "";
    	int index = 0;
    	for(int i = 1; i < strs.length; i++){
    		if(strs[index].length() > strs[i].length()){
    			index = i;
    		}
    	}
        for(int i = 0; i < strs[index].length(); i++){
        	for(int j = 0; j < strs.length; j++){
        		if(strs[j].charAt(i) == strs[0].charAt(i)){
        			continue;
        		}else{
        			return strs[j].substring(0, i);
        		}
        	}
        }
        return strs[index];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
