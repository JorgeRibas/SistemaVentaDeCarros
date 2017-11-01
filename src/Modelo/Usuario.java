package Modelo;

public class Usuario {
    
    private int idUsuario;              //()    
    private boolean rol;                //(true = administrador, false = vendedor)
    private Tienda idTienda;            //()
    private String nombre;              //()
    private String apellido;           //()
    private String cedula;              //(Verificaciones de cedula. Pasaporte, cedula, o residencia)
    private String nombreLogin;         //(Con el mismo formato para todos, jribas, dcolumna, avargas, emora, emora... asignarlo automaticamente?? )
    private String contrasena;            //()

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNombreLogin() {
        return nombreLogin;
    }

    public void setNombreLogin(String nombreLogin) {
        this.nombreLogin = nombreLogin;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }


    public Tienda getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(Tienda idTienda) {
        this.idTienda = idTienda;
    }

    public boolean isRol() {
        return rol;
    }

    public void setRol(boolean rol) {
        this.rol = rol;
    }


    
}
