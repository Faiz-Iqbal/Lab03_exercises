import java.util.Scanner;

/**
 * Week 3, Exercise 1.
 * 
 * @author INSERT YOUR NAME HERE
 */
public class Exercise1 {

	public static void main(String[] args) {
		// water constants
		final int WATER_VOLUME_EARTH = 332519000;// cubic meters
		final float OCEAN_WATER_PROPORTION = 0.9935F; // 99.35%
		final float M3_TO_GALLON = 264.172F; // conversion m3 to gallon

		// human constants
		final float HUMAN_BODY_VOLUME = 0.062F; // cubic meters (62000 cubic centimeters)
		final long HUMAN_NUMBER = 7400000000L; // must be a long as it is greater thank (2^31)-1
		final float HUMAN_WATER_PRPORTION = 0.75F; // 75%
		
		//volume of ocean
		double oceanVolumeM3 = WATER_VOLUME_EARTH * OCEAN_WATER_PROPORTION;
		double oceanVolumeGallons = oceanVolumeM3 * M3_TO_GALLON;
		
		//print values
		System.out.println("Ocean volume = " + oceanVolumeM3 + " m3 => \n" 
							+ oceanVolumeGallons + " gallons");
		
		//water in human body
		double total_human_water = HUMAN_BODY_VOLUME * HUMAN_WATER_PRPORTION * HUMAN_NUMBER;
		System.out.println("Total human water: "+ total_human_water + " m3");
		
		//human to ocean ratio
		double humanOceanWaterRatio = total_human_water/oceanVolumeM3;
		
		System.out.println("Ration Human/Ocean= "+ humanOceanWaterRatio);
		System.out.println("----------------------------------------------");
		
		if (humanOceanWaterRatio >= 1) {
			System.out.println("Surprising, human have more water than the ocean!");
		}else {
			System.out.println("Normal, ocean is much larger");
		}

	}

}
