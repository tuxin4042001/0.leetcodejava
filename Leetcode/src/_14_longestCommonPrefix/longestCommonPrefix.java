package _14_longestCommonPrefix;

public class longestCommonPrefix {
	//�ⷨһ��һ��һ���ַ��Ƚϣ��ҳ����longest common prefix
	//     a.Ϊ�˱�������out of bound���⣬����strs[]��strs[i]��̳���
	//     b.��index <��maxLen�������£���������strs[i].charAt(index)�����Ƿ���һ����strs[i].charAt(index) != strs[0].charAt(index)
	//       �����strs[i].charAt(index) != strs[0].charAt(index)�����ҵ���longest common prefix strs[i].substring(0, index)
	//       ���û��strs[i].charAt(index) != strs[0].charAt(index)����̵�strs[i]��Ӧ����longest common prefix��
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
    
    //�ⷨ��������String.indexOf(prefix)���String.subString(int start, int end)���
    //     �ؼ��������String.indexOf(prefix)���÷����������ֵ=0��˵��prefix��ǰ׺���������ֵ!=0��˵��prefix����ǰ׺
    //     ���prefix����ǰ׺������prefix = prefix.substring(0, prefix.length() - 1)����һλ������һ��
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
		// TODO �Զ����ɵķ������

	}

}
