<img  align="left" width="150" style="float: left;" src="https://www.upm.es/sfs/Rectorado/Gabinete%20del%20Rector/Logos/UPM/CEI/LOGOTIPO%20leyenda%20color%20JPG%20p.png">

<img  align="right" width="250" style="float: right;" src="logos/LogoMoodleOscuro.png">

<br/><br/>



# Práctica 3 - Herencia, colecciones y diccionarios

## Contenido

- [Práctica 3 - Herencia, colecciones y diccionarios](#práctica-3---herencia-colecciones-y-diccionarios)
  - [Contenido](#contenido)
  - [Introducción](#introducción)
  - [Objetivos](#objetivos)
  - [Requisitos Previos](#requisitos-previos)
  - [Temas relacionados con la práctica](#temas-relacionados-con-la-práctica)
  - [Actividades de la práctica](#actividades-de-la-práctica)
    - [Creación del proyecto](#creación-del-proyecto)
    - [Implementación de la clase `InstrumentoClinico`](#implementación-de-la-clase-instrumentoclinico)
    - [Creación de la clase `MonitorDeDispositivos`](#creación-de-la-clase-monitordedispositivos)
    - [Pruebas de funcionamiento en `PruebaMonitor`](#pruebas-de-funcionamiento-en-pruebamonitor)
  - [Evaluación](#evaluación)
  - [Entrega de la práctica](#entrega-de-la-práctica)



## Introducción

Durante este curso, se realizarán prácticas orientadas a modelar el inventario de dispositivos médicos en un hospital. En sistemas de gestión hospitalarios reales existen modelos similares, aunque para simplificar la práctica y ajustarla al temario, se han tomado ciertas simplificaciones en el diseño que en un sistema profesional del campo de la ingeniería no serían tolerables. Se menciona esto para que el alumno sea consciente de que esta práctica es un trabajo introductorio al mundo de la programación.

En la anterior práctica se desarrolló un sistema para gestionar el inventario de dispositivos de un hospital. En esta práctica, se va a desarrollar un sistema para gestionar el registro de los dispositivos actualmente en funcionamiento en un hospital. Es decir, el sistema nos permitirá saber qué dispositivos están actualmente en uso y en qué áreas del hospital se están usando.

El sistema incluirá funcionalidades para realizar un seguimiento del estado de los dispositivos, gestionar su asignación a diferentes áreas, y calcular estadísticas sobre su uso y mantenimiento.

A partir de este punto, se enuncian las diferentes actividades a desarrollar en esta práctica. Se recomienda leer y comprender el enunciado entero antes de comenzar a trabajar.

## Objetivos

- Manejo de colecciones y diccionarios
- Uso de herencia y sobrescritura de métodos
- Gestión de excepciones
- Reutilización de métodos

## Requisitos Previos

Disponer de un entorno de desarrollo como Eclipse que permita desarrollar programas en el lenguaje de programación Java.

## Temas relacionados con la práctica

Temas 2, 3, 4, 5, 6 y 8 del temario del curso.

## Actividades de la práctica

### Creación del proyecto

Se pueden utilizar distintos entornos de desarrollo (IDEs) para desarrollar código Java, pero para esta práctica se darán indicaciones para **Eclipse**.

En Eclipse debe seguir los siguientes pasos:

- Descargue de Github el fichero ZIP correspondiente a _Práctica 3 - Main_, pulsando el botón _Code -> Download ZIP_.
- Importe el proyecto con _Import -> Existing Projects into Workspace_ e indique la localización del fichero ZIP descargado usando la opción _Select archive file_.
- Dentro del proyecto, en la carpeta _src_, encontrará un paquete llamado **es.upm.dit.fprg24.p3**, siguiendo el convenio de nomenclatura de paquetes: Práctica 3 (**p3**) de la asignatura FPRG Curso 2024-2025 (**fprg24**) de la Universidad Politécnica de Madrid (**upm**), Departamento de Ingeniería de Sistemas Telemáticos (**dit**), en España (**es**).
- También encontrará las clases ``PruebaMonitor.java``, ``Tipo.java`` y ``DispositivoMedico.java``.
- Todas las clases o interfaces que desarrolle deben de estar en el paquete es.upm.dit.fprg24.p3.

En este punto, ya deberíamos poder ver las clases mencionadas en nuestro espacio de trabajo y, si las abrimos, podremos ver su código, que se utilizará en la siguiente tarea.

> [!TIP]
> Es normal que en la clase ``PruebaMonitor.java`` aparezca un error en la creación del objeto de tipo `InstrumentoClinico`. Este error desaparecerá una vez se complete la primera sección de la práctica. También se puede comentar la línea para que el error desaparezca.

### Implementación de la clase `InstrumentoClinico`

La clase `InstrumentoClinico` es una extensión de la clase `DispositivoMedico`. Además de heredar esa clase, incorpora los siguientes atributos:
- horasDeUso: tipo _int_ (número total de horas que ha sido utilizado dicho instrumento)
- horasDeUsoMaximas: tipo _int_ (número máximo de horas que puede ser utilizado dicho instrumento antes de pasar por un mantenimiento)

Esta clase debe tener los siguientes métodos:

- Constructor: además de los parámetros necesarios para crear un DispositivoMedico, debe recibir como último parámetro el valor inicial del atributo `horasDeUsoMaximas`. El atributo `horasDeUso` debe inicializarse con valor 0.
- _getters_ y _setters_ de los atributos `horasDeUso` y `horasDeUsoMaximas`.
- boolean esNecesarioMantenimiento(): Determina si el instrumento necesita mantenimiento. Un instrumento requiere mantenimiento si sus horas de uso superan el límite máximo.
- double calcularConsumoTotal(): calcula el consumo energético total del instrumento basado en las horas de uso acumuladas.

Por último, esta clase debe sobrescribir el método `toString()` para proporcionar una descripción más detallada, incluyendo información sobre las horas de uso y si el instrumento necesita mantenimiento.

### Creación de la clase `MonitorDeDispositivos`

En esta tarea, se debe crear la clase `MonitorDeDispositivos` en el paquete correspondiente. Esta clase gestiona el registro de dispositivos que se encuentran actualmente en uso en el hospital, junto con las unidades o áreas en las que se está usando cada uno. La clase debe incluir el siguiente atributo:

- `registroDispositivos`, tipo `Map<DispositivoMedico, String>`: diccionario para almacenar cada dispositivo que está actualmente en funcionamiento junto con el nombre del área o unidad en el que se encuentra.

Además, deben implementarse todos los métodos indicados en el documento **Especificación de la clase MonitorDeDispositivos.pdf**, disponible en este repositorio.

> [!TIP]
> Recomendamos que no leáis el PDF directamente desde Github, sino que os lo descarguéis y lo abráis desde vuestro ordenador.

No se requiere seguir un orden estricto al desarrollar los métodos, aunque se recomienda seguir el orden por el que aparecen en la sección `Method details` de la especificación. Esto se debe a que algunos de los métodos anteriores podrían ser útiles para probar o desarrollar el resto de métodos requeridos.

> [!TIP]
> A continuación se muestra un ejemplo de lo que debe imprimir por consola el método `imprimirDispositivosPorArea()`:
```
Dispositivos agrupados por área:
Área: Quirófano
  - IC002: Ventilador Mecánico (Operativo: true)
  - DM001: Bisturí Láser (Operativo: false)
Área: UCI
  - IC001: Máquina ECG (Operativo: true)
```

### Pruebas de funcionamiento en `PruebaMonitor`

La clase `PruebaMonitor` debe incluir un método `main` que cree una instancia de `MonitorDeDispositivos`, agregue dispositivos médicos (de tipo `InstrumentoClinico` y de tipo `DispositivoMedico`), y ejecute varios métodos para probar su funcionamiento. Una vez que considere que su versión del sistema cumple todos los requisitos, podrá proceder a su entrega a través de Moodle, como se expone en el último apartado.

## Evaluación

La evaluación consistirá en una prueba escrita en la que se deberá resolver de forma individual una serie de ejercicios relacionados con lo desarrollado en esta práctica.

## Entrega de la práctica

La práctica debe entregarse mediante el enlace habilitado en Moodle antes de las 23:55 del **jueves 12 de Diciembre de 2024**.

Se debe entregar el fichero .zip generado como resultado de exportar el proyecto. Dicho fichero debe contener todas las carpetas y ficheros asociados al proyecto. Para realizar la exportación, siga los siguientes pasos:

1. Asegúrese de que tiene seleccionado el proyecto de la práctica en el explorador de paquetes de Eclipse.
2. Pulse sobre el botón derecho del ratón (o «File» dentro de la barra de menú superior), y a continuación sobre «Export».
3. Seleccione «Archive File» (dentro de la pestaña «General») en el menú que aparece, y pulse sobre el botón «Next».
4. En la siguiente ventana, asegúrese de que el proyecto correspondiente a la práctica está seleccionado, junto con los ficheros alojados en su interior.
5. Pulse el botón «Browse» para seleccionar el directorio donde quiere exportar el proyecto, y el nombre que le quiere dar.
6. Suba a Moodle el fichero .zip que se ha generado como resultado de realizar los pasos anteriores, que se encontrará en la carpeta que haya seleccionado en el paso anterior.
