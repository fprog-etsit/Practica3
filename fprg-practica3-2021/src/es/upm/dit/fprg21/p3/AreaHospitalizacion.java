package es.upm.dit.fprg21.p3;

public class AreaHospitalizacion {

	private static final double LIMITE_TEMPERATURA = 37.5;

	private String nombre;
	private Paciente[][][] pacientes;

	/**
	 * Constructor de la clase AreaHospitalizacion. Recibe como parámetros un nombre,
	 * y el tamaño en tres dimensiones del área de hospitalización (plantas, pasillos y habitaciones).
	 * @param nombre
	 * 				Nombre del área de hospitalización
	 * @param plantas
	 * 				Número de plantas del área de hospitalización
	 * @param pasillos
	 * 				Número de pasillos que tiene cada planta
	 * @param habitaciones
	 * 				Número de habitaciones que tiene cada pasillo
	 * @throws Exception
	 * 				Lanza una excepción si el número de plantas, pasillos o habitaciones es menor o igual a 0.
	 */
	public AreaHospitalizacion(String nombre, int plantas, int pasillos, int habitaciones) throws Exception {
		if(plantas <= 0 || pasillos <= 0 || habitaciones <= 0) throw new Exception("Número de plantas o habitaciones incorrecto.");
		this.nombre = nombre;
		this.pacientes = new Paciente[plantas][pasillos][habitaciones];
	}

	/**
	 * Devuelve el nombre del área de hospitalización.
	 * 
	 * @return nombre del área de hospitalización
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Asigna un nombre al área de hospitalización.
	 * 
	 * @param nombre
	 * 				Nuevo nombre a asignar al área de hospitalización
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve el array con todos los pacientes hospitalizados en el área.
	 * 
	 * @return Array de pacientes hospitalizados
	 */
	public Paciente[][][] getPacientes() {
		return pacientes;
	}

	/**
	 * Asigna el array de los pacientes hospitalizados al área.
	 * 
	 * @param pacientes
	 * 					Nuevo array a asignar al área de hospitalización
	 */
	public void setPacientes(Paciente[][][] pacientes) {
		this.pacientes = pacientes;
	}

	/**
	 * Comprueba si existe una habitación según el número de planta, pasillo y habitación.
	 * 
	 * @param planta
	 * 				Número de planta
	 * @param pasillo
	 * 				Número de pasillo
	 * @param habitacion
	 * 				Número de habitación
	 * @return Devuelve un boolean, true si la habitación existe, y false si no.
	 * 
	 */
	public boolean existeHabitacion(int planta, int pasillo, int habitacion) {
		return (planta >= 0 && habitacion >= 0 && pasillo >= 0 &&
				planta < pacientes.length && 
				pasillo < pacientes[planta].length &&
				habitacion < pacientes[planta][pasillo].length);
	}

	/**
	 * 
	 * Comprueba si una habitación está ya ocupada por un paciente.
	 * 
	 * @param planta
	 * 				Número de planta
	 * @param pasillo
	 * 				Número de pasillo
	 * @param habitacion
	 * 				Número de habitación
	 * @return Devuelve un boolean, true si la habitación está ocupada, y false si no.
	 * @throws Exception 
	 * 				Lanza una excepción si la habitación no existe.
	 */
	public boolean habitacionOcupada(int planta, int pasillo, int habitacion) throws Exception {
		if(!existeHabitacion(planta, pasillo, habitacion)) throw new Exception("La habitación no existe.");
		return pacientes[planta][pasillo][habitacion] != null;
	}

	/**
	 * Coloca un paciente en una determinada habitación.
	 * 
	 * @param paciente
	 * 				Paciente a ingresar
	 * @param planta
	 * 				Número de planta
	 * @param pasillo
	 * 				Número de pasillo
	 * @param habitacion
	 * 				Número de habitación
	 * @throws Exception
	 * 				Lanza una excepción si la habitación ya está ocupada o si el paciente es nulo.	
	 */
	public void ingresaPaciente(Paciente paciente, int planta, int pasillo, int habitacion) throws Exception {
		if(habitacionOcupada(planta, pasillo, habitacion) || paciente == null) throw new Exception("La habitación ya está ocupada, o el paciente no existe.");
		pacientes[planta][pasillo][habitacion] = paciente;
	}

	/**
	 * Devuelve el paciente que hay en una determinada habitación.
	 * 
	 * @param planta
	 * 				Número de planta
	 * @param pasillo
	 * 				Número de pasillo
	 * @param habitacion
	 * 				Número de habitación
	 * @return El paciente hospitalizado en esta habitación
	 * @throws Exception
	 * 				Lanza una excepción si no hay ningún paciente en esa habitación
	 */
	public Paciente getPaciente(int planta, int pasillo, int habitacion) throws Exception{
		if(!habitacionOcupada(planta, pasillo, habitacion)) throw new Exception("No hay ningún paciente en la habitación seleccionada.");
		return pacientes[planta][pasillo][habitacion];
	}

	/**
	 * Da el alta a un paciente. Es decir, lo saca de la habitación en la que estaba hospitalizado.
	 * @param planta
	 * 				Número de planta
	 * @param pasillo
	 * 				Número de pasillo
	 * @param habitacion
	 * 				Número de habitación
	 * @return El paciente al que se le da el alta
	 * @throws Exception
	 * 				Lanza una excepción si no hay ningún paciente en esa habitación.
	 */
	public Paciente altaPaciente(int planta, int pasillo, int habitacion) throws Exception{
		if(!habitacionOcupada(planta, pasillo, habitacion)) throw new Exception("No hay ningún paciente en la habitación seleccionada.");
		Paciente paciente = getPaciente(planta, pasillo, habitacion);
		pacientes[planta][pasillo][habitacion] = null;
		return paciente;
	}

	/**
	 * Obtiene el grupo sanguíneo del paciente alojado en una determinada habitación.
	 * @param planta
	 * 				Número de planta
	 * @param pasillo
	 * 				Número de pasillo
	 * @param habitacion
	 * 				Número de habitación
	 * @return El grupo sanguíneo del paciente.
	 * @throws Exception
	 * 				Lanza una excepción si no hay ningún paciente en la habitación indicada.
	 */
	public GrupoSanguineo getGrupoSanguineoDePaciente(int planta, int pasillo, int habitacion) throws Exception {
		if(!habitacionOcupada(planta, pasillo, habitacion)) throw new Exception("No hay ningún paciente en la habitación seleccionada.");
		return getPaciente(planta, pasillo, habitacion).getGrupoSanguineo();
	}

	/**
	 * Obtiene el número de pacientes hospitalizados en un determinado pasillo de la planta indicada.
	 * @param planta
	 * 				Número de planta
	 * @param pasillo
	 * 				Número de pasillo
	 * @return Devuelve el número de pacientes en ese pasillo
	 * @throws Exception
	 * 				Lanza una excepción si la planta o el pasillo indicados no existen.
	 */
	public int getNumPacientesEnPasillo(int planta, int pasillo) throws Exception {
		if(planta < 0 || planta >= pacientes.length || pasillo < 0 || pasillo >= pacientes[planta].length) throw new Exception("La planta o el pasillo introducido no existe.");
		int numPacientes = 0;
		for(int habitacion = 0; habitacion < pacientes[planta][pasillo].length; habitacion++) {
			if(habitacionOcupada(planta, pasillo, habitacion)) numPacientes++; 
		}
		return numPacientes;
	}

	/**
	 * Calcula el número de días que el paciente de una determinada habitación ha tenido fiebre
	 * (temperatura corporal >= 37.5ºC).
	 * 
	 * @param planta
	 * 				Número de planta
	 * @param pasillo
	 * 				Número de pasillo
	 * @param habitacion
	 * 				Número de habitación
	 * @return Número de días que el paciente ha tenido fiebre
	 * @throws Exception
	 * 				Lanza una excepción si no hay ningún paciente en la habitación indicada.
	 */
	public int getNumeroDiasFiebre(int planta, int pasillo, int habitacion) throws Exception{
		if(!habitacionOcupada(planta, pasillo, habitacion)) throw new Exception("No hay ningún paciente en la habitación seleccionada.");
		Paciente paciente = getPaciente(planta, pasillo, habitacion);
		double[] historicoTemperaturas = paciente.getTemperatura();
		int contadorDias = 0;
		for(int dia = 0; dia<historicoTemperaturas.length; dia++) {
			if(historicoTemperaturas[dia] >= LIMITE_TEMPERATURA) contadorDias++;
		}
		return contadorDias;
	}

	/**
	 * Obtiene el número de habitación en la que se encuentra un determinado paciente.
	 * @param planta
	 * 				Número de planta
	 * @param pasillo
	 * 				Número de pasillo
	 * @param dni
	 * 				DNI del paciente
	 * @return El número de la habitación en la que se encuentra el paciente.
	 * @throws Exception
	 * 				Lanza excepción si no hay ningún paciente hospitalizado en ese pasillo con el DNI indicado.
	 */
	public int getHabitacionPaciente(int planta, int pasillo, String dni) throws Exception {
		if(planta < 0 || planta >= pacientes.length || pasillo < 0 || pasillo >= pacientes[planta].length) throw new Exception("La planta o el pasillo introducido no existe.");
		for(int habitacion = 0; habitacion < pacientes[planta][pasillo].length; habitacion++) {
			if (habitacionOcupada(planta, pasillo, habitacion)){
				Paciente paciente = pacientes[planta][pasillo][habitacion];
				if(paciente.getDni().equalsIgnoreCase(dni)) return habitacion;
			}
		}
		throw new Exception("No hay ningún paciente hospitalizado en ese pasillo de esa planta con el DNI introducido.");
	}

	/**
	 * Obtiene el número de planta en la que se encuentra un determinado paciente.
	 * @param dni
	 * 				DNI del paciente
	 * @return El número de planta en la que se encuentra el paciente.
	 * @throws Exception
	 * 				Lanza una excepción si no hay ningún paciente hospitalizado con el DNI introducido.
	 */
	public int getPlantaPaciente(String dni) throws Exception {

		for(int planta = 0; planta < pacientes.length; planta++) {
			for(int pasillo = 0; pasillo < pacientes[planta].length; pasillo++) {
				for(int habitacion = 0; habitacion < pacientes[planta][pasillo].length; habitacion++) {
					if (habitacionOcupada(planta, pasillo, habitacion)){
						Paciente paciente = pacientes[planta][pasillo][habitacion];
						if(paciente.getDni().equalsIgnoreCase(dni)) return planta;
					}
				}
			}
		}
		throw new Exception("No hay ningún paciente hospitalizado con el DNI introducido.");
	}

	/**
	 * Obtiene la media de edad de los pacientes hospitalizados en un determinado pasillo.
	 * 
	 * @param planta
	 * 				Número de planta
	 * @param pasillo
	 * 				Número de pasillo
	 * @return La media de edad de los pacientes hospitalizados en ese pasillo.
	 * @throws Exception
	 * 				Lanza una excepción si no hay ningún paciente en ese pasillo.
	 */
	public double getMediaEdadPacientesPasillo(int planta, int pasillo) throws Exception {
		if(planta < 0 || planta >= pacientes.length || pasillo < 0 || pasillo >= pacientes[planta].length) throw new Exception("La planta o el pasillo introducido no existe.");
		int sumaEdades = 0;
		int sumaPacientes = 0;
		for(int habitacion = 0; habitacion < pacientes[planta][pasillo].length; habitacion++) {
			if (habitacionOcupada(planta, pasillo, habitacion)){
				Paciente paciente = pacientes[planta][pasillo][habitacion];
				if(paciente != null) {
					sumaEdades += paciente.getEdad();
					sumaPacientes++;
				}	
			}
		}
		if (sumaPacientes == 0) throw new Exception("No hay pacientes en ese pasillo.");
		return (double) sumaEdades/sumaPacientes;
	}

	/**
	 * Obtiene el paciente con la temperatura corporal media más alta en una determinada planta.
	 * @param planta
	 * 				Número de planta
	 * @return Paciente con la temperatura corporal media más alta.
	 * @throws Exception
	 * 				Lanza una excepción si la planta introducida no existe.
	 */
	public Paciente getPacienteConTemperaturaMediaMasAltaDeLaPlanta(int planta) throws Exception{
		if(planta < 0 || planta >= pacientes.length) throw new Exception("La planta introducida no existe.");
		double maxTemperatura = Double.MIN_VALUE;
		Paciente pacienteMaxTemperatura = null;
		for(int pasillo = 0; pasillo < pacientes[planta].length; pasillo++) {
			for(int habitacion = 0; habitacion < pacientes[planta][pasillo].length; habitacion++) {
				if (habitacionOcupada(planta, pasillo, habitacion)){
					Paciente paciente = pacientes[planta][pasillo][habitacion];
					if(paciente != null) {
						double[] historicoTemperaturas = paciente.getTemperatura();
						double totalTemperatura = 0;
						for(int dia = 0; dia<historicoTemperaturas.length; dia++) {
							totalTemperatura+=historicoTemperaturas[dia];
						}
						double mediaTemperatura = totalTemperatura/historicoTemperaturas.length;
						if(mediaTemperatura > maxTemperatura) {
							maxTemperatura = mediaTemperatura;
							pacienteMaxTemperatura = paciente;
						}
					}
				}

			}
		}
		return pacienteMaxTemperatura;
	}
}