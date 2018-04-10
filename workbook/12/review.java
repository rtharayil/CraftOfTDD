/*Kindly review the below code. How Can I test AutomaticLockDoor class independently?*/ 


public class AutomaticLockDoor extends MyCustomTimer {
    
	void lockTheDoor(){
		// lock the door 
	}

    public AutomaticLockDoor(int seconds) {
        
        super.schedule(new RemindTask(), seconds*1000);
	}

    class RemindTask extends TimerTask {
        public void run() {
        	lockTheDoor();
            super.cancel(); //Terminate the timer thread
        }
    }

   
}

