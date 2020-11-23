package com.heraizen.assign18;

public interface MusicInstrument {

	void play();
	
}

class Flute implements MusicInstrument {
	public void play() {
		System.out.println("“Flute is playing toot toot toot toot”");
	}
}

class Piano implements MusicInstrument {
	public void play() {
		System.out.println("“Piano is playing pee peee peee ”");
	}
}

class Guitar implements MusicInstrument {
	public void play() {
		System.out.println("“Guitar is playing tin tin tin tin ”");
	}
}

