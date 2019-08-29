package oopModel;

public abstract class skeletonAbstract implements citadelCity {

	protected int carefulness;
	protected static String name;
	
	skeletonAbstract(String new_name, int carefulness){
		name = new_name;
		this.setCarefulness(carefulness);
	}
	
	skeletonAbstract(String new_name){
		name = new_name;
		this.setCarefulness(10);
	}
	
	skeletonAbstract(){
		name = "Skeleton Jelly";
		this.setCarefulness(10);
	}
	
	public int getCarefulness() {
		return carefulness;
	}
	
	public void setCarefulness(int carefulness) throws TooCarefulException {
		if (carefulness > 50) {
			throw new TooCarefulException();
		}
		this.carefulness = carefulness;
	}
	

}
