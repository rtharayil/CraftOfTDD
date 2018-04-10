/*Kindly review the below code, please document your review comments*/

public class Copier{
	private Keyboard keyboard;
	private Printer printer;
 
	public Copier(Keyboard keyboard, Printer printer){
    	this.keyboard = keyboard;
    	this.printer = printer;
	}
 
 
	public void Copy(){
    	int c = keyboard.Read();
    	while(!keyboard.IsEndingCharacter(c)){
        	printer.Write(c);
        	c = keyboard.Read();
    	}
	}
}
