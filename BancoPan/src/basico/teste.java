package basico;

public class teste {
   public static void main(String[] args) {
	
	String x = "nome1";
	String y = "nome2";
	String z = "nome3";
	String[] w = {x,y,z};
    
    if (x == "nome2" || y == "nome1" || z == "nome2" ) {
        System.out.println("valor correto");
    }
    else {
    	System.out.println("valor incorreto");
    }
    
    if(x.equals(w[2]) || y.equals(w[1]) || z.equals(w[1])) {
    	System.out.println("ok");
    }
    else {
    	System.out.println("não ok");
    }
    
    int[] nums = new int[10];
    nums[0]=0;
    nums[1]=1;
    nums[2]=2;
    nums[3]=3;
    
    for (int i : nums) {
		 System.out.print(nums[i] + ", ");
	}
   
}
    
}
