/*
Actividad 1 
Java: java 26.0.2 
Javac: 26.0.2
Git: 2.55.0.windows.5
Sistema operativo: Windows 11 Pro
Editor utilizado: Visual Studio Code


Preguntas 
1)¿Qué función cumple main?
R.- La función main cumple el rol de ser el punto de entrada o inicio obligatorio para la ejecución de un programa en la gran mayoría de los lenguajes de programación en este caso Java.

2)¿Qué diferencia existe entre javac y java?
R.-Javac compila el código fuente en un archivo ejecutable, mientras que java ejecuta ese archivo ya compilado.

3)¿Qué archivo se genera después de compilar?
R.-Un archivo con extensión .class.

4)¿Por qué el archivo se llama Main.java?
R.- El archivo se llama Main.java porque Java exige por regla que el nombre del archivo fuente coincida exactamente con el nombre de la clase pública que contiene en su interior, y "Main" es el nombre tradicional para la clase principal que inicia el programa

5)¿Qué ocurre si la clase se llama Programa pero el archivo se llama Main.java?
R.-Si la clase es pública (public class Programa), el compilador de Java mostrará un error; si la clase no es pública (class Programa), el archivo compilará sin problemas
Parte V.-
Responder:
¿Qué diferencia muestra Git entre la última versión confirmada y nuestra versión actual?
R.-La diferencia entre la última versión confirmada (HEAD) y tu versión actual depende del estado de tus archivos (si están guardados en el área de preparación o no)
Cambios guardados (Staged)Muestra los cambios que ya agregaste con git add pero que aún no has confirmado con un commit.Comando: git diff --staged (o git diff --cached).
Cambios no guardados (Unstaged)Muestra las modificaciones en tus archivos actuales que aún no has agregado al área de preparación con git add.Comando: git diff.
Todos los cambios juntosMuestra la diferencia total entre tu directorio de trabajo actual y el último commit, ignorando si usaste git add o no.Comando: git diff HEAD.
*/