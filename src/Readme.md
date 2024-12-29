# Juego de Adivinanza en Java

Este proyecto es un simple juego de adivinanza creado en Java, diseñado para practicar conceptos básicos de programación como el uso de bucles, condicionales, generación de números aleatorios y manejo de entrada del usuario. El juego permite al usuario intentar adivinar un número aleatorio generado por el programa en un máximo de 5 intentos.

## Características
- Genera un número aleatorio entre 0 y 100.
- Permite al usuario realizar hasta 5 intentos para adivinar el número.
- Indica si el número ingresado por el usuario es mayor o menor que el número generado.
- Proporciona retroalimentación al usuario sobre su éxito o fracaso.

## Tecnologías utilizadas
- Lenguaje: Java
- IDE: IntelliJ IDEA

## Instrucciones para ejecutar el juego
1. **Clonar el repositorio**:
   ```bash
   git clone <URL_del_repositorio>
   ```

2. **Abrir el proyecto en IntelliJ IDEA**:
    - Abre IntelliJ IDEA.
    - Selecciona "Open" y navega hasta el directorio del proyecto clonado.

3. **Ejecutar el programa**:
    - En IntelliJ IDEA, abre el archivo `JuegoAdivinanza.java`.
    - Haz clic en el botón de ejecución (▶) para compilar y ejecutar el programa.

## Ejemplo de uso
Cuando ejecutes el programa, aparecerá algo como esto:

```
¡Bienvenido al juego de adivinanza!
He generado un número entre 0 y 100. Tienes 5 intentos para adivinarlo.
Intento 1: Ingresa tu número: 50
El número es mayor.
Intento 2: Ingresa tu número: 75
El número es menor.
Intento 3: Ingresa tu número: 65
¡Felicidades! Adivinaste el número en 3 intentos.
¡Gracias por jugar!
```

## Personalización
Puedes modificar los siguientes aspectos del programa:
- **Rango del número aleatorio**:
  Cambia `random.nextInt(101)` para ajustar el rango del número generado.
- **Intentos máximos**:
  Cambia el valor de la variable `intentosMaximos`.

## Contribución
Si deseas contribuir al proyecto, sigue estos pasos:
1. Haz un fork del repositorio.
2. Crea una rama con tu función: `git checkout -b nueva-funcion`.
3. Realiza tus cambios y haz commit: `git commit -m 'Agrega nueva función'`.
4. Haz un push a la rama: `git push origin nueva-funcion`.
5. Abre un Pull Request.

## Licencia
Este proyecto está bajo la licencia MIT. Puedes consultar el archivo LICENSE para más información.

## Autor
Creado por Silvia Gonzalez.

