package Modelo;

public enum Marca {
    AGRALE(1, "AGRALE"), ASTON_MARTIN(2, "ASTON_MARTIN"), AUDI(3, "AUDI"), BENTLEY(4, "BENTLEY"), BMW(5, "BMW"),
    CHANGAN(6, "CHANGAN"), CHEVROLET(7, "CHEVROLET"), CHRYSLER(8, "CHRYSLER"), CITROEN(9, "CITROËN"), DODGE(10, "DODGE"),
    FERRARI(11,"FERRARI"),FIAT(12,"FIAT"), HONDA(13,"HONDA"), HYUNDAI(14,"HYUNDAI"), JAC_MOTORS(15,"JAC_MOTORS"), JAGUAR(16,"JAGUAR"), 
    JEEP(17,"JEEP"), JINBEI(18,"JINBEI"), LAMBORGHINI(19,"LAMBORGHINI"), MAHINDRA(20,"MAHINDRA"), GHIBLI(21,"GHIBLI"),
    MERCEDES_BENZ(22,"MERCEDES_BENZ"), MG_MOTORS(23,"MG_MOTORS"), MITSUBISHI(24,"MITSUBISHI"), NISSAN(25,"NISSAN"),
    PEUGEOT(25,"PEUGEOT"), PORSCHE(26,"PORSCHE"), RAM(27,"RAM"), SMART(28,"SMART"), SUBARU(29,"SUBARU"), TOYOTA(30,"TOYOTA"),
    VOLKSWAGEN(31,"VOLKSWAGEN"), VOLVO(32,"VOLVO");
    
    private final int    idtipoCarro;
    private final String marca;
    
    private Marca(int idtipoCarro, String marca){
        this.idtipoCarro = idtipoCarro;
        this.marca = marca;
    }
    
    public String getMarca() {
        return marca;
    }

    public int getIdtipoCarro() {
        return idtipoCarro;
    }
    
    @Override
    public String toString() {
        return marca;
    }
    
}
