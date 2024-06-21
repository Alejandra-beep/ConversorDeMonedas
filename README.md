CONVERSOR DE MONEDAS

Para realizar el conversor de monedas fue necesario el uso de una API de conversión, donde mostraba las diferentes tasas de conversión para cada moneda, por lo que nos enfocamos en tres atributos los cuales fueron 
la moneda base, la moneda de conversión, y las conversiones, y de acuerdo a estos datos, se creó el Record con el nombre Moneda, el cual guarda estos datos principales para realizar la conversión.

Se creó una clase llamada BuscaMoneda, donde se creó un método que almacena dos variables, moneda1 y moneda2. Dentro de este método lo que se hizo fue crear el enlace de la API utilizando la clave que fue 
proporcionada y después de esta agregamos la palabra pair, y las dos variables del método (moneda1 y moneda2), seguidamente se implementó el HttpClient, HttpRequest, HttpResponse, donde se empleó un try para que 
se ejecutara así se generar algún error, en este mismo método de hizo el llamado de la librería Gson, que es la que se encarga de mostrar la información más clara y organizada.

De la misma manera se creó la clase llamada ConversorDeMonedas, donde se creó un método llamado "conversion" que almacena dos variables que son "moneda1" y "moneda2", dentro de este, se crea un objeto de Scanner
para realizar la lectura de los datos que va a ingresar el usuario, por lo que se crearon dos variables de tipo double, una es "valor" que corresponde a la cantidad de monedas que el usuario quiere convertir, y la
otra es "valorMonedaConvertida" que corresponde a la cantidad de dinero que ya ha sido convertido, entonces para mostrar la información al usuario se emplean los System.out.printLn, para realizar preguntas sobre 
la cantidad de monedas que quiere convertir y mostrar el resultado.

Finalmente se creó la clase llamada "Principal", donde dentro del método main, se ha creado un objeto de Scanner para obtener la información que digita el usuario, se créo una variable de tipo int llamada opcion la
cual está inciada en cero, esto es con el fin de crear un while que diga que mientras "opcion" sea diferente de cero, realizar determinados pasos, que son mostrar el menú de opciones para que el usuario elija
que tipo de conversión quiere realizar.
