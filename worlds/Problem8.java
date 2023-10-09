package worlds;

import stanford.karel.SuperKarel;

public class Problem8 extends SuperKarel {
	public void run(){
	moveFirstFileToDestinationAndBackUp();
	moveFirstFileToDestinationAndBackUp();
//	
	restoreBeeper();
	moveToFirstPile();

}

	private void moveFirstFileToDestinationAndBackUp() {
		// TODO Auto-generated method stub
		while(beepersPresent()){
			pickBeeper();
			moveBeeperFromFirstPileToDestinationPile();
			backupBeeper();
		}
		
	}
	
	
}