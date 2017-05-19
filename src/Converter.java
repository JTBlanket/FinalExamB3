import javax.swing.JOptionPane;

public class Converter {
	  int sizeOfIntInHalfBytes = 2;
	  int numberOfBitsInAHalfByte = 4;
	  int halfByte = 0x0F;
	   char[] hexDigits = { 
	    '0', '1', '2', '3', '4', '5', '6', '7', 
	    '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

	public String changeToHex(int intBase10) {
		//String answer = "";
		// code for you to complete
		
		
		
		StringBuilder hex = new StringBuilder(sizeOfIntInHalfBytes);
	    hex.setLength(sizeOfIntInHalfBytes);
	    for (int i = sizeOfIntInHalfBytes - 1; i>= 0;--i){
	    	if(intBase10 < 0 || intBase10 > 255){
		    	  JOptionPane.showMessageDialog(null, "Error range outside of 0-255");
		  			
		      }
	    int j = intBase10 & halfByte;
	      hex.setCharAt(i, hexDigits[j]);
	      intBase10 >>= numberOfBitsInAHalfByte;
	      
	      
	    }
	    
	    return hex.toString(); 
	    
		// basic test
		//for(int i=intBase10; i>=0;){
		//if (intBase10 == 0)
		//	answer = "00";
		//if (intBase10 == 255)
		//	answer = "FF";
		//return answer;
	//	}
		//return answer;
	}

}
