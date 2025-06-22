package singletonpattren;

public class TestLogger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Logger logger1 = Logger.getInstance();
	        Logger logger2 = Logger.getInstance();

	        logger1.log("First log message");
	        logger2.log("Second log message");

	        System.out.println("Are both instances same? " + (logger1 == logger2));
	}

}
