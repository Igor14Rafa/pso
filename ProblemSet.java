// this is the problem to be solved
// to find an x and a y that minimize the function below:
// f(x, y) = (2.8125 - x + x * y^4)^2 + (2.25 - x + x * y^2)^2 + (1.5 - x + x*y)^2
// where 1 <= x <= 4, and -1 <= y <= 1

// you can modify the function depends on your needs
// if your problem space is greater than 2-dimensional space
// you need to introduce a new variable (other than x and y)
import java.util.Random;
public class ProblemSet {
	
	public static final double VEL_LOW = -1;
	
	public static final double VEL_HIGH = 1;
	
	public static final double PRICES_HIGH[] = PSOUtility.getPricesHigh();
	
	public static final double PRICES_LOW[] = PSOUtility.getPricesLow(); 

	public static final double ERR_TOLERANCE = 1E-20; // the smaller the tolerance, the more accurate the result,
	                                                  // but the number of iteration is increased
	public static double evaluate(Location location) {

		double result = 0;
		
		//high and low values for the prices
		double loc_high[] = PSOUtility.getLocationHigh();
		
		double loc_low[] = PSOUtility.getLocationLow();		
		
		for(int i = 0; i < PSOConstants.PROBLEM_DIMENSION; i++){
			Random num = new Random();
			location.getLoc()[i] = loc_low[i] - num.nextDouble()*loc_high[i];
		}
		
		for(int i = 0; i < PSOConstants.PROBLEM_DIMENSION; i++){
			result = location.getLoc()[i] - PSOConstants.UTILITY_VALUE;
		}
		
		return result;
	}
}
