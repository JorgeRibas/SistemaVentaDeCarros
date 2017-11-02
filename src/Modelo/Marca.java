package Modelo;

public enum Marca {
    BMW("BMW"), MERCEDES_BENZ("MERCEDES BENZ"), AUDI("AUDI"), VOLVO("VOLVO"),
    VOLKSWAGEN("VOLKSWAGEN"), TOYOTA("TOYOTA"), SUBARU("SUBARU"), PORSCHE("PORSCHE");
    
    private String marca;
    
    private Marca(String marcaCarro){
        this.marca = marcaCarro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
