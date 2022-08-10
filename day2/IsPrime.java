package week1.day2;

public class IsPrime {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 25;
		boolean  isPrime = true ;
		for (int i=2;i<num;i++) {
			if (num %i==0) {
				 isPrime = false ;
				}
			if (isPrime) {
				System.out.println("the num is prime -" +num);
			}
			else {
				System.out.println("the num is not prime -"+ num);
			}
		}
		
}
}

