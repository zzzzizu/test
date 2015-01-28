package test.ac.il.model;

public class dog extends abstractFarm 
{	
	public dog(String name, int age, float weight)
	{
		setName(name);
		setAge(age);
		setWeight(weight);
	}
	
	public void eat()
	{
		System.out.println("dog eats");
	}
	
	public void walk() 
	{
		System.out.println("dog walk");
	}

	/*public static void main(String[] args)
	{
		cow cow = new cow(100);
		System.out.println("cow main(); \n" + cow);
	}*/
}

