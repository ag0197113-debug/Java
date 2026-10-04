import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Esta es la lista de Productos que tiene nuestra fruteria");
        GestorProductos op = new GestorProductos();
        op.MostrarProductos();

        System.out.println("Ingresa la cantidad de frutas que vas a comprar");
        int num = teclado.nextInt(); 
           // CORRECCIÓN 1: Limpiamos el "Enter" que quedó atrapado después de leer el número entero
        teclado.nextLine(); 
        for(int i=0;i<num;i++)
        {
            System.out.println("Ingresa el nombre de la fruta que vas a comprar");
            String nom = teclado.nextLine();
            
            System.out.println("Ingresa la cantidad de kilos que vas a comprar");
            double kg = teclado.nextDouble(); 
             
            // CORRECCIÓN 2: Volvemos a limpiar el "Enter" después del número decimal (double)
            teclado.nextLine();
            op.FrutaLocal(nom , kg);
        }
        op.MostrarTotal();

    }
}