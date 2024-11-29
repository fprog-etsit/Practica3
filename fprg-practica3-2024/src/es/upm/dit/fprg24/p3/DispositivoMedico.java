package es.upm.dit.fprg24.p3;

public class DispositivoMedico {
	
    private String id;
    private String nombre;
    private String descripcion;
    private Tipo tipo;
    private int fabricacion;
    private int garantia;
    private boolean ocupado;
    private boolean operativo;
    private double precio;
    private double potencia;
    
	public DispositivoMedico(String id, String nombre, String descripcion, Tipo tipo, int fabricacion, int garantia,
			boolean ocupado, boolean operativo, double precio, double potencia) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tipo = tipo;
		this.fabricacion = fabricacion;
		this.garantia = garantia;
		this.ocupado = ocupado;
		this.operativo = operativo;
		this.precio = precio;
		this.potencia = potencia;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public int getFabricacion() {
		return fabricacion;
	}

	public void setFabricacion(int fabricacion) {
		this.fabricacion = fabricacion;
	}

	public int getGarantia() {
		return garantia;
	}

	public void setGarantia(int garantia) {
		this.garantia = garantia;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	public boolean isOperativo() {
		return operativo;
	}

	public void setOperativo(boolean operativo) {
		this.operativo = operativo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "DispositivoMedico [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", tipo=" + tipo
				+ ", fabricacion=" + fabricacion + ", garantia=" + garantia + ", ocupado=" + ocupado + ", operativo="
				+ operativo + ", precio=" + precio + ", potencia=" + potencia + "]";
	}
    
    public boolean enGarantia(int fechaActual) {
    	return (fabricacion + garantia) <= fechaActual;
    }
    
    public double calcularConsumoEnergetico(int horasUso) {
        // El consumo se calcula como potencia (kW) * tiempo (h).
        return (potencia / 1000) * horasUso;
    }
}