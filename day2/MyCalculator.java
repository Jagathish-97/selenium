package week1.day2;

public class MyCalculator  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj = new Calculator();
		int add = obj.add( 5, 6 ,  10);
		System.out.println(add);
		int sub = obj. sub(10,5);
		System.out.println(sub);
		double mul = obj. mul(10,5);
		System.out.println(mul);
		float div =obj.div(10,5);
		System.out.println(div);
		
		

	}

}
