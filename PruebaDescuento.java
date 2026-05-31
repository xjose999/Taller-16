public class PruebaDescuento {
    public static void main(String[] args) {
        double precioProducto = 100000;


        Descuento descPorcentaje = new Descuento(15);
        System.out.println("Precio con 15% de descuento: " + descPorcentaje.aplicarDescuento(precioProducto));


        Descuento descFijo = new DescuentoFijo(20000);
        System.out.println("Precio con descuento fijo de $20.000: " + descFijo.aplicarDescuento(precioProducto));
    }
}