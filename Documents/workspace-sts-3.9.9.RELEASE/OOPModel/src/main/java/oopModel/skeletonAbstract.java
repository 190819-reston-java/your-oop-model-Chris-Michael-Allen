package oopModel;

public abstract class skeletonAbstract implements citadelCity {

	protected static int carefulness;
	protected static String name;
	
	skeletonAbstract(String name, int carefulness){
		this.name = name;
		this.carefulness = carefulness;
	}
	
	skeletonAbstract(String name){
		this.name = name;
		this.carefulness = 10;
	}
	
	public static int getCarefulness() {
		return carefulness;
	}
	
	public void setCarefulness(int carefulness) {
		this.carefulness = carefulness;
	}
}
