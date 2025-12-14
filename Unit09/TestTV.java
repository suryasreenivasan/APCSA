
public class TestTV {

	public static void main(String[] args) {
		TV myTV = new TV();
		myTV.turnOn();
		myTV.setChannel(100);
		myTV.setVolume(5);
		System.out.println(myTV.toString());
		myTV.channelDown();
		myTV.volumeUp();
		System.out.println(myTV.toString());
		myTV.setChannel(200);
		myTV.setVolume(10);
	
	}

}
