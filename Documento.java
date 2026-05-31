class Documento {
    String contenido;

    public Documento(String contenido) {
        this.contenido = contenido;
    }

    public void exportar() {
        System.out.println("Exportando contenido a formato PDF...");
        System.out.println("[PDF Content]: " + contenido);
    }
}