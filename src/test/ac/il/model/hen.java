package test.ac.il.model;

public class hen extends abstractFarm implements eggs
{	
	private int eggs;
	public hen(String name, int age, float weight, int eggs1)
	{
		setName(name);
		setAge(age);
		setWeight(weight);
		eggs = eggs1;
	}
	
	public void eat()
	{
		System.out.println("hen eats");
	}
	
	public void walk() 
	{
		System.out.println("hen walk");
	}

	@Override
	public int getEggs() {
		return eggs;
	}	

	/*public static void main(String[] args)
	{
		cow cow = new cow(100);
		System.out.println("cow main(); \n" + cow);
	}*/
}
