package Modelo;

public enum Marca {
    BMW, MERCEDES_BENZ, AUDI, VOLVO, VOLKSWAGEN, TOYOTA, SUBARU, PORSCHE;
    
    
    private String marca;
    
    Marca() {
        marca = "";
        }

        Marca(String m) {
            marca = m;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String m) {
            marca = m;
        }
        
        
        
}
