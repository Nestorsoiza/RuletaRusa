package game;

public class Jugador {
	// Para que quieres el id? Incluso te dice que no se usa
	private int id;
	private String nombre;
	private boolean vivo;
	
	
	// Hombre para mi el jugador debe empezar vivo no?
	public Jugador(int id, String nombre, boolean vivo) {
		this.id = id;
		this.nombre = "Jugador " + id;
		// De hecho aqui no usas el parametro
		this.vivo = true;
	}

	public Jugador(int id) {
		this.id = id;
	}



	// Mal nombre de parametro
	public void disparar(Revolver r) {
		System.out.println("El" + nombre + " se apunta con la pistola");
		if (r.disparar()) {
			this.vivo = false;
			System.out.println("El" + nombre + " ha muerto");
		} else {
			System.out.println("El" + nombre + " se ha librado");
		}
	}

	public boolean isVivo() {
		return vivo;
	}
}
