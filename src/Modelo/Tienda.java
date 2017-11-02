package Modelo;

public class Tienda {

    private int idTienda;
    private String nombreTienda;
    private String direccion;
    private String provincia;
    private int espaciosDisponibles;
    private int espaciosOcupados;

    public int getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(int idTienda) {
        this.idTienda = idTienda;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getEspaciosDisponibles() {
        return espaciosDisponibles;
    }

    public void setEspaciosDisponibles(int espaciosDisponibles) {
        this.espaciosDisponibles = espaciosDisponibles;
    }

    public int getEspaciosOcupados() {
        return espaciosOcupados;
    }

    public void setEspaciosOcupados(int espaciosOcupados) {
        this.espaciosOcupados = espaciosOcupados;
    }
    
    
}
