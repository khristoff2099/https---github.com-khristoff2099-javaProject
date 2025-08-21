public class sumPairIndexes {
    public static void main(String[] args) {
       int[] a = {1,3,6,9,10};
       int s = 0;
       int m = a[0];
       int m2 = a[0];
       for(int i=0;i<a.length;i++){
            if(a[i] > m){
                m2 = m;
                m = a[i];
            }else{ 
            	if(a[i] > m2){
            		m2 = a[i];
                }
            }
       }
       s += m + m2;
       System.out.println(s);
    }
}