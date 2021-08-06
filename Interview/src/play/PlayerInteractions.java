package play;

public class PlayerInteractions {

	public static void main(String[] args) {
		//INITIATOR OBJECT 
		Player initiator=new Player(1,  "Initiator"); 
		//RECEIVE OBJECT 
		Player receiver =new Player(2, "Receiver"); 
		//INITIATOR SENDS A MESSAGE TO RECEIVER 
		initiator.sendMessage("message_test", receiver);
		
	}

}
