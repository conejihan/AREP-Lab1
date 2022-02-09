# AREP-Lab1
Api que convierte de grados celsius a Fahrenheit y viceversa.

##Prerrequisitos
- Java
- Maven
- Git
- Heroku

##¿Cómo funciona?
El backend tiene dos endpoints:
1.  ```/celsius/:temp ``` retorna un json con la respuesta en fahrenheit.
2.  ```/fahrenheit/:temp ``` retorna un json con la respuesta en grados Celsius.

El FrontEnd tiene una interfaz sencilla, en la cual hay un input donde se coloca la temperatura a convertir, después hay un select donde se podrá escoger en que grados esta y a que grados quiere convertirlos, después hay un botón el cual al oprimirlo este enviará los datos necesarios para realizar todo el procedimiento de conversión y por último un output el cual dará la respuesta que se obtuvo.

##¿Cómo ejecutarlo?

1. Desde el cmd ir al lugar donde se guardara el proyecto, posteriormente clonarlo con el siguiente comando.
   ``` git clone https://github.com/conejihan/AREP-Lab1. ```

2. Despues nos paramos en la carpeta de la App y borramos todas las dependencias que se tengan.
   ``` mvn clean```

3. Luego se compila el proyecto
   ``` mvn package ```

4. Para ejecutarlo se colocara el siguiente comando.
   ``` mvn exec:java -Dexec.mainClass="edu.escuelaing.arep.App" ```

5. Tambien se puede conectar por medio de Heroku usando el link de este.

Para generar el Javadoc se utiliza el siguiente comando.
``` mvn javadoc:javadoc ```

##¿Cómo extenderlo?
El proyecto se puede extender o ampliar si se implementa para convertir a Kelvin las dos opciones que se tienen ya, ya que no toca cambiar mucho y se puede agregando algunas lineas de codigo.

##Links
### Heroku
[![Deployed to Heroku](https://www.herokucdn.com/deploy/button.png)](https://lab1-arep.herokuapp.com/)
###Github
https://github.com/conejihan/AREP-Lab1