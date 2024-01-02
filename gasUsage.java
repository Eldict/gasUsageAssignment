/*
 * Author :Eldict Koonan John
 * Date: 19/11/2023	
 * 
 * The project here is to test a program that will read in the name of a customer and their average annual kWh gas usage.
 * There are four gas suppliers and the program should calculate the expected annual cost of each of the four suppliers.
 * 
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class gasUsage {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat CF = new DecimalFormat("\u20AC###,###.00");
		//Input
		System.out.print("Enter the name of the customer:\t\t");
		String customerName = sc.nextLine ();
		System.out.print("Enter your annual Kwh gas usage:");
		int KwhUsage = sc.nextInt();
		
		//Since customer have to pay the same for carbon tax and VAT for all suppliers, I will be keeping it separately.
		double CarbonTax = 0.877;
		double VatTax = 0.09;
		
		//SSE Electricity
			double SSEUR = 10.91;
			//SSE Electricity Output	
			double SSESC = 139.92;
			double SSEUC = ( KwhUsage * SSEUR) / 100;
			double SSECT = ( KwhUsage * CarbonTax ) / 100;
			double SSEVT = VatTax * ( SSESC + SSEUC + SSECT );
			double SSETC = SSESC + SSEUC + SSECT + SSEVT;

			
		//FloGas Electricity
			double FGUR = 9.95;	
			//FloGas Electricity Output	
			double FGSC = 154.12;
			double FGUC = ( KwhUsage * FGUR) / 100;
			double FGCT = ( KwhUsage * CarbonTax ) / 100;
			double FGVT = VatTax * ( FGSC + FGUC + FGCT );
			double FGTC = FGSC + FGUC + FGCT + FGVT;

		//ElectricIreland Electricity
			double EIUR = 12.72;
			//ElectricIreland Electricity Output	
			double EEISC = 152.19;
			double EIUC = ( KwhUsage * EIUR ) / 100;
			double EICT = ( KwhUsage * CarbonTax ) / 100;
			double EIVT = VatTax * ( EEISC + EIUC + EICT );
			double EITC = EEISC + EIUC + EICT + EIVT;
			
		//PrePayPower Electricity
			double PPPUR = 13.09;
			//PrePayPower Electricity Output	
			double PPPSC = 142.81;
			double PPPUC = ( KwhUsage * PPPUR ) / 100;
			double PPPCT = ( KwhUsage * CarbonTax ) / 100;
			double PPPVT = VatTax * ( PPPSC + PPPUC + PPPCT );
			double PPPTC = PPPSC + PPPUC + PPPCT + PPPVT;

			System.out.println("\nEstimated annual gas cost for " + customerName + " based on " + KwhUsage + " kWh annual usage.");
			
			System.out.println("\u250c"+"\u2500".repeat(135)+"\u2510");
			System.out.printf("\u2502 %-22s%-22s%-22s%-22s%-22s%-23s \u2502 %n", "Supplier", "Standing Charge",
			 "Unit Cost", "Carbon Tax", "VAT", "Total Cost");

			System.out.println("\u2502" + "\u2500".repeat(135) + "\u2502");

			System.out.printf("\u2502 %-22s%-22s%-22s%-22s%-22s%-23s \u2502%n", "SSE Electricity", "€139.92",
			 CF.format(SSEUC), CF.format(SSECT), CF.format(SSEVT), CF.format(SSETC));
			 
			System.out.println("\u2502" + "\u2500".repeat(135) + "\u2502");
			
			System.out.printf("\u2502 %-22s%-22s%-22s%-22s%-22s%-23s \u2502%n", "FloGas", "€154.12",
			 CF.format(FGUC), CF.format(FGCT), CF.format(FGVT), CF.format(FGTC));
			
			 System.out.println("\u2502" + "\u2500".repeat(135) + "\u2502");
			
			 System.out.printf("\u2502 %-22s%-22s%-22s%-22s%-22s%-23s \u2502%n", "Electric Ireland", "€152.19",
			 CF.format(EIUC), CF.format(EICT), CF.format(EIVT), CF.format(EITC));
			
			 System.out.println("\u2502" + "\u2500".repeat(135) + "\u2502");
			
			 System.out.printf("\u2502 %-22s%-22s%-22s%-22s%-22s%-23s \u2502%n", "PrePay Power", "€142.81",
			 CF.format(PPPUC), CF.format(PPPCT), CF.format(PPPVT), CF.format(PPPTC));

			System.out.println("\u2514"+"\u2500".repeat (135) +"\u2518");

			sc.close();
	}
}
