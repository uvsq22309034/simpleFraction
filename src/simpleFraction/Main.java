package simpleFraction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("Je suis une Fraction");
		
		Fraction f = new Fraction(50,1000);
		Fraction f1 = new Fraction(500,1000);
		System.out.println(f.testEgalite(f1));*/
		
		 Number aNumber = java.math.BigDecimal.ONE;
		 Number anotherNumber = new Fraction(1, 2);
		 assert java.lang.Math.abs(aNumber.doubleValue() + anotherNumber.doubleValue() - 1.5) < 1E-8;



	}

}
