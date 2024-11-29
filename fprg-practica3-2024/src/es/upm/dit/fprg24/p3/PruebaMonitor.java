package es.upm.dit.fprg24.p3;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class PruebaMonitor {
    public static void main(String[] args) {
            // Crear algunos dispositivos de ejemplo
            InstrumentoClinico dispositivo1 = new InstrumentoClinico("IC001", "Máquina ECG", "Máquina para electrocardiogramas", 
                Tipo.ECG, 2020, 3, false, true, 1500, 200, 1000);
            dispositivo1.setHorasDeUso(50);
            DispositivoMedico dispositivo2 = new InstrumentoClinico("IC002", "Ventilador Mecánico", "Ventilador para soporte respiratorio", 
                Tipo.RESPIRADOR, 2021, 2, false, true, 2000, 250, 500);
            DispositivoMedico dispositivo3 = new DispositivoMedico("DM001", "Bisturí Láser", "Bisturí para cirugía", 
                Tipo.DESCONOCIDO, 2019, 5, false, false, 1200, 300);

            // Crear una instancia del monitor

            // Añadir dispositivos al monitor


            // Obtener el conjunto de dispositivos en uso

            // Contar los dispositivos en uso


            // Listar dispositivos por estado


            // Contar dispositivos por tipo


            // Obtener el área de un dispositivo específico


            // Listar dispositivos de un área específica



            // Obtener el dispositivo más utilizado


            // Obtener dispositivos en mantenimiento


            // Obtener el dispositivo más caro en un área


            // Calcular el consumo total en un área

            // Imprimir dispositivos por área

            // Trasladar dispositivos de área
    }
}
