package Modelo;

public enum TipoCarro {
    
    SUV("SUV"), TRUCK("TRUCK"), SEDAN("SEDAN"), VAN("VAN"), COUPE("COUPE"), WAGON("WAGON"),
    CONVERTIBLE("CONVERTIBLE"), SPORTS_CAR("SPORTS CAR"), DIESEL("DIESEL"), CROSSOVER("CROSSOVER"),
    LUXURY_CAR("LUXURY CAR"), HYBRID("HYBRID"), ELECTRIC("ELECTRIC"), HATCHBACK("HATCHBACK");
    
    private final String tipoCarro;
    
    private TipoCarro(String TipoCarro){
        this.tipoCarro = TipoCarro;
    }

    public String getTipoCarro() {
        return tipoCarro;
    }

    @Override
    public String toString() {
        return tipoCarro;
    }
    
    
}
