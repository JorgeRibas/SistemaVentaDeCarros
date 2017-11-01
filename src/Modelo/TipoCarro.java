package Modelo;

public class TipoCarro {
    
    private int idTipoCarro;
    private String estilo;
    private float impuestos;
    private float depreciacion;
    private int numPasajeros;
    private int numPuertas;
    private int cilindraje;
    private int caballosFuerza;
    private char combustible;
    private String transmision;

    
    public int getIdTipoCarro() {
        return idTipoCarro;
    }

    public void setIdTipoCarro(int idTipoCarro) {
        this.idTipoCarro = idTipoCarro;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public float getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(float impuestos) {
        this.impuestos = impuestos;
    }

    public float getDepreciacion() {
        return depreciacion;
    }

    public void setDepreciacion(float depreciacion) {
        this.depreciacion = depreciacion;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getCaballosFuerza() {
        return caballosFuerza;
    }

    public void setCaballosFuerza(int caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }

    public char getCombustible() {
        return combustible;
    }

    public void setCombustible(char combustible) {
        this.combustible = combustible;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }
    
    
    
}
