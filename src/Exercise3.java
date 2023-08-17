import java.util.Scanner;

/**
 * Week 3, Exercise 3.
 * 
 * @author INSERT YOUR NAME HERE
 */
public class Exercise3 {

	public static void main(String[] args) {
		// maximum and minimum flow of all the rivers in cubic meters m3.
		final int minFlowAmazon = 70000, maxFlowAmazon = 200000;
		final int minFlowCongo = 40000, maxFlowCongo = 80000;
		final int minFlowYangTseKiang = 600, maxFlowYangTseKiang = 50000;
		final int minFlowDanube = 6300, maxFlowDanube = 22000;
		final int minFlowRhine = 780, maxFlowRhine = 9000;
		final int minFlowRhone = 1760, maxFlowRhone = 12000;
		final int minFlowLoire = 75, maxFlowLoire = 10000;
		final int minFlowElbe = 150, maxFlowElbe = 3600;
		final int minFlowSeine = 50, maxFlowSeine = 1650;

		// Pollution level of each river
		final float polutionElbe = 0.8F;
		final float polutionLoire = 0.8F;
		final float polutionRhone = 1.0F;
		final float polutionRhine = 0.8F;
		final float polutionDanube = 0.7F;
		final float polutionYangTseKiang = 0.5F;
		final float polutionCongo = 0.2F;
		final float polutionAmazon = 0.9F;
		final float polutionSeine = 1.0F;

		// Scanner to take input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Select a river: Amazon, Congo, Yang Tse Kiang, Danube, Rhine, Rhone, Loire, Elbe, Seine");
		String river = scan.nextLine().toLowerCase(); // get the line entered by the user as a String and converts it to
														// lower case

		// variables to store the Average flow and Pollution of the river chosen:
		int averageFlow = 0;
		double pollutionCoefficient = 0;

		switch (river) {

		case "amazon":
			averageFlow = (minFlowAmazon + maxFlowAmazon) / 2;
			pollutionCoefficient = polutionAmazon;
			break;
		case "congo":
			averageFlow = (minFlowCongo + maxFlowCongo) / 2;
			pollutionCoefficient = polutionCongo;
			break;
		case "yang tse kiang":
			averageFlow = (minFlowYangTseKiang + maxFlowYangTseKiang) / 2;
			pollutionCoefficient = polutionYangTseKiang;
			break;
		case "danube":
			averageFlow = (minFlowDanube + maxFlowDanube) / 2;
			pollutionCoefficient = polutionDanube;
			break;
		case "rhine":
			averageFlow = (minFlowRhine + maxFlowRhine) / 2;
			pollutionCoefficient = polutionRhine;
			break;
		case "rhone":
			averageFlow = (minFlowRhone + maxFlowRhone) / 2;
			pollutionCoefficient = polutionRhone;
			break;
		case "loire":
			averageFlow = (minFlowLoire + maxFlowLoire) / 2;
			pollutionCoefficient = polutionLoire;
			break;
		case "elbe":
			averageFlow = (minFlowElbe + maxFlowElbe) / 2;
			pollutionCoefficient = polutionElbe;
			break;
		case "seine":
			averageFlow = (minFlowSeine + maxFlowSeine) / 2;
			pollutionCoefficient = polutionSeine;
			break;
		default:
			averageFlow = 0;
			pollutionCoefficient = -1;
		}

		//	Annual chloride discharge
		//	60 * 60 * 24 * 365 = Seconds * Minutes * Hours * Days
		//	Divided by 1000000 to convert to tons
		long chloridesAnnual = (long) (40 * averageFlow * pollutionCoefficient * 60 * 60 * 24 * 365);
		
		System.out.print("River " + river + " discharges " + chloridesAnnual + " m3 per year");

		scan.close();
		

	}

}












