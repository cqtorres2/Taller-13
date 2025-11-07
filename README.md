# Taller-13
alumno: Carlos jose torres del rio

POO tema central:
Diferencias entre clases abstractas y interfaces.

Actividad 1: 

Se pidio una clase abstracta Figura con un metodo llamada "CalcularArea.

Se extendieron 2 clases derivadas, Rectangulo y triangulo a la clase abstracta.

Se hizo que ambas clases dieran su propia variación de calcular area.

Se creo un main para poder instanciar ambas clases atraves de objetos creados desde ellas. Siendo estosvariantes en minuscula de sus nombres como clase.

El codigo es funcional, se recibe en la terminal los 2 mensajes cada uno correspondiente a una clase.

Actividad 2:

Se pidio una clase Pato que implemente 2 interfaces, cada una con un metodo en concreto.
    -Volador: Con un metodo volar
    -Nadador: Con un metodo nadar.
Ambos metodos son void y estan faltos de contenido.

Se implementan las interfaces para la clase Pato y se sobreescriben ambos metodos para acuñarles un mensaje via un system out print.

Se creo una clase main al final del codigo del archivo para instanciar los 2 mensajes mediante un unico objeto creado usando la clase Pato. El objeto es una variación del nombre con minusculas.

Actividad 3:

Se pide una clase que de error por:
    -Ser abstracta y tener un metodo predeterminado.

Se pide una interfaz que de error por:
    -Ser implementada a una clase, pero esta misma no crea los metodos internos de la interfaz.

¿Por qué no esta permitido?:
    -En realidad, una clase abstracta podria tener un metodo "Predeterminado" pero, las palabras claves usadas para un metodo predeterminado esta reseradas para interfaces, la forma "correcta" seria haciendo un metodo no abstracto.

    -La clase en la que es implementada la interfaz no esta dando uso a los metodos que esta probee, esto mismo genera problemas en el codigo de por si similares a lo que hemos comentado en herencias multiples un uso excesivo de codigo sin proposito, pero en este caso, java como no se usa un metodo que deberia ser implementado.