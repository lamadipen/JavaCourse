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
	}
}