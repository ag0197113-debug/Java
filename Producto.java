public class Producto {
    protected String nombre;
    protected double precioBase;
    
    public Producto(String nombre,double precioBase){
        this.nombre = nombre;
        this.precioBase = precioBase;
    }
     public String getNombre() {
        return nombre;
    }
    public double getPrecioBase() {
        return precioBase;
    }

    
   // Comportamiento base: precio simple por los kilos
    public double calcularPrecio(double kilos) {
        return this.precioBase * kilos;
    }
}
