package VO;

public class PdfVO {

    /*Todo los atributos*/
    public int codigopdf;
    public String nombrepdf;
    public byte[] archivopdf;
    public int folio;
    //public String institucion;
    //public String fechainicio;
    //public String fechatermino;

    public PdfVO() {
    }

    /**
     * @return the codigopdf
     */
    public int getCodigopdf() {
        return codigopdf;
    }

    /**
     * @param codigopdf the codigopdf to set
     */
    public void setCodigopdf(int codigopdf) {
        this.codigopdf = codigopdf;
    }

    /**
     * @return the nombrepdf
     */
    public String getNombrepdf() {
        return nombrepdf;
    }

    /**
     * @param nombrepdf the nombrepdf to set
     */
    public void setNombrepdf(String nombrepdf) {
        this.nombrepdf = nombrepdf;
    }

    /**
     * @return the archivopdf
     */
    public byte[] getArchivopdf() {
        return archivopdf;
    }

    /**
     * @param archivopdf the archivopdf to set
     */
    public void setArchivopdf(byte[] archivopdf) {
        this.archivopdf = archivopdf;
    }

    /**
     * @return the folio
     */
    public int getFolio() {
        return folio;
    }

    /**
     * @param folio the folio to set
     */
    public void setFolio(int folio) {
        this.folio = folio;
    }
}
   