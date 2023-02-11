package Mid_Project;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Vehicle contoh = new Vehicle();
		CarSelling p = new CarSelling();
		Scanner Input = new Scanner(System.in);
				
		int pilih = 0;
		
		while(pilih != 3) {
			Menu();
			System.out.print("Pilih = ");
			pilih = Input.nextInt();
			System.out.println(" ");
			switch(pilih)
			{
				case 1:
					contoh.Data.clear();	
					do 
						{
							Input.nextLine();
							System.out.print("Input Type [Car | Motorcycle] : ");
							contoh.TipeKendaraan = Input.nextLine();
							contoh.Data.add(contoh.TipeKendaraan);
						}
						while (!contoh.TipeKendaraan.equals("Car") && !contoh.TipeKendaraan.equals("Motorcycle"));
			
						do
						{
							System.out.print("Input Brand [>=5] : ");
							contoh.Brand = Input.nextLine();
							contoh.Data.add(contoh.Brand);
						}
						while (contoh.Brand.length() < 5);
			
						do
						{
							System.out.print("Input Name [>=5] : ");
							contoh.Name = Input.nextLine();
							contoh.Data.add(contoh.Name);
						}
						while (contoh.Name.length() < 5);
			
						do
						{
							System.out.print("Input License : ");
							contoh.License = Input.nextLine();
							contoh.Data.add(contoh.License);
						}
						while (contoh.License.length() > 10);
			
						do
						{
							System.out.print("Input Top Speed [100 <= TopSpeed <= 250] : ");
							contoh.TopSpeed = Input.nextInt();
							contoh.Data.add(contoh.TopSpeed);
						}
						while (100 > contoh.TopSpeed || contoh.TopSpeed > 250);
			
						do
						{
							System.out.print("Input Gas Capacity [30 <= GasCap <= 60] : ");
							contoh.Gas = Input.nextInt();
							contoh.Data.add(contoh.Gas);
						}	
						while (30 > contoh.Gas || contoh.Gas > 60);
			
			
						switch (contoh.TipeKendaraan)
						{
							case "Car":
								do
								{
									System.out.print("Input Wheel [4 <= Wheel <= 6] : ");
									contoh.Wheel = Input.nextInt();
									contoh.Data.add(contoh.Wheel);
								}
								while (4 > contoh.Wheel || contoh.Wheel > 6 );
								break;
							case "Motorcycle" :
								do
								{
									System.out.print("Input Wheel [2 <= Wheel <= 3] : ");
									contoh.Wheel = Input.nextInt();
									contoh.Data.add(contoh.Wheel);
								}
								while (2 > contoh.Wheel || contoh.Wheel > 3);
							break;
						}
			
						switch (contoh.TipeKendaraan)
						{
							case "Car":
								do
								{
									System.out.print("Input type [SUV | Supercar | Minivan] : ");
									contoh.Type = Input.next();
									contoh.Data.add(contoh.Type);
								}
								while (!contoh.Type.equals("SUV") && !contoh.Type.equals("Supercar") && !contoh.Type.equals("Minivan"));
							break;
							case "Motorcycle" :
								do
								{
									System.out.print("Input Wheel type [Automatic | Manual] : ");
									contoh.Type = Input.next();
									contoh.Data.add(contoh.Type);
								}
								while (!contoh.Type.equals("Automatic") && !contoh.Type.equals("Manual"));
							break;
						}
				
						switch (contoh.TipeKendaraan)
						{
							case "Car":
								do
								{
									System.out.print("Input Entertainment System Amount [>=1] : ");
									contoh.EntertainmentSystem =Input.nextInt();
									contoh.Data.add(contoh.EntertainmentSystem);
								}
								while (contoh.EntertainmentSystem < 1);
							break;
							case "Motorcycle" :
								do
								{
									System.out.print("Input Helm Amount [>=1] : ");
									contoh.HelmAmount = Input.nextInt();
									contoh.Data.add(contoh.HelmAmount);
								}
								while (contoh.HelmAmount < 1);
							break;
						}
						
						Input.nextLine();
						System.out.println("Enter to return");
						Input.nextLine();
						contoh.Kendaraan.add(contoh.Data);
					
					break;
			
			
				case 2:
					int choice;
					if (contoh.Kendaraan.size() == 0)
					{
						System.out.println("|-----|---------------|---------------|");
						System.out.println("|No   |Type           |Name           |");
						System.out.println("|-----|---------------|---------------|");
						System.out.println("|-----|---------------|---------------|");
					}
					else
						{
							System.out.println("|-----|---------------|---------------|");
							System.out.println("|No   |Type           |Name           |");
							for(int i = 0; i < contoh.Kendaraan.size(); i++) 
							{
							System.out.println("|-----|---------------|---------------|");
							System.out.println("|" + (i+1) + "    |" +  contoh.Kendaraan.get(i).get(0) + "            |" + contoh.Kendaraan.get(i).get(2) + "         |");
							}
							System.out.println("|-----|---------------|---------------|");
							System.out.println("|-----|---------------|---------------|");
							System.out.print("Pick a vehicle number to test drive [Enter '0' to exit]: ");
							pilih = Input.nextInt();
							if (pilih != 0)
							{
								System.out.println("Brand : " + contoh.Kendaraan.get(pilih-1).get(1));
								System.out.println("Name : " + contoh.Kendaraan.get(pilih-1).get(2));
								System.out.println("License Plate : " + contoh.Kendaraan.get(pilih-1).get(3));
								System.out.println("Type : " + contoh.Kendaraan.get(pilih-1).get(7));
								System.out.println("Gas Capacity : " + contoh.Kendaraan.get(pilih-1).get(5));
								System.out.println("Top Speed : " + contoh.Kendaraan.get(pilih-1).get(4));
								System.out.println("Wheel(s) : " + contoh.Kendaraan.get(pilih-1).get(6));
								System.out.println("Entertainment System : " + contoh.Kendaraan.get(pilih-1).get(8));
								
								p.Selling(contoh.Kendaraan.get(pilih-1).get(0),contoh.Kendaraan.get(pilih-1).get(7),contoh.Kendaraan.get(pilih-1).get(2));
							}
//							else
//							{
//								System.out.println("Brand : " + contoh.Kendaraan.get(pilih).get(1));
//								System.out.println("Name : " + contoh.Kendaraan.get(pilih).get(2));
//								System.out.println("License Plate : " + contoh.Kendaraan.get(pilih).get(3));
//								System.out.println("Type : " + contoh.Kendaraan.get(pilih).get(7));
//								System.out.println("Gas Capacity : " + contoh.Kendaraan.get(pilih).get(5));
//								System.out.println("Top Speed : " + contoh.Kendaraan.get(pilih).get(4));
//								System.out.println("Wheel(s) : " + contoh.Kendaraan.get(pilih).get(6));
//								System.out.println("Entertainment System : " + contoh.Kendaraan.get(pilih).get(8));
//								
//								p.CarSelling(pilih);
//							}
						}
					
					break;
				case 3:
					break;
				default:
					break;
			}
		}
	}
	public static void Menu()
	{
		System.out.println("Welcome to Program");
		System.out.println("======================");
		System.out.println("1. Input List");
		System.out.println("2. View List");
		System.out.println("3. Exit");
	}
	}


