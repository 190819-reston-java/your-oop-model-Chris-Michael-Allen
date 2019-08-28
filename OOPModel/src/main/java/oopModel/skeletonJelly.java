package oopModel;

public class skeletonJelly extends skeletonAbstract {

	
	skeletonJelly(String name, int carefulness){
		super(name, carefulness);
	}
	
	skeletonJelly(String name){
		super(name);
	}
	
	skeletonJelly(){
		super();
	}

	public void Speak() {
		System.out.println("I am Skeleton Jelly");
		this.setCarefulness(this.getCarefulness() + 2);
	}
	
	public void isCareful() {
		if(this.name != "Skeleton Jelly" && this.carefulness < 20) {
			System.out.println("You are not careful jelly");
		}
		else {
			System.out.println("I am careful Skeleton Jelly");
		}
	}
}
