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
		System.out.print("1 = " + printDouble(firstNumber) + " + ?;"
				+ "\t5 = sq. root from " + printDouble(firstNumber) + ";"
						+ "\t\t9 = cos from " + printDouble(firstNumber) + "(radians);");
		if (firstNumber ==(int)firstNumber) {
			System.out.println("\t12 = divide " + printDouble(firstNumber) 
					+ " from ? and show remainder;");
		} else {
			System.out.println();
		}
		System.out.println("2 = " + printDouble(firstNumber) + " - ?;\t6 = " 
			+ printDouble(firstNumber) + " X "
				+ printDouble(firstNumber) + ";\t\t\t10 = tg from "
					+ printDouble(firstNumber) + "(radians);"
						+ "\t0 = new first number.");
		System.out.println("3 = " + printDouble(firstNumber)
			+ " X ?;\t7 = " + printDouble(firstNumber) + " to the power of ?;"
				+ "\t11 = ctg of " + printDouble(firstNumber) + "(radians);");
		System.out.println("4 = " + printDouble(firstNumber) + " : ?;"
				+ "\t8 = sin from " + printDouble(firstNumber) + "(radians);");

		System.out.println("Enter operation's equivalent in number.");
		System.out.print("> ");
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
