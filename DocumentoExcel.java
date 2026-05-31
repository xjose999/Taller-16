class DocumentoExcel extends Documento {

    public DocumentoExcel(String contenido) {
        super(contenido);
    }

    @Override
    public void exportar() {
        System.out.println("Exportando contenido a formato Excel (.xlsx)...");
        System.out.println("[Excel Content (Tabular)]: " + contenido);
    }
}
