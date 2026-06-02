Proyecto FINAL
Ecuaciones Diferenciales aplicadas a Ingeniería en Sistemas Computacionales
Título del proyecto: Modelado del enfriamiento de un procesador mediante una ecuación diferencial de primer orden
Asignatura	Ecuaciones Diferenciales
Carrera	Ingeniería en Sistemas Computacionales
Modalidad	Proyecto en equipos 
Duración	5 días
Entrega	Reporte escrito en PDF para subirlo en Classroom

1. Descripción general
El estudiante desarrollará un proyecto breve en el que modelará la disminución de temperatura de un procesador después de apagar una tarea de alta demanda computacional. El fenómeno se analizará mediante una ecuación diferencial ordinaria de primer orden, aplicando un problema de valor inicial, solución analítica, gráfica e interpretación de resultados.
2. Objetivo del proyecto
Aplicar una ecuación diferencial ordinaria de primer orden para modelar el enfriamiento de un procesador, resolver el problema de valor inicial, graficar la solución y analizar el comportamiento térmico del sistema.
3. Problema a resolver
Después de ejecutar una tarea pesada, como compilar un programa, entrenar un modelo simple o ejecutar un videojuego, la temperatura de un procesador aumenta. Al finalizar la tarea, el procesador comienza a enfriarse hasta aproximarse a la temperatura ambiente. Se desea estimar la temperatura del procesador en función del tiempo.
cePregunta central: ¿Cómo puede modelarse la disminución de temperatura de un prosador mediante una ecuación diferencial y qué temperatura tendrá después de cierto tiempo?
4. Datos sugeridos
Para facilitar el desarrollo del proyecto, se propone usar los siguientes valores:
Parámetro	Valor	Interpretación
T0	80 °C	Temperatura inicial del procesador al terminar la tarea
Ta	30 °C	Temperatura ambiente aproximada
k	0.18 min^-1	Constante de enfriamiento
t	minutos	Tiempo transcurrido después de finalizar la tarea



También se puede utilizar una tabla de datos simulados para comparar con el modelo:
Tiempo t (min)	Temperatura T(t) (°C)
0	80.0
2	64.9
4	54.3
6	46.9
8	41.9
10	38.3
12	35.8
15	33.4

5. Modelo matemático
Se utilizará la ley de enfriamiento de Newton, expresada mediante la siguiente ecuación diferencial:
dT/dt = -k(T - Ta)
donde T(t) es la temperatura del procesador, Ta es la temperatura ambiente y k es la constante de enfriamiento.
Con los datos sugeridos, el problema de valor inicial es:
dT/dt = -0.18(T - 30),     T(0) = 80
La solución general del modelo es:
T(t) = Ta + (T0 - Ta)e^(-kt)
Sustituyendo los valores:
T(t)= 30 + 50e^(-0.18t)
6. Instrucciones para el desarrollo 
Fundamentación y planteamiento del problema
	Leer el problema y explicar el fenómeno de enfriamiento del procesador.
	Identificar la variable independiente y la variable dependiente.
	Explicar por qué el fenómeno puede representarse con una ecuación diferencial.
	Escribir el objetivo del proyecto.
Construcción del modelo diferencial
	Escribir la ecuación diferencial dT/dt = -k(T - Ta).
	Explicar el significado de T(t), Ta, k y t.
	Establecer el problema de valor inicial con los datos proporcionados.
	Identificar si la ecuación es de primer orden, lineal o separable.
Solución analítica
	Resolver la ecuación diferencial por separación de variables o mediante la fórmula directa de enfriamiento.
	Sustituir los valores T0 = 80 °C, Ta = 30 °C y k = 0.18 min^-1.
	Obtener la función T(t) = 30 + 50e^(-0.18t).
	Calcular la temperatura para t = 5, 10 y 15 minutos.
Día 4. Gráfica e interpretación
	Elaborar una tabla con valores de T(t) para diferentes tiempos.
	Graficar T(t) contra t usando Excel, GeoGebra, Python, Matlab, Desmos o Google Sheets.
	Colocar título, ejes y unidades.
	Describir el comportamiento de la curva.
7. Cálculos mínimos que debe incluir el reporte
7.1 Identificación de variables
Variable	Significado	Unidad
t	Tiempo transcurrido después de finalizar la tarea	min
T(t)	Temperatura del procesador	°C
Ta	Temperatura ambiente	°C
k	Constante de enfriamiento	min^-1

7.2 Solución del problema de valor inicial
Modelo: dT/dt = -0.18(T - 30)
Condición inicial: T(0) = 80
Solución: T(t) = 30 + 50e^(-0.18t)
7.3 Evaluación de la temperatura
Tiempo	Cálculo	Resultado aproximado
5 min	T(5)=30+50e^(-0.18(5))	50.3 °C
10 min	T(10)=30+50e^(-0.18(10))	38.3 °C
15 min	T(15)=30+50e^(-0.18(15))	33.4 °C

7.4 Interpretación mínima esperada
La temperatura disminuye rápidamente al inicio porque existe una mayor diferencia entre la temperatura del procesador y la temperatura ambiente. Conforme pasa el tiempo, la diferencia térmica se reduce y el enfriamiento se vuelve más lento. Matemáticamente, la temperatura se aproxima a la temperatura ambiente sin llegar inmediatamente a ella.
8. Estructura del reporte escrito
Portada. Debe incluir institución, carrera, asignatura, nombre del proyecto, nombre del estudiante o integrantes, grupo, docente y fecha.
1. Introducción. Explicar brevemente qué es un sistema dinámico y por qué el enfriamiento de un procesador puede modelarse con una ecuación diferencial.
2. Planteamiento del problema. Describir el problema y presentar la pregunta central del proyecto.
3. Objetivo. Indicar el objetivo general del proyecto.
4. Marco teórico breve. Incluir definiciones de ecuación diferencial, orden, problema de valor inicial y ley de enfriamiento de Newton.
5. Modelo matemático. Presentar la ecuación diferencial, las variables, los parámetros y la condición inicial.
6. Solución analítica. Mostrar el procedimiento de solución y la función T(t).
7. Resultados. Incluir tabla de valores, gráfica y cálculos de temperatura para tiempos específicos.
8. Discusión. Interpretar el comportamiento de la curva y relacionarlo con el enfriamiento de un procesador.
9. Conclusiones. Responder qué se aprendió del uso de ecuaciones diferenciales en un problema de sistemas computacionales.
10. Referencias. Incluir el programa de la asignatura, libro o recurso utilizado y software empleado.
9. Formato de entrega
	Extensión sugerida: 3 a 5 cuartillas, sin contar portada y anexos.
	Formato: PDF o Word, según indique el docente.
	Revisar orden, ortografía y gramática
	Debe incluir evidencia del uso de TICs: captura, tabla generada o gráfica.
10. Rúbrica de evaluación del reporte escrito
Criterio	Descripción	Puntos
Portada y presentación general	Incluye datos completos, orden, limpieza, buena redacción y formato uniforme.	5
Planteamiento del problema	Describe claramente el fenómeno de enfriamiento y su relación con sistemas computacionales.	10
Identificación de variables y parámetros	Define correctamente t, T(t), Ta, k, unidades y condición inicial.	10
Modelo diferencial	Plantea correctamente la ecuación diferencial y reconoce que es de primer orden.	15
Solución analítica	Resuelve correctamente el problema de valor inicial y obtiene T(t).	20
Cálculos numéricos	Evalúa la solución en diferentes tiempos y presenta resultados coherentes.	10
Gráfica y uso de TICs	Presenta una gráfica clara con título, ejes, unidades y evidencia de herramienta digital.	10
Interpretación de resultados	Explica el comportamiento de la curva y su significado físico/computacional.	10
Conclusiones	Presenta conclusiones claras sobre el uso de ecuaciones diferenciales en ingeniería.	10
Total		100

