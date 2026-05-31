class Descuento {
    double porcentaje;

    public Descuento(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double aplicarDescuento(double precioOriginal) {
        return precioOriginal - (precioOriginal * (porcentaje / 100));
    }
}
