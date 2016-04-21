package net.keabotstudios.pesterchum;

import net.keabotstudios.pesterchum.server.Server;

public class Pesterchum {

	public static void main(String[] args) {
		if(args.length > 0 && args[0] == "server") {
			Server.launch(); // START PESTERCHUM SERVER
			return;
		} else {
			// START PESTERCHUM CLIENT
		}
	}

}
