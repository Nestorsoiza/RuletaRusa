package game;

public class Juego  {
	// dije que ya mejor os acostumbreis a Collection
	private Jugador[] jugadores;
	private Revolver revolver;
	
	public Juego(int numJugadores) {
		jugadores = new Jugador[comprobarJugadores(numJugadores)];
		crearJugadores();
		revolver = new Revolver();
	}

	private void crearJugadores() {
		for (int i = 0; i < jugadores.length; i++) {
			jugadores[i] = new Jugador(i + 1);
		}
		
	}

	private int comprobarJugadores(int numJugadores) {
		// Un poco enrevesada la condicion
		// La negacion puede quitarse pasando cambiando AND por OR y viceversa
		// y negando cada miembro. En tu ejemplo quedaria:
		// if (numJugadores < 1 || numJugadores > 6)) {
		if (!(numJugadores >= 1 && numJugadores <= 6)) {
			numJugadores = 6;
		}
		return numJugadores;
	}

	public boolean finJuego() {
		// Veo de aqui al final que no te gustan los "for mejorados"
		for (int i = 0; i < jugadores.length; i++) {
			if (!jugadores[i].isVivo()) {
				return true;
			}
		}
		return false;
	}
	public void ronda() {
		for (int i = 0; i < jugadores.length; i++) {
			jugadores[i].disparar(revolver);
		}
		
	}
	// Que es esto de V2?
	public void rondaV2() {
		for (int i = 0; i < jugadores.length; i++) {
			jugadores[i].disparar(revolver);
			if (!jugadores[i].isVivo()); {
				return;
			}
			
		}
	}
}

