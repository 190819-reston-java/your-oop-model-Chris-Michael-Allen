package oopModel;

public class squirxicalJelly extends skeletonJelly {

	
	squirxicalJelly(String name, int carefulness){
		super(name, carefulness);
	}
	
	squirxicalJelly(String name){
		super(name);
	}
	
	squirxicalJelly(){
		super();
	}
	
	public void Speak() {
		System.out.println("I am Squirxical Jelly");
		this.setCarefulness(this.getCarefulness() + 1);
	}
	
	public void Drip() {
		System.out.println("I am dripping jelly");
		this.setCarefulness(this.getCarefulness() - 1);
	}
}
