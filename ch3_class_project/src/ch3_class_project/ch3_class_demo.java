package ch3_class_project;

public class ch3_class_demo {

	public static void main(String[] args) {
		// define variables
		int a = 5;
		int b = 11;
		double d1 = 5.5;
		double d2 = 2.1;
		
		
		//perfrom binary operations
		int sum1 = a + b;
		double sum2 = d1 + d2;
		System.out.println(sum1);
		System.out.println(sum2);
		
		//perform unary operations
		a++;
		System.out.println(a);
		d1--;
		System.out.println(d1);
		
		//compound assignments
		int a1 = 10;
		// increment by 1
		a1 = a1 + 5;
		a1++; // ++ is just adding 1
		a1 += 5; // += is adding whatever value, here it is 5.
		//Math and formating
	
		//rounding a number
		double d3 = 25.678; //rounds up if .5 or higher, and down for anything lower than .5
		System.out.println(Math.round(d3));
		
		// Old school rounding......which sucks
		double rd1 = ((double)Math.round(d3*100))/100;
		System.out.println(rd1);
		
		// Random Method (100 sided dice roller)
		double r1 = Math.round(Math.random()*100);

		System.out.println(r1);
		
		// max and min
		
		System.out.println(Math.max(2,8));
		System.out.println(Math.min(2,8));
		
		double test2 = 212 ;
		test2 -= 32 ;
		double test1 = 5 ;
		test1 /= 9 ;
		double fValue = test1 * test2 ;
		double test4 = Math.round(fValue) ;
		System.out.println(test4);
}
	}

	

