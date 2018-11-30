package finbarre.Playing_with_digits;

public class DigPow {

	static long digPow(int n, int p) {

		String number = String.valueOf(n);
		char[] numberArr = number.toCharArray();
		double sum = 0;
		for(int i=0;i<number.length();i++) {
			sum=sum+Math.pow(((double) (Character.getNumericValue(numberArr[i]))), Double.valueOf(p));
			p++;
		}
		if(sum%Double.valueOf(n)==0) return (long) (sum/Double.valueOf(n));

		return -1;
	}

}
