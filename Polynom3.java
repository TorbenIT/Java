package prog1.klausur;

public class Polynom3 {

	 double coeffs[];

	 public Polynom3(double... coeffs){
		 
	     this.coeffs = coeffs;
	  }
	
	
	
	public static void main(String[] args) {
	
		Polynom3 fx = new Polynom3(1.5, 4, 1.3, -8);
		
		double[] arr = fx.coeffs;
		
		for (int i = 1; i <= arr.length; i++) {

			if (i <= 2)
				System.out.print("" + arr[i-1] + "x^" + (arr.length-i) + " + ");
			else if (i == 3)
				System.out.print("" + arr[i-1] + "x" + " ");
			else
				System.out.print("" + arr[i-1]);
	 }
	}
}
