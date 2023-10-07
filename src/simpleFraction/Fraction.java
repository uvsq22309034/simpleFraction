package simpleFraction;

public class Fraction extends Number {
	private int num;
	private int deno;
	private static final Fraction ZERO = new Fraction(0,1);
	private static final Fraction UN = new Fraction(0,1);
	 

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDeno() {
		return deno;
	}

	public void setDeno(int deno) {
		this.deno = deno;
	}

	public Fraction(int num, int deno) {
	
		this.num = num;
		this.deno = deno;
	}

	public Fraction(int num) {
		this.deno=1;
		this.num = num;
	}

	public Fraction() {
		this.deno=1;
		this.num=0;
	}

	/*public String toString() {
		return "Je suis une fraction";
	}*/
		
	public double doubleValue() {
		return this.doubleValue();
	}
	
	public Fraction add(Fraction f) {
		int num = this.num*f.deno + this.deno*f.num;
		int deno = this.deno*f.deno;
		
		return new Fraction(num,deno);
	}
	public Fraction SimplifierFraction() {
		
	       int temp1 = this.num;
	       int temp2 = this.deno; 

	       while (this.num != this.deno){
	         if(this.num > this.deno)
	            this.num = this.num - this.deno;
	         else
	            this.deno = this.deno - this.num;
	       }      

	      int numReduit = temp1 / this.num ;
	      int denoReduit = temp2 / this.num;
	      
	      return new Fraction(numReduit,denoReduit);
	}
	public boolean testEgalite(Fraction f) {
		
		Fraction f1Simplifier = new Fraction();
		Fraction f2Simplifier = new Fraction();
		f1Simplifier= this.SimplifierFraction();
		f2Simplifier = f.SimplifierFraction();
		
		if(f1Simplifier.num==f2Simplifier.num && f1Simplifier.deno==f2Simplifier.deno) {
			return true;
		}
		return false;
		
	}

	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return 0;
	}
}
