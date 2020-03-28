public class Dog{
	String name;
	String breed;
	String age;

	public void bark(){
		System.out.println(this.name + "Bark");
	}

	public void eat(){
		System.out.println(this.name + "eating");
	}


	public void run(){
		System.out.println(this.name + "running with age" + this.age);
	}

}