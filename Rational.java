//Team Hello -- Leo Au-Yeung, Sungbin Kim
//APCS1 pd10
//HW32 -- Irrationality Stops Here
//11-17-2015

public class Rational {
	
	private int numerator;
	private int denominator;
	
	public Rational() {
		numerator = 0;
		denominator = 1;
	}
	
	public Rational (int num, int denom) {
		try {
			numerator = num;
			denominator = denom;
		}
		catch (Exception e) {
			numerator = 0;
			denominator = 1;
		}
	}
	
	public String toString() {
		return numerator + "/" + denominator;
	}
	
	public float floatValue() {
		return ((float) numerator) / ((float) denominator);
	}
	
	public void multiply ( Rational n ) {
		numerator = numerator * n.numerator;
		denominator = denominator * n.denominator;
	}
	
	public void divide ( Rational n ) {
		numerator = numerator / n.numerator;
		denominator = denominator / n.denominator;
	}
	
	public static void main (String[] args) {
		Rational r = new Rational(2,3); //Stores the rational number 2/3
		Rational s = new Rational(1,2); //Stores the rational number 1/2
		r.multiply(s); //Multiplies r by s, changes r to 2/6.  s remains 1/2;
		System.out.println(r); //Should be 2/6
		r.divide(s); //Divides r by s, changes r to 2/3. s remains 1/2;
		System.out.println(r); //Should be 2/3
	}
}
