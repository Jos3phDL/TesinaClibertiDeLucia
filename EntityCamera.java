package Entity;

public class EntityCamera {
    private int numeroCamera;
    private String tipoCamera;
    private double prezzoNotte;
    private String stato;

    public EntityCamera(int numeroCamera, String tipoCamera, double prezzoNotte, String stato) {
        this.numeroCamera = numeroCamera;
        this.tipoCamera = tipoCamera;
        this.prezzoNotte = prezzoNotte;
        this.stato = stato;
    }

    public int getNumeroCamera() {
        return numeroCamera;
    }

    public void setNumeroCamera(int numeroCamera) {
        this.numeroCamera = numeroCamera;
    }

    public String getTipoCamera() {
        return tipoCamera;
    }

    public void setTipoCamera(String tipoCamera) {
        this.tipoCamera = tipoCamera;
    }

    public double getPrezzoNotte() {
        return prezzoNotte;
    }

    public void setPrezzoNotte(double prezzoNotte) {
        this.prezzoNotte = prezzoNotte;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }
}