package gov.nasa.jpf.symbc;

public class MinimalSymbolicIntTestCase {
	 public static int baseTestCase(int x) {
		int replaceTarget = (int) Debug.makeSymbolicInteger("x0");
		if (x > replaceTarget) {
			return 1;
		} else {
			return 0;
		}
	 }
	 public static void main(String[] argrs) {
		 baseTestCase(1);
	 }
	 

}
