# Ejercicio 2: 

Implementa una aplicación utilizando JavaFX que:

Muestre una ventana que solicita las credenciales (nombre y contraseña) del usuario
Si el usuario introduce los datos (no hace falta controlar que sean correctos), muestra la ventana de configuración.
En la ventana de configuración, el usuario debe seleccionar las dimensiones de la ventana final (200x200, 400x400, 600x600).
Una vez seleccionada la dimensión, se mostrará una ventana con las dimensiones seleccionadas. En dicha ventatana, el usuario podrá observar
las coordenadas del ratón en cada momento y cuántas veces ha pulsado la tecla 'P'.

Para ello, debes completar el código proporcionado de la siguiente manera:
1. Completa los ficheros *.fxml* proporcionados para crear las ventanas descritas en el enunciado.
2. Completa el controlador de cada una de las ventanas.
3. Completa los métodos que muestran las ventanas en la clase *ViewFactory*.
4. Completa el método *start()* de la clase *Main* para que muestre la ventana de login al ejecutar la aplicación, mostrando un mensaje de error 
   si no se introducen las credenciales y mostrando la ventana de configuración en caso contrario.