package es.upm.dit.fprg23.p3;

import java.util.Date;

public class PruebaRegistroAnalisis {

	public static void main(String[] args) {
		
		// Crear instancias de parámetros
        Parametro globulosBlancos = new Parametro("Glóbulos Blancos", 10000, 4000, "células/mm³");
        Parametro hemoglobina = new Parametro("Hemoglobina", 16.0, 12.0, "g/dL");
        Parametro placas = new Parametro("Placas", 400000, 150000, "células/mm³");

        // Crear una instancia de Hemograma
        Date fechaHemograma = new Date();
        Hemograma hemograma = new Hemograma(fechaHemograma);

        // Incluir algunos parámetros en el análisis de hemograma
        try {
			hemograma.incluirParametro(globulosBlancos, 7500.0);
			hemograma.incluirParametro(hemoglobina, 14.5);
            hemograma.incluirParametro(placas, 200000.0);
		} catch (Exception e) {
			e.printStackTrace();
		}
        

        // Mostrar la fecha del análisis de hemograma
        System.out.println("Fecha del análisis de hemograma: " + hemograma.getFecha());
        
        // Verificar si el parámetro "PLACAS" está incluido en los resultados
        boolean incluido = hemograma.parametroIncluido(placas);
        System.out.println("¿El parámetro PLACAS está incluido? " + incluido);

        // Contar el número de parámetros medidos en el análisis de hemograma
        int numParametros = hemograma.contarParametrosMedidos();
        System.out.println("Número de parámetros medidos: " + numParametros);

        // Verificar si todas las mediciones de parámetros son correctas
        boolean todosCorrectos = hemograma.todosParametrosCorrectos();
        System.out.println("¿Todos los parámetros son correctos? " + todosCorrectos);

        // Crear un paciente
        Paciente paciente = new Paciente("123456789", "Juan", "Pérez", 1990, 175, 70.0, GrupoSanguineo.A_POSITIVO);

        // Agregar el análisis de hemograma al historial del paciente
        paciente.agregarAnalisis(hemograma);

        // Imprimir el historial de análisis del paciente antes de borrar
        System.out.println("Historial antes de borrar:");
        for (Analisis analisis : paciente.getHistorialAnalisis()) {
            analisis.imprimirAnalisis();
        }

        // Borrar los análisis de hemograma anteriores a una fecha específica
        Date fechaLimite = new Date(); // Puedes ajustar la fecha según tus necesidades
        paciente.borrarAnalisisHemogramaAnterioresFecha(fechaLimite);

        // Imprimir el historial de análisis del paciente después de borrar
        System.out.println("\nHistorial después de borrar:");
        for (Analisis analisis : paciente.getHistorialAnalisis()) {
            analisis.imprimirAnalisis();
        }
        
        // Continue desarrollando su código de pruebas a partir de aquí.
            
        
	}

}
