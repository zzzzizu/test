package test.ac.il.model;

public class cow extends abstractFarm implements Milk
{	
	private float milk;
	public cow(String name, int age, float weight, float milk1)
	{
		setName(name);
		setAge(age);
		setWeight(weight);
		milk = milk1;
	}
	
	public void eat()
	{
		System.out.println("cow eats");
	}
	
	public void walk() 
	{
		System.out.println("cow walk");
	}

	public float getMilk() {
		return milk;
	}

	/*public static void main(String[] args)
	{
		cow cow = new cow(100);
		System.out.println("cow main(); \n" + cow);
	}*/
}
