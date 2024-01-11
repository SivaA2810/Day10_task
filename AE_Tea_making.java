package javaTask_C_day_10;

public class AE_Tea_making {
	 public static void main(String[] args) {
	        // Create an array of Tea objects
		 	AA_Tea teas = new AA_Tea();
		 	AA_Tea blacktea= new AB_BlackTea(); 
		 	AA_Tea greentea = new AD_GreenTea();
		 	AA_Tea herbtea = new AC_herbalTea();
		 	
		 	
		 		teas.prepareTea();
	            teas.addMilk();
	            teas.addSugar();
	            System.out.println(); 
	            
	            blacktea.prepareTea();
	            System.out.println();
	            
	            greentea.prepareTea();
	            System.out.println();
	            
	            herbtea.prepareTea();
	            
	            
	        }
}
