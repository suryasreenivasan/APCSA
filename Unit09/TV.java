
public class TV {

	private int currentChannel = 1; // 1-120
	private int volumeLevel = 1; // 1-7
	private boolean on = false;
	
	TV() {
		
	}
	
	public void turnOn() {
		on = true;
	}
	
	public void turnOff() {
		on = false;
	}
	
	public void setChannel(int newChannel) {
		if (!on) {
			return;
		}
		if (newChannel < 1 || newChannel > 120) {
			System.out.println("invalid channel");
			return;
		}
		currentChannel = newChannel;
	}
	
	public void setVolume(int newVolume) {
		if (!on) {
			return;
		}
		if (newVolume > 7 || newVolume < 0) {
			System.out.println("invalid volume");
			return;
		}
		volumeLevel = newVolume;
	}
	
	public void channelUp() {
		if (!on) {
			return;
		}
		if (currentChannel == 120) {
			currentChannel = 1;
			return;
		}
		currentChannel++;
	}
	
	public void channelDown() {
		if (!on) {
			return;
		}
		if (currentChannel == 1) {
			currentChannel = 120;
		}
		currentChannel--;
	}
	
	public void volumeUp() {
		if (!on) {
			return;
		}
		if (volumeLevel == 7) {
			System.out.println("maximum volume");
			return;
		}
		volumeLevel++;
	}
	
	public void volumeDown() {
		if (!on) {
			return;
		}
		if (volumeLevel == 0) {
			System.out.println("minimum volume");
			return;
		}
		volumeLevel--;
	}
	
	public String toString() {
		if (on) {
			return "the tv is on and its volume is " + volumeLevel + " and its channel is " + currentChannel;
		}
		return "the tv is not on and its volume is " + volumeLevel + " and its channel is " + currentChannel;
	}

}
