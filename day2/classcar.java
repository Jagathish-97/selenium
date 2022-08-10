package week1.day2;

public class classcar {
	public void printcarbrand() {
		System.out.println("hyundai");
		}
	public String getcarcolour() {
		return "electric shadow";
		}
	public long getcarenginenumber() {
		return 2356235623562356l;
		
	}
	public int subofnumbers(int a,int b) {
		int c =a-b ;
		return c;
	}
    public int mulofnumbers(int a,int b) {
    	int c =a*b;
    	return c;
    }
    public int divofnumbers(int a, int b) {
    	int c =a/b;
    	return c;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		classcar obj= new classcar();
		obj.printcarbrand();
		String getcarcolour = obj.getcarcolour();
		System.out.println(getcarcolour);
		long getcarenginenumber = obj.getcarenginenumber();
        System.out.println(getcarenginenumber);
        int subofnumbers = obj.subofnumbers(10, 5);
        System.out.println(subofnumbers);
	    int mulofnumbers = obj.mulofnumbers(15, 25);
	    System.out.println(mulofnumbers);
	    int divofnumbers = obj.divofnumbers(25, 5);
	    System.out.println(divofnumbers);
	
	}

}
