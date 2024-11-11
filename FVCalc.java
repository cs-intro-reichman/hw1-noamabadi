// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int money = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);

		int fValue = (int)(money * Math.pow(rate / 100 + 1, years)); 

		System.out.println("After " + years + " years" + "," + " a" + " $" + money + " saved" + " at " + rate + "%" + " will " + "yield " + "$" + fValue);
	}

}