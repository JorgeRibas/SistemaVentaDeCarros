package Modelo;

public enum TipoCarro {
    
    SUV("SUV"), TRUCK("TRUCK"), SEDAN("SEDAN"), VAN("VAN"), COUPE("COUPE"), WAGON("WAGON"),
    CONVERTIBLE("CONVERTIBLE"), SPORTS_CAR("SPORTS_CAR"), DIESEL("DIESEL"), CROSSOVER("CROSSOVER"),
    LUXURY_CAR("LUXURY CAR"), HYBRID("HYBRID"), ELECTRIC("ELECTRIC"), HATCHBACK("HATCHBACK");
    
    
    private String tipoCarro;
    
    
    private TipoCarro(String TipoCarro){
        this.tipoCarro = TipoCarro;
    }

    public String getTipoCarro() {
        return tipoCarro;
    }

    public void setTipoCarroS(String tipoCarro) {
        this.tipoCarro = tipoCarro;
    }
    
}
