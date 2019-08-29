package oopModel;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class skeletonJellyFlock extends skeletonJelly {

	ArrayList<skeletonJelly> jellyFlock = new ArrayList<skeletonJelly>();
	
	
	public skeletonJellyFlock(int jelly_count) throws TooFewBonesException {
	
		if (jelly_count > 50) {
			throw new TooFewBonesException("Too many jellies, but not enough bones!");
		}
		for(int i = 0; i < jelly_count; i++) {
			jellyFlock.add(new skeletonJelly(ThreadLocalRandom.current().nextInt(0, 30)));
		}
		jellyFlock.sort(null);
	}
	
	public void releaseTheFlock() {
		System.out.println("The Skeleton Jelly Flock is speaking...");
		for(skeletonJelly jellyBoi : jellyFlock) {
			jellyBoi.Speak();
		}
	}
}
