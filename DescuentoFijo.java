class DescuentoFijo extends Descuento {
    double cantidadFija;

    public DescuentoFijo(double cantidadFija) {
        super(0);
        this.cantidadFija = cantidadFija;
    }


    @Override
    public double aplicarDescuento(double precioOriginal) {
        return precioOriginal - cantidadFija;
    }
}