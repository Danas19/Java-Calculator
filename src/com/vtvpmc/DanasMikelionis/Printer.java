package com.vtvpmc.DanasMikelionis;

public class Printer {
	
	public static double enterFirstNumber(Reader scanner) {
		System.out.print("Enter first number: ");
		return scanner.nextDouble();
	}
	
	public static void printBeforeSecondNumber(double firstNumber,
			int arithmeticOperator) {
		System.out.println("-----------------------------------"
				+ "----------------------------");
		switch (arithmeticOperator) {
		case 1:
			System.out.print(printDouble(firstNumber) + " + ");
			break;
		case 2:
			System.out.print(printDouble(firstNumber) + " - ");
			break;
		case 3:
			System.out.print(printDouble(firstNumber) + " X ");
			break;
		case 4:
		/*falls through*/
		case 12:
			System.out.print(printDouble(firstNumber) + " : ");
			break;
		case 7:
			System.out.print(printDouble(firstNumber) + " to the power of ");
			break;
		}
	}
	
	public static double printAnswer(double firstNumber, double secondNumber,
			int arithmeticOperator) {
		double answer = 0;
		
			switch (arithmeticOperator) {
			case 1:
				answer = firstNumber + secondNumber;
				System.out.println(printDouble(secondNumber) + " = "
						+ printDouble(answer));
				break;
			case 2:
				answer = firstNumber - secondNumber;
				System.out.println(printDouble(secondNumber) + " = "
						+ printDouble(answer));
				break;
			case 3:
			/*falls through*/
			case 6:
				answer = firstNumber * secondNumber;
				System.out.println(printDouble(secondNumber) + " = "
						+ printDouble(answer));
				break;	
			case 4:
				answer = firstNumber / secondNumber;
				System.out.println(printDouble(secondNumber) + " = "
						+ printDouble(answer));
				break;
			case 5:
				answer = Math.sqrt(firstNumber);
				System.out.println("square root of " + printDouble(firstNumber)
						+ " = " + printDouble(answer));
				break;
			case 7:
				answer = Math.pow(firstNumber, secondNumber);
				System.out.println(printDouble(secondNumber) + " = " + printDouble(answer));
				break;
			case 8:
				answer = Math.toRadians(Math.sin(firstNumber));
				System.out.println("sin of " + printDouble(firstNumber)
					+ " = " + printDouble(answer));
				break;
			case 9:
				answer = Math.toRadians(Math.cos(firstNumber));
				System.out.println("cos of " + printDouble(firstNumber) + " = "
						+ printDouble(answer));
				break;
			case 10:
				answer = Math.tan(Math.toRadians(firstNumber));
				System.out.println("tg of " + printDouble(firstNumber) + " = "
						+ printDouble(answer));
				break;
			case 11:
				answer = Math.tan(1 / Math.toRadians(firstNumber));
				System.out.println("ctg of " + printDouble(firstNumber) + " = "
						+ printDouble(answer));
				break;	
			default:
				answer = (int)firstNumber % (int)secondNumber;
				System.out.println(printDouble(secondNumber) + " = "
						+ printDouble((int)firstNumber / (int)secondNumber) 
						+ " (remainder = " + printDouble(answer) + ")");	
			}
			return answer;
	}
	
	public static void printMenu(double firstNumber) {
		System.out.println("What action?");
		System.out.println("----------------------------------------"
				+ "-----------------------");
		System.out.print("1 = " + printDouble(firstNumber) + " + ?;\t5 = root;\t\t9 = cos (in radians);");
		if (firstNumber ==(int)firstNumber) {
			System.out.println("\t12 = divide and show remainder;");
		} else {
			System.out.println();
		}
		System.out.println("2 = subtract;\t6 = " 
			+ printDouble(firstNumber) + " X "
				+ printDouble(firstNumber) + ";\t\t10 = tg (in radians);"
						+ "\t0 = new first number.");
		System.out.println("3 = multiply;\t7 = power(any degree);"
				+ "\t11 = ctg (in radians);");
		System.out.println("4 = divide;\t8 = sin (in radians);");

		System.out.print("Enter operation's equivalent in number with number: "
				+ printDouble(firstNumber) + "\n> ");
	}
	
	public static String printDouble(double number) {
		if (number == (int)number) {
			return String.valueOf((int)number);
		} else if (Double.valueOf(number).isInfinite()) {
			return "-";
		} else {
			return String.format("%.4f", number);
		}
	}
}
