package play;

import java.util.Stack;

public class Player {
	//PLAYER ATTRIBUTES 
	private int ID; 
	private String playerName;
	private String sentMessage; 
	private String receivedMessage; 
	private Stack<String> receivedMessagesStack= new Stack <String>();
	private Stack<String> sentMessagesStack= new Stack <String>();

	//GETTERS AND SETTERS 
	public Stack<String> getSentMessagesStack() {
		return sentMessagesStack;
	}
	public void setSentMessagesStack(Stack<String> sentMessagesStack) {
		this.sentMessagesStack = sentMessagesStack;
	}
	public Stack<String> getReceivedMessagesStack() {
		return receivedMessagesStack;
	}
	public void setReceivedMessagesStack(Stack<String> receivedMessagesStack) {
		this.receivedMessagesStack = receivedMessagesStack;
	}

	
	public String getSentMessage() {
		return sentMessage;
	}
	public void setSentMessage(String sentMessage) {
		this.sentMessage = sentMessage;
	}
	public String getReceivedMessage() {
		return receivedMessage;
	}
	public void setReceivedMessage(String receivedMessage) {
		this.receivedMessage = receivedMessage;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}

	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	//TOSTRING 
	@Override
	public String toString() {
		return "Player [ID=" + ID + ", playerName=" + playerName + "]";
	}
	//CONSTRUCTOR
	public Player(int iD,  String playerName) {
		super();
		ID = iD;
		this.playerName = playerName;
	} 
	//FUNCTION TO SEND A MESSAGE
	protected void sendMessage(String message, Player receiver) {
		this.setSentMessage(message); 
		receiver.setReceivedMessage(message);
		
		receiver.getReceivedMessagesStack().push(message);
		this.getSentMessagesStack().push(message);
		
		System.out.println(this.getPlayerName()+ " SENDS "+ receiver.getReceivedMessagesStack().peek()+""+this.getSentMessagesStack().size()+" TO "+ receiver.getPlayerName());
		if(receiver.getSentMessagesStack().size()<10) {
			receiver.sendMessage(message, this);
		}
	}
	
	
}
