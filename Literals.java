package PrimitiveTypes;

public class Literals {
		/*
		  source: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
		 
		  Integer Literals

			An integer literal is of type long if it ends with the letter L or l; otherwise it is of type int.
			It is recommended that you use the upper case letter L because the lower case letter l is hard to distinguish from the digit 1.

			Values of the integral types byte, short, int, and long can be created from int literals.
			Values of type long that exceed the range of int can be created from long literals.
			Integer literals can be expressed by these number systems:
			
			Decimal: Base 10, whose digits consists of the numbers 0 through 9; this is the number system you use every day
			Hexadecimal: Base 16, whose digits consist of the numbers 0 through 9 and the letters A through F
			Binary: Base 2, whose digits consists of the numbers 0 and 1 (you can create binary literals in Java SE 7 and later)
			For general-purpose programming, the decimal system is likely to be the only number system you'll ever use.
			However, if you need to use another number system, the following example shows the correct syntax.
			The prefix 0x indicates hexadecimal and 0b indicates binary:
			
			// The number 26, in decimal
			int decVal = 26;
			//  The number 26, in hexadecimal
			int hexVal = 0x1a;
			// The number 26, in binary
			int binVal = 0b11010;
		 */
	
	public static void main(String[] bambooWall)
	{	
		
//		The number 26, in binary
//		int binVal = 0b11010;
		
		//MIN MAX PRIMITIVE TYPES
		
		//byte - 8 bity pamieci - zapełniamy na maksa - jedynkami - 7 jedynek
		byte maxByte =  0b1111111+0;
		byte minByte = -0b1111111-1;
		byte minByte2= 	(byte)(0b1111111+1);// maxByte + 1
		
		System.out.println("Gorna granica byte: "+ maxByte);
		System.out.println("Dolna granica byte:" + minByte);
		System.out.println("Dolna granica byte:" + minByte2);
		System.out.println();
		
		//short - 16 bity pamieci - zapełniamy na maksa - jedynkami - 15 jedynek
		short maxShort =  0b111111111111111+0;
		short minShort = -0b111111111111111-1;
		short minShort2 = (short)(0b111111111111111+1); // maxShort + 1
				
		System.out.println("Gorna granica short: " + maxShort);
		System.out.println("Dolna granica short:"  + minShort);
		System.out.println("Dolna granica short:"  + minShort2);
		System.out.println();
		
		//int - 32 bity pamieci - zapełniamy na maksa - jedynkami - 31 jedynek
		int maxInt =  0b1111111111111111111111111111111+0;
		int minInt = -0b1111111111111111111111111111111-1;
		int minInt2=  0b1111111111111111111111111111111+1; // maxInt + 1
		System.out.println("Gorna granica int: " + maxInt);
		System.out.println("Dolna granica int:"  + minInt);
		System.out.println("Dolna granica int:"  + minInt2);
		System.out.println();
		
		//long - 64 bity pamieci - zapełniamy na maksa - jedynkami - 63 jedynki
		
		long maxLong =  0b111111111111111111111111111111111111111111111111111111111111111L+0; // 'L' na koncu liczby wskazuje ze jest to long
		long minLong = -0b111111111111111111111111111111111111111111111111111111111111111L-1;
		long minLong2=  0b111111111111111111111111111111111111111111111111111111111111111L+1;// maxLong + 1
		System.out.println("Gorna granica long: " + maxLong);
		System.out.println("Dolna granica long:"  + minLong);
		System.out.println("Dolna granica long:"  + minLong2);
	}
}
