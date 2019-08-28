package oopModel;

import java.util.ArrayList;
import java.util.Collection;

import javax.swing.text.html.HTMLDocument.Iterator;

public class skeletonJellyFlock extends skeletonJelly{

	ArrayList<skeletonJelly> jellyFlock = new ArrayList<skeletonJelly>();
	
	public skeletonJellyFlock() {
		this.jellyFlock.add(new skeletonJelly());
		this.jellyFlock.add(new skeletonJelly());
		this.jellyFlock.add(new skeletonJelly());
	}
	
	public void releaseTheFlock() {
		System.out.println("The Skeleton Jelly Flock is speaking...");
		for(skeletonJelly jellyBoi : jellyFlock) {
			jellyBoi.Speak();
		}
	}
}
