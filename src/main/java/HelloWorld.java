/**
 * 
 */

import static spark.Spark.*;

/**
 * @author chris
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       get("/hello", (req, res) -> "Hello World");
	       
	       get("/stop", (request, response) -> {
	    	   stop();
	    	   return "Stopped server";
	    	});
	}

}
