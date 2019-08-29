package oopModel;

import java.util.Iterator;

public class skeletonJelly extends skeletonAbstract implements Comparable<skeletonJelly> {

	
	skeletonJelly(String name, int carefulness){
		super(name, carefulness);
	}
	
	skeletonJelly(String name){
		super(name);
	}
	
	skeletonJelly(){
		super();
	}

	skeletonJelly(int carefulness){
		super("Skeleton Jelly", carefulness);
	}

	public void Speak() {
		System.out.println("I am Skeleton Jelly");
		this.setCarefulness(this.getCarefulness() + 2);
		System.out.println("My name is " + name + " and I am this careful: " + this.getCarefulness());
	}
	
	public void isCareful() {
		if(name != "Skeleton Jelly" && this.carefulness < 20) {
			System.out.println("You are not careful jelly");
		}
		else {
			System.out.println("I am careful Skeleton Jelly");
		}
	}

	public int compareTo(skeletonJelly other) {
		if(this.getCarefulness() < other.getCarefulness()) {
			return -1;
		}
		else if (this.getCarefulness() > other.getCarefulness()) {
			return 1;
		}
		else {
			return 0;
		}
	}

}
