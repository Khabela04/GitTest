package worlds;

import stanford.karel.SuperKarel;
//კარელი დგას 1x1 უჯრაზე, შეავსებინეთ მას მთელი სამყარო თითო ბრილიანტით. ანუ მთელ
//სამყაროში ყველა უჯრაზე უნდა იდოს ზუსტად ერთი ბრილიანტი. ჩათვალეთ რომ საწყისი
//სამყარო ცარიელი არ არის და გარკვეულ(ჩვენთვის უცნობ) უჯრებში თითო(მხოლოდ ერთი)
//ბრილიანტი დევს. ამასთან გაითვალისწინეთ, რომ სამყაროს ზომები თქვენთვის უცნობია და
//თქვენი პროგრამა უნდა მუშაობდეს ნებისმიერი ზომის სამყაროსათვის.
public class Problem07 extends SuperKarel {

	public void run(){
		while(frontIsClear()){
			putBeeper();
		while(frontIsClear()){
			move();
			while(noBeepersPresent()){
				putBeeper();
			}
			}
		turnLeft();
		if(frontIsClear()){
		move();
		turnLeft();}
		while(noBeepersPresent()){
			putBeeper();
		}
		
		while(frontIsClear()){
			move();
			while(noBeepersPresent()){
				putBeeper();
			}
			}
		
			turnRight();
			if(frontIsClear()){
		move();
		turnRight();
		
		
}}
		
		while(frontIsClear()){
			move();
			while(noBeepersPresent()){
				putBeeper();
			}
		}
		if(frontIsBlocked()){
			turnLeft(); 
			while(noBeepersPresent()){
			putBeeper();}
			while(frontIsClear()){
				move();
			while(noBeepersPresent()){
				putBeeper();}
				
			}
		}
}
}