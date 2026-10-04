//Un sistema para una tienda online de un mercado donde cada tipo de
//  producto calcula su precio final de forma distinta y al final ordenas el carrito según el costo real.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;   

public class GestorProductos{
    double preciototalf=0;
    double total=0;
     //Vamos a crear una lista de productos en una lista
    //Creamos la lista que almacenará objetos de tipo Producto
    public List<Producto> inventario = new ArrayList<>();

    public GestorProductos(){
        // Agregamos los productos
        inventario.add(new Producto("Piña", 50.00));
        inventario.add(new Producto("Sandía", 150.50));
        inventario.add(new Producto("Fresa", 70.00));
        inventario.add(new Producto("Melon", 35.20));
        inventario.add(new Producto("Guayaba", 55.00));
        inventario.add(new Producto("Manzana", 48.50));
        inventario.add(new Producto("Durazno", 38.00));
        inventario.add(new Producto("Pera", 43.00));
        inventario.add(new Producto("Uva", 100.00));
        inventario.add(new Producto("Ciruela", 60.50));
        inventario.add(new Producto("Zarzamora", 55.00));
        inventario.add(new Producto("Pitahaya", 125.00));
        
    }
        // Método donde se va a  a mostrar la lista de producto
    public void MostrarProductos(){
            
            
            for(int i=0;i<inventario.size();i++){
                Producto productoActual = inventario.get(i);
                System.out.println("Producto"+productoActual.getNombre()+"Precio"+productoActual.getPrecioBase());
            }
    }

    //Calculamos lo que le vaa  acosttar cada fruta
    public void FrutaLocal(String fruta, double kilos) {

    boolean encontrado = false;

    for (int i = 0; i < inventario.size(); i++) {

            Producto p = inventario.get(i);

            if (p.getNombre().equalsIgnoreCase(fruta)) {

                encontrado = true;

                preciototalf = p.calcularPrecio(kilos);
                total = total + preciototalf;
                

                System.out.println(
                    "-> Añadido: " + p.getNombre()
                    + " | Kilos: " + kilos
                    + " | Costo: $" + preciototalf
                );

                break;
            }
        }

        if (!encontrado) {
            System.out.println(
                "La fruta '" + fruta + "' no se encuentra en el inventario."
            );
        }
    }
    public void MostrarTotal() {
        System.out.println("Total de la compra: $" + total);
    }
}