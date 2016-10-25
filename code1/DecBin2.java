class DecBin2{
	public static void main (String a[]){
	
	int n;
	String bin; String hex;
	for (n = 0; n <= 64; n++){
			 bin = Integer.toBinaryString(n);
			 // add zeros
			 if(bin.length() ==5){
				bin = "000"+bin; 
			 }	 
			 hex = Integer.toHexString(n);
			 System.out.println(bin+" ");
			 //System.out.println(bin.length());
			 
				 
			 //System.out.println(n+" "+hex+" "+bin);
			 // concatination
			 //java DecBin > DecbinOut.			
		 }
		
	}
}

/*
 * 
 *  System.out.print(bin);
			 System.out.print(" ");
			 System.out.print(hex);
			 System.out.println();
 *
 */
