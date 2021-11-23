package es.upm.dit.fprg21.p3;

import java.util.HashMap;

public class PruebaCuidadosIntensivos {
	
	public static void main(String[] args) throws Exception {
		// Creamos un área de hospitalización
		AreaHospitalizacion areaHospitalizacion = new AreaHospitalizacion("Ala Este", 3, 10, 20);
		
		// Creamos una unidad de cuidados intensivos
		CuidadosIntensivos cuidadosIntensivos = new CuidadosIntensivos(areaHospitalizacion, new HashMap<Long, Paciente>());
		
		// Creamos algunos pacientes
		Paciente p1 = new Paciente("00000000A", "Julio", "Lopez", 67, 175, 83, 120, 80);
		Paciente p2 = new Paciente("00000001B", "Julia", "Garcia", 22, 179, 66, 190, 72);
		Paciente p3 = new Paciente("60000002C", "Mario", "Iglesias", 33, 166, 70, 190, 67);
		Paciente p4 = new Paciente("30000003D", "María", "Vallejo", 82, 160, 73, 190, 91);
		
		// Asignamos a cada paciente su grupo sanguíneo
		p1.setGrupoSanguineo(GrupoSanguineo.A_NEGATIVO);
		p2.setGrupoSanguineo(GrupoSanguineo.CERO_NEGATIVO);
		p3.setGrupoSanguineo(GrupoSanguineo.A_POSITIVO);
		p4.setGrupoSanguineo(GrupoSanguineo.B_NEGATIVO);
		
		// Asignamos a cada paciente su histórico de temperaturas
		p1.setTemperatura(new double[]{37.3, 37.2, 40.0, 39.8});
		p2.setTemperatura(new double[]{36.0, 36.3, 36.2, 37.0});
		p3.setTemperatura(new double[]{37.1, 37.8, 38.1, 36.4});
		p4.setTemperatura(new double[]{40.2, 39.2, 38.1, 36.7});
		
		// Asignamos cada paciente a una habitación en el área de hospitalizacion.
		areaHospitalizacion.ingresaPaciente(p1, 0, 0, 0);
		areaHospitalizacion.ingresaPaciente(p2, 0, 0, 1);
		areaHospitalizacion.ingresaPaciente(p3, 0, 0, 2);
		areaHospitalizacion.ingresaPaciente(p4, 0, 0, 3);
		
		
		// Comprobamos si hay pacientes dentro de cuidados intensivos
		System.out.println("¿Hay pacientes en cuidados intensivos? " + cuidadosIntensivos.hayPacientesCuidadosIntensivos());
		
		// Intentamos ingresar algunos pacientes en cuidados intensivos
		System.out.println("Paciente 1 ingresado: " + cuidadosIntensivos.ingresaPacientesCuidadosIntensivos(0, 0, 0));
		Thread.sleep(2000); // Esperamos 2 segundos para ingresar al siguiente paciente
		System.out.println("Paciente 3 ingresado: " + cuidadosIntensivos.ingresaPacientesCuidadosIntensivos(0, 0, 2));
		Thread.sleep(2000); // Esperamos 2 segundos para ingresar al siguiente paciente
		System.out.println("Paciente 4 ingresado: " + cuidadosIntensivos.ingresaPacientesCuidadosIntensivos(0, 0, 3));
		
		// Comprobamos de nuevo si hay pacientes dentro de cuidados intensivos
		System.out.println("¿Hay pacientes en cuidados intensivos? " + cuidadosIntensivos.hayPacientesCuidadosIntensivos());
		
		// Comprobamos cual es el paciente que más tiempo lleva en cuidados intensivos
		System.out.println("El paciente que mas tiempo lleva es: " + cuidadosIntensivos.mayorTiempoCuidadosIntensivos().getNombre());
		
		// Intentamos ingresar el/la paciente alojada en la habitación 1-1-5, y comprobamos que da excepción
		// ya que no hay ningún paciente en esa habitación.
		try {
			cuidadosIntensivos.ingresaPacientesCuidadosIntensivos(1, 1, 5);
		} catch (Exception e) {
			// Esta sentencia imprime por pantalla un pequeño resumen de la
			// excepción.
			e.printStackTrace();
		}
		
		// TODO: rellene todas las sentencias que considere necesarias para probar
		// que su clase CuidadosIntensivos cumple las especificaciones del enunciado de la
		// práctica.
		
		// Recuerde que debería probar que el resto de métodos desarrollados en la clase funcionan correctamente.
	}
}