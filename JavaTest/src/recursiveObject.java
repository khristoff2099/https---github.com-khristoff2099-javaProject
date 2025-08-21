public class recursiveObject {
    public static void main(String[] args) {
        Object[] a = {"blue", "yellow", "red", new Object[]{"helicopter", "blimp", new Object[]{"biplane", "seaplane"}}};
        printArray(a,0,"");
    }
    public static void printArray(Object[] a,int i,String s) {
    	if(i == a.length){
    		return;
    	}
    	if(a[i] instanceof Object[]){
    		printArray((Object[]) a[i],0,s+i+".");
    	}else{
    		System.out.println (s+i+" "+a[i]);
    		printArray(a,i+1,s);
    	}
    }
}
