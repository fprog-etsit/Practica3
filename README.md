<img  align="left" width="150" style="float: left;" src="https://www.upm.es/sfs/Rectorado/Gabinete%20del%20Rector/Logos/UPM/CEI/LOGOTIPO%20leyenda%20color%20JPG%20p.png">

<img  align="right" width="250" style="float: right;" src="logos/LogoFPROG.png">

<br/><br/>

# Práctica 3 - Conjuntos y diccionarios


## Contenido

-   [Introducción](#introducción)
-   [Objetivos](#objetivos)
-   [Requisitos Previos](#requisitos-previos)
-   [Temas relacionados con la práctica](#temas-relacionados-con-la-práctica)
-   [Actividades de la práctica](#actividades-de-la-práctica)
    -   [Creación del proyecto](#creación-del-proyecto)
    -   [Creación de la clase CuidadosIntensivos.java](#creación-de-la-clase-cuidadosintensivos.java)
    -   [Extensión de la clase PruebaCuidadosIntensivos.java](#extensión-de-la-clase-pruebacuidadosintensivos.java)
-   [Evaluación](#evaluación)
-   [Entrega de la práctica](#entrega-de-la-práctica)



## Introducción

En la presente práctica, vamos a desarrollar un modelo simplificado de una aplicación de gestión de la unidad de cuidados intensivos de un area de hospitalización. Cuidados Intensivos gestionará el ingreso de los pacientes procedentes del área de hospitalización, registrando también su hora de ingreso.

A partir de este punto, se enuncian las diferentes actividades a desarrollar en esta práctica. Se recomienda encarecidamente leer y comprender el enunciado entero antes de comenzar a trabajar. Lea también con antención el javadoc proporcionado de Cuidados Intensivos.


## Objetivos

- Manejo de conjuntos y diccionarios
- Creación y manejo de excepciones
- Reutilización de métodos

## Requisitos Previos

Disponer de un entorno de desarrollo como Eclipse que permita desarrollar programas en el lenguaje de programación Java.


## Temas relacionados con la práctica

Temas 2, 3, 4, 5, 6 y 8 del temario del curso.


## Actividades de la práctica

### Creación del proyecto

Existen diferentes entornos de desarrollo (IDEs) para desarrollar código Java, pero tanto en esta práctica como en las siguientes, se darán indicaciones para [**Eclipse**](http://www.eclipse.org).

En Eclipse debe seguir los siguientes pasos:

- Descargue de Github pulsando sobre el botón _Code->Download ZIP_ el fichero zip que encontrará en la entrada _Práctica 3 - Master_.
- Importe el proyecto con _Import-$>$Existing Projects into Workspace_ e indicar la localización del fichero zip descargado usando la opción _Select archive file_.
- Dentro del proyecto, en la carpeta _src_, encontrará un paquete llamado **es.upm.dit.fprg21.p3**, siguiendo el convenio más extendido de nomenclatura de paquetes: Práctica 3 (**p3**) de la asignatura FPRG Curso 2021-2022 (**fprg21**) del Departamento de Ingeniería de Sistemas Telemáticos (**dit**) de la Universidad Politécnica de Madrid (**upm**) de España (**es**).
- También encontrará las clases **AreaHospitalizacion.java**, **Paciente.java**, **PruebaCuidadosIntensivos.java** y **GrupoSanguineo.java**.
- Todas las clases que desarrolle deben de estar en el paquete _es.upm.dit.fprg21.p3_.

En este punto, ya deberíamos poder ver las cuatro clases mencionadas en nuestro espacio de trabajo y, si las abrimos, podremos ver su código, que se utilizará en la siguiente tarea.


### Creación de la clase CuidadosIntensivos.java

En esta tarea, se debe crear una clase en el paquete de la práctica. Dicha clase será un modelo cuidados intensivos de un área de hospitalización. Como se ha comentado antes, la clase registra pacientes en cuidados intensivos y su hora de ingreso. Para ello, la clase deberá tener los siguientes atributos:

- area, tipo AreaHospitalizacion.
- pacientesCuidadosIntensivos, tipo HashMap<Long, Paciente>, es decir, una map que asociará la fecha y hora expresadas en milisegundos (con el tipo Long) con la clase Paciente.
 

Además, deben implementarse todos los métodos que se exponen en el documento **Especificación de CuidadosIntensivos.pdf**, disponible en este repositorio. Al realizar los métodos tendrá la necesidad de introducir la hora y fecha a la que se ha registrado el paciente. Para ello puede usar la siguiente función:

System.currentTimeMillis()

Dicha función devuelve la hora actual del sistema expresada en milisegundos (tipo Long). Los milisegundos van desde el 1 de enero de 1970 hasta la actualidad.


**IMPORTANTE**: Al igual que en la práctica 2, la clase Paciente  ha sido modificada para la presente práctica. Revise las modificaciones y téngalas en cuenta cuando desarrolle la clase AreaHospitalizacion pedida. Las modificaciones han sido las siguientes:

- El atributo grupoSanguineo ha pasado a ser del tipo enum GrupoSanguineo (en la práctica 1 era de tipo String).

- El atributo temperatura ha pasado a ser un array de tipo double, que representa las últimas 5 mediciones de temperatura de un paciente, en ºC. Se puede suponer que se realiza solo una medición por día.

### Extensión de la clase PruebaCuidadosIntensivos.java

Para poder probar que la clase **CuidadosIntensivos.java** funciona como se especifica en este enunciado, se proporciona una clase **PruebaCuidadosIntensivos.java**. Dicha clase está disponible en el proyecto descargado de Github, y contiene unas pruebas muy básicas en su método main que imprimen por pantalla algunos datos. La clase también se encuentra disponible directamente en el paquete _es.upm.dit.fprg21.p3_.

Por lo tanto, esta tarea consistirá en importar esa clase y extender las pruebas que se incluyen en dicho método main para comprobar todas las funcionalidades de la clase **CuidadosIntensivos.java**. Una vez que considere que su versión de **CuidadosIntensivos.java** cumple todos los requisitos de esta práctica, podrá proceder a su entrega a través de Moodle como se expone en el último apartado.


## Evaluación

La evaluación se basará en la corrección de la clase **CuidadosIntensivos**. A la clase desarrollada por el alumno se le pasarán una batería de pruebas para comprobar si cumplen las especificaciones de la práctica, pudiendo obtener una calificación máxima de **10 puntos**.


## Entrega de la práctica

La práctica debe estar entregada en Moodle antes de las 23:55 del **10 de Diciembre de 2021**.

Cuando haya completado todas las clases pedidas y esté seguro de que funcionan correctamente, es decir, han pasado con éxito las pruebas que se proporcionan en el proyecto, puede obtener una indicación aproximada de su nota en la práctica mediante unas pruebas automáticas parecidas a las que llevarán a cabo los profesores. Esta es una mera indicación, sin valor académico; la nota real será la que obtenga tras subir su práctica a Moodle en el período de entrega, los profesores corrijan todas las prácticas y revisen que no hay copias de código, un tiempo después de la fecha de entrega de la práctica.

Para obtener la nota aproximada debe seguir estos pasos:

- Seleccionar el lanzador _Practica3Entrega.launch_ en la carpeta del proyecto. Activar con el botón derecho del ratón el menú de contexto de eclipse, y aparecerá un menú con la entrada _Run As_, dentro de la cual se encuentra la entrada _Practica3Entrega_, que debe selecionar.

- Se ejecutan unas pruebas y se muestran los resultados en la consola: ficheros que componen la práctica, nota estimada, e indicaciones de las pruebas que pudieran haber fallado. Las indicaciones de fallos no permiten saber la causa de los fallos, sólo muestran situaciones en las que la práctica no funciona correctamente. Debe ser usted quien descubra y repare los errores.

- Después de realizar las pruebas y dar una nota estimada, _Practica3Entrega.launch_ construye un fichero .zip que queda en la carpeta del proyecto eclipse.

Cuando esté convencido de que puede subir su práctica (por supuesto, antes de que acabe el plazo de entrega), debe hacerlo como sigue:

- En el curso FPRG de Moodle, junto a la presentación de la práctica, hay un punto de entrega Moodle que se llama "Practica3Entrega". En ese punto de entrega se debe subir el fichero .zip que nos ha creado la entrega en el proyecto eclipse. En ese zip tenemos todo lo que hay que entregar.  El script de entrega puede detectar situaciones anómalas muy diversas en las que no se puede realizar la entrega, como por ejemplo: la práctica no compila, las clases o métodos no se ajustan al enunciado. En esos casos no se crea/actualiza el fichero .zip, ni se ejecutan las pruebas de evaluación. Para poder generar el zip hay que arreglar esos problemas. Solo se corregirá la última entrega subida a "Practica3Entrega".

## IMPORTANTE

Es importante subir el fichero fprg-practica3-2021.zip tal cual lo construye y lo deja en el proyecto eclipse el script de entrega Practica3Entrega.launch. Es IMPORTANTE NO hacer lo siguiente:

- Cambiar el nombre al fichero
- Subir el export de eclipse del proyecto
- Comprimir una carpeta y subir esa carpeta

En cualquiera de esos casos la práctica se dará por incorrecta y se puntuará a 0.
