public class matrix {
    public static void main(String[] args) { 
    	int [][] m = {{6,7,5},{3,8,4},{1,0,2}};    	                
        int[] d = new int[m.length];        
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){            	
            	if(i==j){         
                    System.out.println(d[i] = m[i][j]);  
                }                
            }       
        }            
    }
}