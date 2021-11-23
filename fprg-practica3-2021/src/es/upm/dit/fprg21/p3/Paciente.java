package es.upm.dit.fprg21.p3;

public class Paciente {
	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;
	private int altura;
	private int peso;
	private GrupoSanguineo grupoSanguineo;
	private double[] temperatura;
	private int presionSistolica;
	private int presionDistolica;


	/**
	 * Constructor de la clase Paciente
	 * 
	 * @param dni
	 *            String con el dni del paciente que queremos crear
	 * @param nombre
	 *            String con el nombre del paciente que queremos crear
	 * @param apellidos
	 *            String con los apellidos del paciente que queremos crear
	 * @param edad
	 *            int con la edad asignada al paciente que queremos crear
	 * @param altura
	 *            int con la altura del paciente        
	 * @param peso
	 *            int con el peso  del paciente
	 * @param presionSistolica
	 *            int con el presionSistolica del paciente
	 * @param presionDistolica
	 *            double con la presionDistolica del paciente
	 */
	
	
	
	
	public Paciente(String dni, String nombre, String apellidos, int edad, int altura, int peso, int presionSistolica, int presionDistolica) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
		this.presionSistolica = presionSistolica;
		this.presionDistolica = presionDistolica;
		this.grupoSanguineo = GrupoSanguineo.DESCONOCIDO;
		this.temperatura = new double[5];
	}


	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}


	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}


	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	/**
	 * @return the grupoSanguineo
	 */
	public GrupoSanguineo getGrupoSanguineo() {
		return grupoSanguineo;
	}

	/**
	 * @param grupoSanguineo the grupoSanguineo to set
	 */
	public void setGrupoSanguineo(GrupoSanguineo grupoSanguineo) {
		this.grupoSanguineo = grupoSanguineo;
	}


	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}


	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}


	/**
	 * @return the altura
	 */
	public int getAltura() {
		return altura;
	}


	/**
	 * @param altura the altura to set
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}


	/**
	 * @return the peso
	 */
	public int getPeso() {
		return peso;
	}


	/**
	 * @param peso the peso to set
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}


	/**
	 * @return the temperatura
	 */
	public double[] getTemperatura() {
		return temperatura;
	}


	/**
	 * @param temperatura the temperatura to set
	 */
	public void setTemperatura(double[] temperatura) {
		this.temperatura = temperatura;
	}


	/**
	 * @return the presionSistolica
	 */
	public int getPresionSistolica() {
		return presionSistolica;
	}


	/**
	 * @param presionSistolica the presionSistolica to set
	 */
	public void setPresionSistolica(int presionSistolica) {
		this.presionSistolica = presionSistolica;
	}


	/**
	 * @return the presionDistolica
	 */
	public int getPresionDistolica() {
		return presionDistolica;
	}


	/**
	 * @param presionDistolica the presionDistolica to set
	 */
	public void setPresionDistolica(int presionDistolica) {
		this.presionDistolica = presionDistolica;
	}
}