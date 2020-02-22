
public class ConditionalStatementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int x=30;
		int y=20;

		if (x>y) {
			System.out.println(x + " is greater than "+ y);
		}
		else if (x<y){
			System.out.println( x+ "is less than" + y );
		}
	
	
		int a=11;
		if (a%2==0)
			System.out.println("Even number("+a+")");
		else
			System.out.println("Odd number("+a+")");
	
	}
}