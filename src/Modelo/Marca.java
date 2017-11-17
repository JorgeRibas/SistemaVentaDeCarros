package Modelo;

public enum Marca {
    AGRALE("AGRALE"), ASTON_MARTIN("ASTON MARTIN"), AUDI("AUDI"), BENTLEY("BENTLEY"), BMW("BMW"),
    CHANGAN("CHANGAN"), CHEVROLET("CHEVROLET"), CHRYSLER("CHRYSLER"), DODGE("DODGE"), FIAT("FIAT"),
    HONDA("HONDA"), HYUNDAI("HYUNDAI"), JAC_MOTORS("JAC MOTORS"), JAGUAR("JAGUAR"), JEEP("JEEP"), 
    JINBEI("JINBEI"), LAMBORGHINI("LAMBORGHINI"), MAHINDRA("MAHINDRA"), GHIBLI("GHIBLI"), 
    MERCEDES_BENZ("MERCEDES-BENZ"), MG_MOTORS("MG MOTORS"), MITSUBISHI("MITSUBISHI"), NISSAN("NISSAN"),
    PEUGEOT("PEUGEOT"), PORSCHE("PORSCHE"), RAM("RAM"), SMART("SMART"), SUBARU("SUBARU"), TOYOTA("TOYOTA"),
    VOLKSWAGEN("VOLKSWAGEN"), VOLVO("VOLVO");
    
    private final String marca;
    
    private Marca(String marca){
        this.marca = marca;
    }
    
    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return marca;
    }
    
}
