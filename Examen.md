# Examen — Sistema de Ecuaciones Diferenciales

## Sistema

\[
\begin{cases}
\displaystyle \frac{dx}{dt} = 2x + y \\[6pt]
\displaystyle \frac{dy}{dt} = -x + 4y
\end{cases}
\]

**Condiciones iniciales (para Laplace):**  
\(x(0) = 1,\quad y(0) = 0\)

---

## 1. Método de Eliminación (7 pasos)

### Paso 1 — Despejar una variable

De la primera ecuación:

\[
y = \frac{dx}{dt} - 2x = x' - 2x
\]

### Paso 2 — Derivar la expresión anterior

\[
y' = x'' - 2x'
\]

### Paso 3 — Sustituir en la otra ecuación

La segunda ecuación es \(y' = -x + 4y\). Sustituimos:

\[
x'' - 2x' = -x + 4(x' - 2x)
\]

### Paso 4 — Obtener una EDO

\[
\begin{aligned}
x'' - 2x' &= -x + 4x' - 8x \\
x'' - 2x' - 4x' + x + 8x &= 0 \\
\Rightarrow\quad x'' - 6x' + 9x &= 0
\end{aligned}
\]

### Paso 5 — Resolver la EDO

Ecuación característica:

\[
r^2 - 6r + 9 = (r - 3)^2 = 0 \quad\Rightarrow\quad r = 3 \text{ (doble)}
\]

Solución general:

\[
x(t) = C_1 e^{3t} + C_2 t e^{3t}
\]

### Paso 6 — Sustituir para hallar la variable faltante

De \(y = x' - 2x\):

\[
\begin{aligned}
x' &= 3C_1 e^{3t} + C_2 e^{3t} + 3C_2 t e^{3t} \\
y &= (3C_1 e^{3t} + C_2 e^{3t} + 3C_2 t e^{3t}) - 2(C_1 e^{3t} + C_2 t e^{3t}) \\
  &= (3C_1 - 2C_1)e^{3t} + C_2 e^{3t} + (3C_2 - 2C_2)t e^{3t} \\
  &= C_1 e^{3t} + C_2 e^{3t} + C_2 t e^{3t} \\
  &= (C_1 + C_2)e^{3t} + C_2 t e^{3t}
\end{aligned}
\]

### Paso 7 — Escribir la solución completa

\[
\boxed{x(t) = C_1 e^{3t} + C_2 t e^{3t},\qquad
       y(t) = (C_1 + C_2)e^{3t} + C_2 t e^{3t}}
\]

(Las constantes \(C_1, C_2\) se determinan si hay condiciones iniciales; aquí se dejan así porque eliminación no las usa.)

---

## 2. Método del Operador Diferencial (9 pasos)

### Paso 1 — Reordenar las ED dejando todo a la izquierda

\[
\begin{aligned}
\frac{dx}{dt} - 2x - y &= 0 \quad\Rightarrow\quad (D - 2)x - y = 0 \\[4pt]
\frac{dy}{dt} + x - 4y &= 0 \quad\Rightarrow\quad x + (D - 4)y = 0
\end{aligned}
\]

### Paso 2 — Sustituir derivadas por \(D\) (ya está hecho)

### Paso 3 — Formar y calcular el determinante operacional

Matriz del sistema:

\[
\begin{pmatrix}
D - 2 & -1 \\
1     & D - 4
\end{pmatrix}
\]

Determinante:

\[
\Delta = (D - 2)(D - 4) - (-1)(1) = D^2 - 6D + 8 + 1 = D^2 - 6D + 9
\]

### Paso 4 — Obtener la ecuación característica

\[
D^2 - 6D + 9 = 0 \quad\Rightarrow\quad r^2 - 6r + 9 = 0
\]

### Paso 5 — Resolver raíces (caso 2: real repetida)

\[
r = 3 \text{ (doble)}
\]

### Paso 6 — Proponer solución general para una variable

\[
x(t) = C_1 e^{3t} + C_2 t e^{3t}
\]

### Paso 7 — Sustituir en ecuación original

Usamos la primera ecuación original: \(y = (D - 2)x\)

\[
y = (D - 2)(C_1 e^{3t} + C_2 t e^{3t}) = Dx - 2x
\]

Calculamos \(Dx = x'\):

\[
Dx = x' = 3C_1 e^{3t} + C_2 e^{3t} + 3C_2 t e^{3t}
\]

Entonces:

\[
\begin{aligned}
y &= [3C_1 e^{3t} + C_2 e^{3t} + 3C_2 t e^{3t}] - 2[C_1 e^{3t} + C_2 t e^{3t}] \\
  &= (3C_1 - 2C_1)e^{3t} + C_2 e^{3t} + (3C_2 - 2C_2)t e^{3t} \\
  &= C_1 e^{3t} + C_2 e^{3t} + C_2 t e^{3t}
\end{aligned}
\]

### Paso 8 — Relacionar constantes

Ya están relacionadas: \(y\) depende de \(C_1, C_2\) igual que antes.

\[
y = (C_1 + C_2)e^{3t} + C_2 t e^{3t}
\]

### Paso 9 — Escribir solución final

\[
\boxed{x(t) = C_1 e^{3t} + C_2 t e^{3t},\qquad
       y(t) = (C_1 + C_2)e^{3t} + C_2 t e^{3t}}
\]

(Idéntica a eliminación ✔)

---

## 3. Método de Transformada de Laplace (7 pasos)

### Paso 1 — Aplicar Laplace a cada EDL

\[
\begin{aligned}
\mathcal{L}\{x'\} &= sX(s) - x(0) = sX - 1 \\
\mathcal{L}\{y'\} &= sY(s) - y(0) = sY \\
\mathcal{L}\{2x + y\} &= 2X + Y \\
\mathcal{L}\{-x + 4y\} &= -X + 4Y
\end{aligned}
\]

Las ecuaciones transformadas:

\[
\begin{aligned}
sX - 1 &= 2X + Y \quad\Rightarrow\quad (s - 2)X - Y = 1 \\
sY &= -X + 4Y \quad\Rightarrow\quad X + (s - 4)Y = 0
\end{aligned}
\]

### Paso 2 — Aplicar condiciones iniciales (ya incluidas)

### Paso 3 — Ordenar el sistema algebraico

\[
\begin{cases}
(s - 2)X - Y = 1 \\
X + (s - 4)Y = 0
\end{cases}
\]

### Paso 4 — Resolver el sistema para \(X(s)\) y \(Y(s)\)

De la segunda: \(X = -(s - 4)Y\)

Sustituimos en la primera:

\[
\begin{aligned}
(s - 2)[-(s - 4)Y] - Y &= 1 \\
-(s - 2)(s - 4)Y - Y &= 1 \\
-[(s - 2)(s - 4) + 1]Y &= 1 \\
-[(s^2 - 6s + 8) + 1]Y &= -[s^2 - 6s + 9]Y = 1 \\
-(s - 3)^2 Y &= 1
\end{aligned}
\]

\[
\Rightarrow\quad Y(s) = -\frac{1}{(s - 3)^2}
\]

Luego:

\[
X(s) = -(s - 4)Y = -(s - 4)\left(-\frac{1}{(s - 3)^2}\right) = \frac{s - 4}{(s - 3)^2}
\]

### Paso 5 — Simplificar las ecuaciones

Descomponemos \(X(s)\) en fracciones parciales:

\[
\frac{s - 4}{(s - 3)^2} = \frac{1}{s - 3} - \frac{1}{(s - 3)^2}
\]

(Verificación: \((1)(s - 3) - 1 = s - 4\))

### Paso 6 — Aplicar transformada inversa de Laplace

\[
\begin{aligned}
x(t) &= \mathcal{L}^{-1}\left\{\frac{1}{s - 3}\right\} - \mathcal{L}^{-1}\left\{\frac{1}{(s - 3)^2}\right\}
      = e^{3t} - t e^{3t} \\[6pt]
y(t) &= \mathcal{L}^{-1}\left\{-\frac{1}{(s - 3)^2}\right\}
      = -t e^{3t}
\end{aligned}
\]

### Paso 7 — Escribir solución final

\[
\boxed{x(t) = e^{3t} - t e^{3t},\qquad y(t) = -t e^{3t}}
\]

(Esta es la **solución particular** con las condiciones iniciales dadas. Compara con la solución general de eliminación: si \(C_1 = 1,\; C_2 = -1\) obtienes exactamente esto.)
