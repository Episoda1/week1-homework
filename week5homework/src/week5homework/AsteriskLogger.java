package week5homework;

class AsteriskLogger implements Logger {
	 
	 
		  public void Log(String str){
		    System.out.println("***" + str + "***"); 
		  }
		  public void Error(String str){
		    String res = "***" + "OwLordDontBreak " + str + "***"; 

		    String stars = "";
		    for (int i=0; i<res.length(); i++) stars += "*"; 

		    System.out.println( 
		        stars + 
		        "\n" + res +
		        "\n" + stars 
		        );
}
	 }

