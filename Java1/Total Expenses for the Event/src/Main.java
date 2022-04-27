import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scnr= new Scanner(System.in);
		float branding, travel, food, logistics, total, brandingPr, travelPr, foodPr, logisticsPr;
		System.out.println("Enter branding expenses");
		branding=scnr.nextFloat();
		System.out.println("Enter travel expenses");
		travel=scnr.nextFloat();
		System.out.println("Enter food expenses");
		food=scnr.nextFloat();
		System.out.println("Enter logistics expenses");
		logistics=scnr.nextFloat();
		total=branding+travel+food+logistics;
		System.out.println("Total expenses: Rs." + String.format("%.2f", total));
		brandingPr=(branding/total)*100;
		travelPr=(travel/total)*100;
		foodPr=(food/total)*100;
		logisticsPr=(logistics/total)*100;
		System.out.println("Branding expenses percentage: " + String.format("%.2f", brandingPr) + "%");
		System.out.println("Travel expenses percentage: " + String.format("%.2f", travelPr) +"%");
		System.out.println("Food expenses percentage: " + String.format("%.2f", foodPr) + "%");
		System.out.println("Logistics expenses percentage: " + String.format("%.2f", logisticsPr) +"%");
	}
}