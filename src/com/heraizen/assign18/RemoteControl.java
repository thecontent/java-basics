package com.heraizen.assign18;

public interface RemoteControl {
	boolean powerOnOff(); // Returns new state, on = true
	int volumeUp(int increment); // Returns new volume level
	int volumeDown(int decrement); // Returns new volume level
	void mute(); // Mutes sound output
}

//class DVD implements RemoteControl {
//	
//}
//
//class Remote implements RemoteControl {
//	
//}
