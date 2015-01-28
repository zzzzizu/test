package test.ac.il.model;

public class farming 
{
	public abstractFarm farm1[] = new abstractFarm[5];
	
	public farming()
	{
		farm1[0] = new cow("milka", 27, (float)28.7, 29);
		farm1[1] = new cow("loly", 22, (float)37.4, 10);
		farm1[2] = new sheep("dolly", 21,23,8);
		farm1[3] = new hen("kitty", 35, (float)28.4, 10);
		farm1[4] = new dog("joe", 11, (float)12.2);
	}
	public void printFarm()
	{
		for(int i = 0; i < 5;i++)
		{
			System.out.println(farm1[i].name + " " + farm1[i].age);
			farm1[i].walk();
		}
	}
	public String liters(abstractFarm[] farm1)
	{
		int sumLiters = 0;
		
		for(int i = 0;i < 5;i++)
		{
			if(farm1[i] instanceof Milk)
			{
				sumLiters += ((Milk) farm1[i]).getMilk();
			}
		}
		return "Total farm milk capacity is " + sumLiters + " litters";
	}
	
	public static void main(String[] args)
	{
		farming farm = new farming();
		System.out.println(farm.farm1[2].getFarmName());
	}
}
