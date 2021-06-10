# Taller03-SOLID

1. La clase Helado y Pastel hacen exactamente lo mismo y tiene las mismas variables pero a futuro pueden variar
2. 
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


5.1 El error era que mostraba una excepcion en el tipo de leche al ser pastel.
![image](https://user-images.githubusercontent.com/77079653/121602653-41aa5680-ca0d-11eb-8e0c-1b89f292efb4.png)
![image](https://user-images.githubusercontent.com/77079653/121602729-5dadf800-ca0d-11eb-8d93-b6ef5bbb71ab.png)

