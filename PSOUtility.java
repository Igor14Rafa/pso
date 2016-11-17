// just a simple utility class with auxiliary functions
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
public class PSOUtility {
	public static int getMinPos(double[] list) {
		int pos = 0;
		double minValue = list[0];

		for(int i=0; i<list.length; i++) {
			if(list[i] < minValue) {
				pos = i;
				minValue = list[i];
			}
		}

		return pos;
	}
	
	public static double[] getPricesHigh(){
		double[] prices_high = new double[PSOConstants.PROBLEM_DIMENSION];
		Scanner scanner;
		try {
			scanner = new Scanner(new FileReader("C:\\Users\\computacao-CCN\\Documents\\GitHub\\pso\\prices_high.txt")).useDelimiter("\\n");
			int i = 0;
			while(scanner.hasNext()){
				prices_high[i] = Double.parseDouble(scanner.next());
				i++;
			}
			scanner.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return prices_high;
	}
	
	public static double[] getPricesLow(){
		double[] prices_low = new double[PSOConstants.PROBLEM_DIMENSION];
		Scanner scanner;
		try {
			scanner = new Scanner(new FileReader("C:\\Users\\computacao-CCN\\Documents\\GitHub\\pso\\prices_low.txt")).useDelimiter("\\n");
			int i = 0;
			while(scanner.hasNext()){
				prices_low[i] = Double.parseDouble(scanner.next());
				i++;
			}
			scanner.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return prices_low;
	}
	
	public static double[] getLocationHigh(){
		double[] location_high = new double[PSOConstants.PROBLEM_DIMENSION];
		Scanner scanner;
		try {
			scanner = new Scanner(new FileReader("C:\\Users\\computacao-CCN\\Documents\\GitHub\\pso\\location_high.txt")).useDelimiter("\\n");
			int i = 0;
			while(scanner.hasNext()){
				location_high[i] = Double.parseDouble(scanner.next());
				i++;
			}
			scanner.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return location_high;
	}
	
	public static double[] getLocationLow(){
		double[] location_low = new double[PSOConstants.PROBLEM_DIMENSION];
		Scanner scanner;
		try {
			scanner = new Scanner(new FileReader("C:\\Users\\computacao-CCN\\Documents\\GitHub\\pso\\location_low.txt")).useDelimiter("\\n");
			int i = 0;
			while(scanner.hasNext()){
				location_low[i] = Double.parseDouble(scanner.next());
				i++;
			}
			scanner.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return location_low;
	}
}
