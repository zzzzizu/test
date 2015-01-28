package test.ac.il.model;

public abstract class abstractFarm implements farm
{
	static final String farmName = "daniel farm";
	protected String name;
	protected float weight;
	protected int age;
	
	public String getFarmName()
	{
		return farmName;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
}
