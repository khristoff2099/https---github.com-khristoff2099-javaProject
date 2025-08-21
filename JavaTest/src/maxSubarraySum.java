
public class maxSubarraySum{
    public static void main(String args[]){
        int a[] = {2,-4,1,9,-6,7,-3};
        System.out.println(max(a));
    }
    public static int max(int[] a){    	
    	 int m=Integer.MIN_VALUE;                 
         for(int i=0;i<a.length;i++){           
             int s=0;             
             for(int j=i;j<a.length;j++){
                 s += a[j];                
                 if(s>m){
                     m=s;
                 }
             }
         }
         return m;
    }
}