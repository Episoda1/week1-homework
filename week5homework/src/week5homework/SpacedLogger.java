package week5homework;

class SpacedLogger implements Logger {
	 
	 
		  public void Log(String str){
		    for (int i=0; i<str.length(); i++){ 
		      char curr = str.charAt(i); 
		      System.out.print(curr + " "); 
		    }
		    System.out.println(); 
		  }



		  public void Error(String str){
		    System.out.print("Error: "); 
		    for (int i=0; i<str.length(); i++){ 
		      char curr = str.charAt(i);
		      System.out.print(curr + " ");
		    }
		    System.out.println();
		  }
		  }
