package Investment;

import java.util.Scanner;

public class Share {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		double earnings, buyingPrice, closingPrice;
		int day = 1;
		
		System.out.println("Enter the buying price per share:");
		buyingPrice = input.nextDouble();
		
		while(true) {
			
			System.out.println("Enter the closing price for day "+ day + "(if price negative loop break):");
			closingPrice = input.nextDouble();
			if(closingPrice<0.0) 
				break;
			earnings = closingPrice - buyingPrice;
			if(earnings > 0.0) {
				System.out.println("You have earned "+ earnings + " in day " + day);
			}else if(earnings < 0.0) {
				System.out.println("You have lost "+ earnings + " in day " + day);
			}else{
				System.out.println("No earnings in day "+ day);
			}
			day += 1;
		}
		input.close();
	}
}
