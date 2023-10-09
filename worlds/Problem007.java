package worlds;
//კარელი დგას 1x1 უჯრაზე, შეავსებინეთ მას მთელი სამყარო თითო ბრილიანტით. ანუ მთელ
//სამყაროში ყველა უჯრაზე უნდა იდოს ზუსტად ერთი ბრილიანტი. ჩათვალეთ რომ საწყისი
//სამყარო ცარიელი არ არის და გარკვეულ(ჩვენთვის უცნობ) უჯრებში თითო(მხოლოდ ერთი)
//ბრილიანტი დევს. ამასთან გაითვალისწინეთ, რომ სამყაროს ზომები თქვენთვის უცნობია და
//თქვენი პროგრამა უნდა მუშაობდეს ნებისმიერი ზომის სამყაროსათვის.

import stanford.karel.Karel;

public class Problem007 extends Karel {
	public void run(){

while(beepersInBag()){
	fillLine();
	//	next line exists
//	go to next line start position
	while(leftIsClear()){
	goToNextLineStart();
	fillLine();
//		fill line
	
		
	}}}
private void fillLine(){
	if(noBeepersPresent()){
		putBeeper();
		}
		while(frontIsClear()){
			move();
			if(noBeepersPresent()){
			putBeeper();
			}
		}
	}
private  void goToNextLineStart(){
	turnLeft();
	move();
	turnLeft();
	while(frontIsClear()){
		move();
	}
	turnAround();
}
private void turnAround(){
	turnLeft();
	turnLeft();
	}


}
