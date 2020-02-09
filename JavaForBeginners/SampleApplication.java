 public class SampleApplication{
 	
	static int testValue;

	public static void main(String[] args){
		float amountByOwner = 128.88f;
		byte amountToaAdd = 2;
		float result = amountByOwner + amountToaAdd;
		boolean isTrue = true;
		char a = 'A';
		String apple = "apple";	
		


		System.out.println("this is test value "+ testValue);

		System.out.println("This is given by owner " + amountByOwner);
		System.out.println("We added " + amountToaAdd);
		System.out.println("Hello Welcome " + result + "Is this true::" + isTrue);
		System.out.println("This is char test " + a + " " + apple);


		result = result - 100;
		System.out.println("Subtract 100 = " + result);
		result = result * 2;
		System.out.println("Mulitply by 2 = " + result);
		result = result/2;
		System.out.println("divide by 2 =" + result);

		result = result%10;
		System.out.println("Reminder when divided by 10 = " + result);

		int unaryTest = +1;

		System.out.println("Unary plus operator " + unaryTest);
		System.out.println("Unary minus operator " + -1);

		++unaryTest;
		System.out.println("Unary ++ operator " + unaryTest);
		unaryTest--;
		System.out.println("Unary -- operator " + unaryTest);

		boolean success = false;
		System.out.println("Success" + success);

		System.out.println("Success " + !success);

		int value1 = 3;
		int value2 = 2;

		if(value1 == value2){
			System.out.println("Value1 is equal to value 2");
		}

		if(value1 != value2){
			System.out.println("Value1 is not equal to value 2");
		}

		if(value1 < value2){
			System.out.println("Value1 is less than  value 2");
		}

		if(value1 > value2){
			System.out.println("Value1 is greater to value 2");
		}

		if(value1 <= value2){
			System.out.println("Value1 is equal or less than value 2");
		}

		if(value1 >= value2){
			System.out.println("Value1 is greather than or equal to value 2");
		}



		if((value1 == value2) && (value1 == 1)){
			System.out.println("Value1 and value 2 is equal and value1 is equal to 1");
		}

		if((value1 == value2) || (value1 == 1)){
			System.out.println("Value1 and value 2 is equal or value1 is equal to 1");
		}


	}
}