package gov.nasa.jpf.symbc;

public class MinimalSymbolicDoubleTestCase {
	 public static int baseTestCase(double x) {
		double replaceTarget = Debug.makeSymbolicReal("x0");
		if (x > replaceTarget) {
			return 1;
		} else {
			return 0;
		}
	 }
	 public static void main(String[] argrs) {
		 baseTestCase(1.0);
	 }
	 

}
