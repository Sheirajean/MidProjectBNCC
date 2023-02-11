package Mid_Project;

import java.util.Scanner;

public class CarSelling extends Vehicle
{
	Scanner Input = new Scanner(System.in);
	
	int PriceHelm;
	
	
	public void Selling(Object TipeKendaraan,Object Type,Object Nama)
	{
		if(TipeKendaraan.equals("Car"))
		{
			System.out.println("Turning on entertainment system...");
			if (Type.equals("Supercar"))
			{
				System.out.println("Boosting!");
			}
			System.out.println(" ");
		}
		else
		{
			System.out.println( Nama + " is standing!");
			System.out.print("Price : ");
			PriceHelm = Input.nextInt();
			System.out.println(" ");
		}
		System.out.println(" ");
	}
}
//}
//	
	
//	public void Wheel()
//	{
//		switch (contoh.TipeKendaraan)
//		{
//			case "Car":
//				do
//					{
//						System.out.println("Input Wheel [4 <= Wheel <= 6] : ");
//						contoh.Wheel = Input.nextInt();
//					}
//					while (4 > contoh.Wheel || contoh.Wheel > 6 );
//				break;
//			case "Motorcycle" :
//				do
//					{
//						System.out.println("Input Wheel [2 <= Wheel <= 3] : ");
//						contoh.Wheel = Input.nextInt();
//					}
//					while (2 > contoh.Wheel || contoh.Wheel > 3);
//				break;
//		}
//	}
//}
