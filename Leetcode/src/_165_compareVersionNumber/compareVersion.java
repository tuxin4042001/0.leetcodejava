package _165_compareVersionNumber;

public class compareVersion {
    public int compareVersion(String version1, String version2) {
    	String[] versionArray1 = version1.split("\\.");
    	String[] versionArray2 = version2.split("\\.");
    	
    	int len = Math.min(versionArray1.length, versionArray2.length);
    	
    	for(int i = 0; i < len; i++){
    		if(Integer.parseInt(versionArray1[i]) < Integer.parseInt(versionArray2[i])){
    			return -1;
    		}else if(Integer.parseInt(versionArray1[i]) > Integer.parseInt(versionArray2[i])){
    			return 1;
    		}else{
    			return 0;
    		}
    	}
    	
    	if(versionArray1.length < versionArray2.length){
    		return -1;
    	}else if(versionArray1.length > versionArray2.length){
    		return 1;
    	}else{
    		return 0;
    	}
    }
    
    public int compareVersion2(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        
        int len = Math.max(v1.length, v2.length);
        
        for(int i = 0; i < len; i++){
        	int a1 = i < v1.length ? Integer.parseInt(v1[i]):0;
        	int a2 = i < v2.length ? Integer.parseInt(v2[i]):0;
        	if(a1 > a2){
        		return 1;
        	}else if(a1 < a2){
        		return -1;
        	}
        }
        return 0;
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String str1 = "01";
		int i = Integer.parseInt(str1);
		System.out.println(i);

	}

}
