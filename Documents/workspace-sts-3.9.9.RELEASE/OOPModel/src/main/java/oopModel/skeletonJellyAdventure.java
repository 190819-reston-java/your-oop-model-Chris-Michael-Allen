package oopModel;

public class skeletonJellyAdventure {

	public static void main(String[] args) {
		skeletonJelly myJelly = new skeletonJelly("Skeleton Jelly", 20);
		squirxicalJelly secondJelly = new squirxicalJelly("Squirxical Jelly");
		
		myJelly.Speak();
		secondJelly.Speak();
		
		secondJelly.Drip();
		secondJelly.Drip();
		
		myJelly.isCareful();
		secondJelly.isCareful();
		
		squirxicalJelly thirdJelly = new squirxicalJelly("Skeleton Jelly", 600);
		thirdJelly.isCareful();

	}

}
