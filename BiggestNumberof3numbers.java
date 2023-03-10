public class BiggestNumberof3numbers{

public static void main (String[] args) {
	
	int a=5, b= 10, c=13;
	if (a>=b && a>=c){
		System.out.println("a is bigger number "+a);
				
	} else if (b>=c){
		//b>=a is not required as it is already been checked in first IF condition
		System.out.println ("b is bigger number "+b);
		
	} else {
		System.out.println ("c is bigger number "+c);
	}
		
}
		
	
}

