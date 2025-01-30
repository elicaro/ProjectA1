package demo1;

public class DemoTest1 {
	
	public static void main (String args[]) {
		System.out.println("Java");
		
		String brand = "Puma";
		String slogan = "";
		boolean isSloganFound = true;
		
		switch (brand) {
		case "Nike":
		slogan = "Just Do It";
		break;
		case "Adidas":
		slogan = "Impossible is Nothing";	
		break;
		case "Puma":
		slogan = "Forever Faster";	
		break;
		case "Reebok":
		slogan = "Not Found";
		break;
		default:
			 slogan = "Not Found";
			 isSloganFound = false;
	    int x = 10;
	     int y = 20;

		if(x > y){
			System.out.println("Greater");
		}else{
			System.out.println("Less");
		}

	// this is coming from github
	// practing pulling
		
		
		}
		if (isSloganFound == true) {
			System.out.println (brand + "'s slogan is " + slogan);
		}else {
			System.out.println(brand +"'s slogan " + slogan +" . This message suppose to give me hard time ");
		}
		
		
		
	}
}
