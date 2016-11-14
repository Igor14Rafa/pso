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
		double prices_high[] = {};
		Scanner scanner;
		try {
			scanner = new Scanner(new FileReader("prices_high.txt")).useDelimiter("\\n");
			while(scanner.hasNext()){
				int i = 0;
				prices_high[i] = scanner.nextDouble();
				i++;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return prices_high;
	}
	
	public static double[] getPricesLow(){
		double prices_low[] = {};
		Scanner scanner;
		try {
			scanner = new Scanner(new FileReader("prices_low.txt")).useDelimiter("\\n");
			while(scanner.hasNext()){
				int i = 0;
				prices_low[i] = scanner.nextDouble();
				i++;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return prices_low;
	}
	
	public static double[] getLocationHigh(){
		double location_high[] = {};
		Scanner scanner;
		try {
			scanner = new Scanner(new FileReader("location_high.txt")).useDelimiter("\\n");
			while(scanner.hasNext()){
				int i = 0;
				location_high[i] = scanner.nextDouble();
				i++;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return location_high;
	}
	
	public static double[] getLocationLow(){
		double location_low[] = {};
		Scanner scanner;
		try {
			scanner = new Scanner(new FileReader("location_low.txt")).useDelimiter("\\n");
			while(scanner.hasNext()){
				int i = 0;
				location_low[i] = scanner.nextDouble();
				i++;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return location_low;
	}



}
