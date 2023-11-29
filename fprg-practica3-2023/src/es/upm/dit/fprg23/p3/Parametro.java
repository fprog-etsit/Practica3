package es.upm.dit.fprg23.p3;

public class Parametro {

	private String nombre;
	private double umbralMaximo, umbralMinimo;
	private String unidades;
	
	public Parametro(String nombre, double umbralMaximo, double umbralMinimo, String unidades) {
		this.nombre = nombre;
		this.umbralMaximo = umbralMaximo;
		this.umbralMinimo = umbralMinimo;
		this.unidades = unidades;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getUmbralMaximo() {
		return umbralMaximo;
	}

	public void setUmbralMaximo(double umbralMaximo) {
		this.umbralMaximo = umbralMaximo;
	}

	public double getUmbralMinimo() {
		return umbralMinimo;
	}

	public void setUmbralMinimo(double umbralMinimo) {
		this.umbralMinimo = umbralMinimo;
	}

	public String getUnidades() {
		return unidades;
	}

	public void setUnidades(String unidades) {
		this.unidades = unidades;
	}
	
	
	
}
