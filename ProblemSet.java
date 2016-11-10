// this is the problem to be solved
// to find an x and a y that minimize the function below:
// f(x, y) = (2.8125 - x + x * y^4)^2 + (2.25 - x + x * y^2)^2 + (1.5 - x + x*y)^2
// where 1 <= x <= 4, and -1 <= y <= 1

// you can modify the function depends on your needs
// if your problem space is greater than 2-dimensional space
// you need to introduce a new variable (other than x and y)
import java.util.Random;
public class ProblemSet {
//	public static final double LOC_X_LOW = 1;
//	public static final double LOC_X_HIGH = 4;
//	public static final double LOC_Y_LOW = -1;
//	public static final double LOC_Y_HIGH = 1;
	public static final double VEL_LOW = -1;
	public static final double VEL_HIGH = 1;
	
	public static final double PRICES_HIGH[] = {0.114, 0.104, 0.093, 0.093, 0.092, 0.093, 0.094, 0.093, 0.100, 0.113, 0.138, 0.138, 
	0.138, 0.138, 0.138, 0.116, 0.111, 0.138, 0.138, 0.146, 0.189, 0.222, 0.224, 0.207 };
	
	public static final double PRICES_LOW[] = {0.140, 0.131, 0.125, 0.125, 0.122, 0.117, 0.117, 0.119, 0.122, 0.131, 0.136, 0.137, 
	0.129, 0.136, 0.133, 0.124, 0.125, 0.137, 0.197, 0.209, 0.215, 0.215, 0.205, 0.189 }; 


	public static final double ERR_TOLERANCE = 1E-20; // the smaller the tolerance, the more accurate the result,
	                                                  // but the number of iteration is increased
	public static double evaluate(Location location) {

		double result = 0;
		double x[] = new double[PSOConstants.PROBLEM_DIMENSION];
		
		//high and low values for the prices
		double loc_high[] = {0.008, 0.007, 0.008, 0.007, 0.006, 0.010, 0.006, 0.007, 0.008, 0.007, 0.011, 
				0.013, 0.009, 0.012, 0.013, 0.006, 0.009, 0.014, 0.008, 0.015, 0.015, 0.014, 0.021, 0.015 };
		
		double loc_low[] = {0.008, 0.011, 0.011, 0.008, 0.011, 0.011, 0.006, 0.009, 0.012, 0.008, 0.014, 
				0.011, 0.008, 0.013, 0.010, 0.007, 0.012, 0.010, 0.015, 0.018, 0.015, 0.015, 0.019, 0.015 };
		
//		double x = location.getLoc()[0]; // the "x" part of the location
//		double y = location.getLoc()[1]; // the "y" part of the location

//		result = Math.pow(2.8125 - x + x * Math.pow(y, 4), 2) +
//				Math.pow(2.25 - x + x * Math.pow(y, 2), 2) +
//				Math.pow(1.5 - x + x * y, 2);
		
		
		for(int i = 0; i < PSOConstants.PROBLEM_DIMENSION; i++){
			Random num = new Random();
			x[i] = loc_low[i] - num.nextDouble()*loc_high[i];
		}
		
		for(int i = 0; i < PSOConstants.PROBLEM_DIMENSION; i++){
			result = x[i] - PSOConstants.UTILITY_VALUE;
		}
		
		return result;
	}
}
