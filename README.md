# Taller03-SOLID

1. La clase Helado y Pastel hacen exactamente lo mismo y tiene las mismas variables pero a futuro estos metodos pueden cambiar por lo que se genero dos interfaces, una para el area financiera y otra para la gestion de aderezos. Se violaba el principio de SRP ya que la clase Helado y Pastel no se enfrascaban en tener la info si no tambien en solucionar problemas finacieros y de gestion de aderezos. Ademas, se violaba el principio de ocp el cual se resolvio creando las interfaces para generalizar la gestion de aderezos tanto de helado como de pastel.

![image](https://user-images.githubusercontent.com/75048588/121569061-03e60780-c9e6-11eb-96f3-9b7d32880463.png)

2. SRP se esta violando porque ya se tiene la clase padre postre que puede implementar los metodos de anadirAderezo y quitarAderezo y la clase Postre tiene esa responsabilidad y no la clase opcion aderezo
![image](https://user-images.githubusercontent.com/75048588/121571045-2547f300-c9e8-11eb-96e0-83af9cfd66f7.png)

3. los metodos calcularPrecioFinal() y showPrecioFinal() son metodos que estan repetidos entre las clases Helado y Pastel, cada uno con una implementacion diferente
![image](https://user-images.githubusercontent.com/70306437/121587165-1a965980-c9fa-11eb-90b2-745ca18e57ec.png)
faltando al OCP. para solucion se hace una interfaz que englobe estos dos metodos, de modo que sean editables solo en sus clases derivadas
3.1 Se crea una interface
![image](https://user-images.githubusercontent.com/70306437/121588026-0a32ae80-c9fb-11eb-8576-282dc3f563c3.png)
3.2 Las clases derivados implementan la interface manipuladorValores
![image](https://user-images.githubusercontent.com/70306437/121587617-a1e3cd00-c9fa-11eb-974b-98fc58db2c46.png)
![image](https://user-images.githubusercontent.com/70306437/121587704-b627ca00-c9fa-11eb-9711-f444c4c8bb9c.png)

4. Como indica el reporte en el paso 4, que cambie la clase ENUM por una clase abstracta, y los valores que estaban dentro de ENUM se los convierte cada uno en una clase que extienda de la cabala abstracta, antes ENUM

clase ENUM antes de la transformacion
4.1 ![parte4 1](https://user-images.githubusercontent.com/70306437/121617780-45e56c80-ca2b-11eb-8369-88b970b1e42e.PNG)
por ende al ser esta una clase ENUM, se implementaba en otras clases por su tipo, por lo que se tenia que cambiar debido a su tranaformacion
![parte4sol 1](https://user-images.githubusercontent.com/70306437/121618112-dde35600-ca2b-11eb-8e0e-606b6bdc7b3d.PNG)
![parte4 2](https://user-images.githubusercontent.com/70306437/121618132-e9368180-ca2b-11eb-88c4-fc8fdec5397b.PNG)
![parte4 3](https://user-images.githubusercontent.com/70306437/121618145-ed629f00-ca2b-11eb-891e-56469136117a.PNG)
![parte4 4](https://user-images.githubusercontent.com/70306437/121618148-efc4f900-ca2b-11eb-8011-dbd82556cf7a.PNG)
tambien podemos concluir que la transformacion de ENUM a una clase abstracta es una buena implementacion, ya que permite definiri una clase "padre" que servira de base




5.1 El error era que mostraba una excepcion en el tipo de leche al ser pastel.
![image](https://user-images.githubusercontent.com/77079653/121602653-41aa5680-ca0d-11eb-8e0c-1b89f292efb4.png)
![image](https://user-images.githubusercontent.com/77079653/121602729-5dadf800-ca0d-11eb-8d93-b6ef5bbb71ab.png)

