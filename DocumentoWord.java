class DocumentoWord extends Documento {

    public DocumentoWord(String contenido) {
        super(contenido);
    }

    @Override
    public void exportar() {
        System.out.println("Exportando contenido a formato Word (.docx)...");
        System.out.println("[Word Content]: " + contenido);
    }
}
