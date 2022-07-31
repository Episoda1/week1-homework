package week5homework;

public class App {
	
		  public static void main(String[] args){
		    
		    AsteriskLogger AL = new AsteriskLogger();
		    AL.Log("It didnt break!"); 
		    System.out.println(); 
		    AL.Error("Hello"); 
		    System.out.println();

		    SpacedLogger SL = new SpacedLogger();
		    SL.Log("Hello"); 
		    System.out.println(); 
		    SL.Error("Hello"); 
		    System.out.println(); 
}
}

