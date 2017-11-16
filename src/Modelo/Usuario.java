package Modelo;

public class Usuario {
    
    private int idUsuario;              //()    
    private String  rol;                //(A = administrador, V = vendedor)
    private int  idTienda;              //()
    private String nombre;              //()
    private String apellido;            //()
    private String cedula;              //(Verificaciones de cedula. Pasaporte, cedula, o residencia)
    private String nombreLogin;         //(Con el mismo formato para todos, jribas, dcolumna, avargas, emora, emora... asignarlo automaticamente?? )
    private String contrasena;          //()
    private String preg1;
    private String preg2;

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

    public int getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(int idTienda) {
        this.idTienda = idTienda;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getPreg1() {
        return preg1;
    }

    public void setPreg1(String preg1) {
        this.preg1 = preg1;
    }

    public String getPreg2() {
        return preg2;
    }

    public void setPreg2(String preg2) {
        this.preg2 = preg2;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", rol=" + rol + ", idTienda=" + idTienda + ", nombre=" 
                + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", nombreLogin=" + nombreLogin + ", contrasena=" 
                + contrasena + ", preg1=" + preg1 + ", preg2=" + preg2 + '}';
    }
    
    
    
}
