package game;

public class Jugador {
	private int id;
	private String nombre;
	private boolean vivo;
	
	
	
	public Jugador(int id, String nombre, boolean vivo) {
		this.id = id;
		this.nombre = "Jugador " + id;
		this.vivo = true;
	}

	public Jugador(int id) {
		this.id = id;
	}



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
