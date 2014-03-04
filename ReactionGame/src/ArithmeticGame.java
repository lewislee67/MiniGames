import java.util.Random;

public class ArithmeticGame implements Game {
	
	private Integer answer;
	private Random random;
	int number1;
	int number2;
	int result;
	String signChar;
	int unknownPos;
	String display;
	
	public ArithmeticGame() {
		random = new Random();
	}
	
	public void initialise() {
	
		number1 = random.nextInt(12) + 1;
		number2 = random.nextInt(12) + 1;
		int sign = random.nextInt(3);
		result = 0;
		signChar = null;
		if (sign == 0) {
			result = number1 + number2;
			signChar = " + ";
		} if (sign == 1) {
			result = number1 - number2;
			signChar = " - ";
		} if (sign == 2) {
			result = number1 * number2;
			signChar = " x ";
		}
		unknownPos = random.nextInt(3);
		if (unknownPos == 0) {
			setAnswer(number1);
			display = " " + signChar + number2 + " = " + result;
		} if (unknownPos == 1) {
			setAnswer(number2);
			display = number1 + signChar + " " + " = " + result;
		} if (unknownPos == 2) {
			setAnswer(result);
			display = number1 + signChar + number2 + " = " + " ";
		}
	}

	public void fillUnknown(String number) {
		if (unknownPos == 0) {
			display = number + signChar + number2 + " = " + result;
		} if (unknownPos == 1) {
			display = number1 + signChar + number + " = " + result;
		} if (unknownPos == 2) {
			display = number1 + signChar + number2 + " = " + number;
		}
	}

	public String getAnswer() {
		return answer.toString();
	}

	public void setAnswer(int answer) {
		this.answer = answer;
	}
	
	public String getDisplay() {
		return display;
	}
}
