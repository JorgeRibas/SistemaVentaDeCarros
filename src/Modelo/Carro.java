package Modelo;

public class Carro {
    
    private int idCarro;            //(id Local del carro)
    private int idtipoCarro;        //(Puede ser otra lista con todos los tipos de carro existentes, o un valor numerico para cada tipo existente)
    private String modelo;          //()
    private int anno;               //()
    private Marca marca;            //(Clase enlistando todas las marcas de carro en el mercado)
    private float precioBase;       //()
    private String color;           //()
    private String vin;             //(id Mundial del carro)
    private boolean estadoCarro;    //(true = nuevo, false = usado) 

    public int getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }
    
    public int getIdtipoCarro() {
        return idtipoCarro;
    }

    public void setIdtipoCarro(int idtipoCarro) {
        this.idtipoCarro = idtipoCarro;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public float getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(float precioBase) {
        this.precioBase = precioBase;
    }

    public boolean isEstadoCarro() {
        return estadoCarro;
    }

    public void setEstadoCarro(boolean estadoCarro) {
        this.estadoCarro = estadoCarro;
    }
    
    
    
}
