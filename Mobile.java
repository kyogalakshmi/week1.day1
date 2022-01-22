package week1.day1;

public class Mobile {
	
	long number = 9467837483784L;

	public void sendMsg() { // public - access modifier
		System.out.println("This is my First Message");
	}
	
	void makeCall() { // default - access modifier
		System.out.println("Trying to calling this Number... "+number);
	}
	private long saveContact(long altnum) { // private - access modifier
		System.out.println("Saving a Alternate number - "+altnum);
		return altnum;
	}
	
	public static void main(String[] args) {
		Mobile obj1 = new Mobile();
		obj1.sendMsg();
		obj1.makeCall();
		obj1.saveContact(35467978098080L);
	}
}
