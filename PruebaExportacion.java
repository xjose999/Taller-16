public class PruebaExportacion {
    public static void main(String[] args) {
        String texto = "Informe Final de Proyecto de Software";


        Documento docPdf = new Documento(texto);


        Documento docWord = new DocumentoWord(texto);
        Documento docExcel = new DocumentoExcel(texto);


        docPdf.exportar();
        System.out.println("-------------------------------------");
        docWord.exportar();
        System.out.println("-------------------------------------");
        docExcel.exportar();
    }
}