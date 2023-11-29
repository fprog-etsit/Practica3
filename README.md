<img  align="left" width="150" style="float: left;" src="https://www.upm.es/sfs/Rectorado/Gabinete%20del%20Rector/Logos/UPM/CEI/LOGOTIPO%20leyenda%20color%20JPG%20p.png">

<img  align="right" width="250" style="float: right;" src="logos/LogoMoodleOscuro.png">

<br/><br/>



# Práctica 3 - Colecciones y diccionarios

## Contenido

-   [Introducción](#introducción)
-   [Objetivos](#objetivos)
-   [Requisitos Previos](#requisitos-previos)
-   [Temas relacionados con la práctica](#temas-relacionados-con-la-práctica)
-   [Actividades de la práctica](#actividades-de-la-práctica)
    -   [Creación del proyecto](#creación-del-proyecto)
    -   [Creación de la clase UnidadHospitalizacion.java](#creación-de-la-clase-unidad-hospitalizacion.java)
    -   [Extensión de la clase PruebaUnidadHospitalizacion.java](#extensión-de-la-clase-prueba-unidad-hospitalizacion.java)
-   [Evaluación](#evaluación)
-   [Entrega de la práctica](#entrega-de-la-práctica)



## Introducción

Durante este curso, se van a realizar una serie de prácticas para modelar el registro de pacientes en un hospital. Dentro de los sistemas de gestión de hospitales, encontraremos modelos similares al que se va a desarrollar en estas prácticas.

No obstante, para ser coherentes con el temario desarrollado en las clases teóricas, se asumirán ciertas simplificaciones que en un sistema profesional del campo de la ingeniería no serían tolerables. Se menciona esto para que el alumno sea consciente de que esta práctica es un trabajo introductorio al mundo de la programación.

En esta tercera práctica, vamos a desarrollar una interfaz y algunas clases para gestionar el registro de los análisis realizados a los pacientes. Dichas clases contendrán una serie de métodos para gestionar las distintas mediciones y parámetros analizados y obtener distinta información sobre ellos.

A partir de este punto, se enuncian las diferentes actividades a desarrollar en esta práctica. Se recomienda leer y comprender el enunciado entero antes de comenzar a trabajar.


## Objetivos

- Manejo de colecciones y diccionarios
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

- Descargue de Github pulsando sobre el botón _Code->Download ZIP_ el fichero zip que encontrará en la entrada _Práctica 3 - Main_.
- Importe el proyecto con _Import->Existing Projects into Workspace_ e indique la localización del fichero zip descargado usando la opción _Select archive file_.
- Dentro del proyecto, en la carpeta _src_, encontrará un paquete llamado **es.upm.dit.fprg23.p3**, siguiendo el convenio más extendido de nomenclatura de paquetes: Práctica 3 (**p3**) de la asignatura FPRG Curso 2023-2024 (**fprg23**) del Departamento de Ingeniería de Sistemas Telemáticos (**dit**) de la Universidad Politécnica de Madrid (**upm**) de España (**es**).
- También encontrará las clases ``PruebaRegistroAnalisis.java``, ``Paciente.java``, ``Parametro.java`` y ``GrupoSanguineo.java``.
- Todas las clases o interfaces que desarrolle deben de estar en el paquete _es.upm.dit.fprg23.p3_.

En este punto, ya deberíamos poder ver las cuatro clases mencionadas en nuestro espacio de trabajo y, si las abrimos, podremos ver su código, que se utilizará en la siguiente tarea.

## Información previa

Para esta práctica, se proporciona la clase ``Paciente.java`` tal y como se usó en la práctica 2.

Además, se proporciona una clase nueva: `Parametro.java`, que representa los parámetros asociados a los análisis médicos (por ejemplo: hemoglobina, glóbulos blancos, etc.). Esta clase tiene atributos como `nombre`, `umbralMaximo`, `umbralMinimo` y `unidades` para describir las características del parámetro. Esta clase se utiliza para representar las características asociadas a un parámetro específico en un análisis médico. Proporciona métodos de acceso y modificación para los atributos del parámetro.

Revise estas dos clases para familiarizarse con su funcionamiento antes de comenzar con el desarrollo de la práctica.

## Creación de la interfaz Analisis.java

En esta tarea se debe crear una interfaz que nos servirá para representar análisis médicos en un sistema de gestión de información de pacientes. La interfaz Analisis proporciona los siguientes métodos:

- **`obtenerIndicaciones`**
   - **Return:** `String`
   - **Descripción:** Devuelve las indicaciones generales relacionadas con la preparación o condiciones necesarias para realizar el análisis.

- **`parametroIncluido(Parametro parametro)`**
   - **Return:** `boolean`
   - **Parámetros:**
     - `parametro`: Objeto de tipo `Parametro` que representa el parámetro a verificar.
   - **Descripción:** Verifica si el parámetro especificado está incluido en el análisis.

- **`incluirParametro(Parametro parametro, double valor) throws Exception`**
   - **Parámetros:**
     - `parametro`: Objeto de tipo `Parametro` que representa el parámetro a incluir.
     - `valor`: Valor numérico asociado al parámetro.
   - **Excepciones:**
     - `Exception`: Se lanza excepción si hay algún error al intentar incluir el parámetro.
   - **Descripción:** Incluye un parámetro junto con su valor asociado en el análisis.

- **`imprimirAnalisis`**
   - **Descripción:** Muestra los detalles del análisis, lo que puede incluir la fecha, los parámetros medidos y sus respectivos valores.

### Creación de la clase PerfilTiroideo.java

En esta tarea, se debe crear una clase llamada `PerfilTiroideo` que implemente la interfaz `Analisis` desarrollada en la tarea anterior. La clase `PerfilTiroideo` representa un análisis médico específico, en este caso, un perfil tiroideo. Este análisis se utiliza para evaluar el funcionamiento de la glándula tiroides y suele requerir que el paciente realice un ayuno de entre 2 y 4 horas antes de la prueba. 

La clase tendrá los siguientes atributos:

- `fecha` (Tipo: `Date`): Representa la fecha en la que se realiza el análisis.

- `resultados` (Tipo: `Map<Parametro, Double>`): Almacena los valores obtenidos en el análisis para cada parámetro.

Además, deben implementarse todos los métodos que se exponen en el documento **Especificación de PerfilTiroideo.pdf**, disponible en este repositorio. El orden en el que se desarrollan los métodos no es relevante. Sin embargo, se recomienda seguir el siguiente orden:

- Constructor
- Getters y setters
- obtenerIndicaciones
- parametroIncluido
- incluirParametro
- imprimirAnalisis

### Creación de la clase Hemograma.java

En esta tarea, se debe crear una clase llamada `Hemograma` que implemente la interfaz `Analisis` desarrollada en la tarea anterior. La clase `Hemograma` representa un análisis médico específico que evalúa los componentes celulares de la sangre, como glóbulos rojos, glóbulos blancos y plaquetas.

La clase `Hemograma` tendrá los siguientes atributos:

- `fecha` (Tipo: `Date`): Representa la fecha en la que se realiza el análisis.

- `resultados` (Tipo: `Map<Parametro, Double>`): Almacena los valores obtenidos en el análisis para cada parámetro.

Además, deben implementarse todos los métodos que se exponen en el documento **Especificación de Hemograma.pdf**, disponible en este repositorio. El orden en el que se desarrollan los métodos no es relevante. Sin embargo, se recomienda seguir el siguiente orden:

- Constructor
- Getters y setters
- obtenerIndicaciones
- parametroIncluido
- incluirParametro
- imprimirAnalisis
- medicionParametroCorrecta
- obtenerConjuntoParametrosMedidos
- contarParametrosMedidos
- todosParametrosCorrectos
- obtenerParametrosFueraDeRango
- borrarMedicionParametro
- calcularMediaValores
- calcularPorcentajeParametrosDentroDelUmbral
- obtenerParametrosConValor
- obtenerParametrosConValorMasAlto
- clasificarParametros
- calcularVariacion

Tenga en cuenta que mientras que algunos de los métodos que se implementan de la interfaz tienen el mismo funcionamiento que en la clase ``PerfilTiroideo``, hay otros que funcionan diferente. Preste especial atención a los requisitos especificados en el documento.

### Extensión de la clase Paciente.java

En esta tarea, se propone extender la funcionalidad de la clase `Paciente` para incluir nuevos métodos y atributos relacionados con la gestión de análisis médicos. Específicamente, debe incluir el siguiente atributo:

- `List<Analisis>` historialAnalisis: representa el historial de análisis realizados a un paciente. El constructor de la clase debe ser modificado para que inicialice este atributo.

Además, se deben implementar los siguientes métodos:

- agregarAnalisis(Analisis analisis)`

    - **Descripción:** Añade un análisis al historial del paciente. Debe comprobar que el análisis recibido no sea nulo.

    - **Parámetros:**
        - `Analisis analisis`: El análisis que se va a agregar al historial.

- borrarAnalisisHemogramaAnterioresFecha(Date fecha)`

    - **Descripción:** Elimina todos los análisis de tipo Hemograma realizados antes de la fecha especificada.

    - **Parámetros:**
        - `Date fecha`: La fecha límite para la eliminación de los Hemogramas.

### Extensión de la clase PruebaRegistroAnalisis.java

Para poder probar que las clases desarrolladas funcionan como se especifica en este enunciado, se proporciona una clase ``PruebaRegistroAnalisis.java``. Dicha clase está disponible en el proyecto descargado de Github, y contiene unas pruebas muy básicas en su método main que imprimen por pantalla algunos datos. La clase también se encuentra disponible directamente en el paquete _es.upm.dit.fprg23.p3_.

Esta tarea consiste en extender dicha clase para que las pruebas que se incluyen en el método main permitan comprobar todas las funcionalidades de las clases desarrolladas. Una vez que considere que su versión de ``PruebaRegistroAnalisis.java`` cumple todos los requisitos de esta práctica, podrá proceder a su entrega a través de Moodle como se expone en el último apartado.

## Entrega de la práctica

La práctica debe entregarse mediante el enlace habilitado en Moodle antes de las 23:55 del **domingo 17 de Diciembre de 2023**.

Se debe entregar el fichero .zip generado como resultado de exportar el proyecto. Dicho fichero debe contener todas las carpetas y ficheros asociados al proyecto. Para realizar la exportación, siga los siguientes pasos:

- Asegúrese de que tiene seleccionado el proyecto de la práctica en el explorador de paquetes de Eclipse.
- Pulse sobre el botón derecho del ratón (o «File» dentro de la barra de menú superior), y a continuación sobre «Export».
- Seleccione «Archive File» (dentro de la pestaña «General») en el menú que aparece, y pulse sobre el botón «Next».
- En la siguiente ventana, asegúrese de que el proyecto correspondiente a la práctica está seleccionado, junto con los ficheros alojados en su interior.
- Pulse el botón «Browse» para seleccionar el directorio donde quiere exportar el proyecto, y el nombre que le quiere dar.
- Suba a Moodle el fichero .zip que se ha generado como resultado de realizar los pasos anteriores, que se encontrará en la carpeta que haya seleccionado en el paso anterior.

## Evaluación

La evaluación consistirá en una prueba escrita en la que se deberá resolver de forma individual una serie de ejercicios relacionados con lo desarrollado en esta práctica.