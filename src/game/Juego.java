package game;

public class Juego  {
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
		if (!(numJugadores >= 1 && numJugadores <= 6)) {
			numJugadores = 6;
		}
		return numJugadores;
	}

	public boolean finJuego() {
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
	public void rondaV2() {
		for (int i = 0; i < jugadores.length; i++) {
			jugadores[i].disparar(revolver);
			if (!jugadores[i].isVivo()); {
				return;
			}
			
		}
	}
}

