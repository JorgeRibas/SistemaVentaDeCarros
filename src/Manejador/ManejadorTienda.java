package Manejador;

import Datos.DatosTienda;
import Modelo.Tienda;
import java.util.List;


public class ManejadorTienda {
    
    private Tienda tienda = new Tienda();
    private List<Tienda> lstTienda;
    private String accion;
    
    
    public void operar() throws Exception{
        switch(accion){
            case "Registrar":
                this.registrar();
                this.limpiar();
                break;
            case "Modificar":
                this.modificar();
                this.limpiar();
                break;
        }
    }
    
    public void limpiar(){
        this.tienda.setIdTienda(0);
        this.tienda.setNombreTienda("");
        this.tienda.setDireccion("");
        this.tienda.setProvincia("");
        this.tienda.setEspaciosDisponibles(0);
        this.tienda.setEspaciosOcupados(0);
    }
    
    public void registrar() throws Exception{
        
        DatosTienda dao;
        
        try {
            dao = new DatosTienda();
            dao.registrar(tienda);
            this.listar("V");
            this.limpiar();
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void modificar() throws Exception{
        
        DatosTienda dao;
        
        try {
            dao = new DatosTienda();
            dao.modificar(tienda);
            this.listar("V");
            this.limpiar();
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    public void listar(String valor) throws Exception{
        DatosTienda dao;
        dao = new DatosTienda();
        lstTienda = dao.listar();
    }
    
    public void leerID(Tienda car) throws Exception{
        
        DatosTienda dao;
        Tienda temp;
        
        try {
            dao = new DatosTienda();
            temp = dao.leerID(car);
            
            if (temp != null) {
                this.tienda = temp;
                this.accion = "Modificar";
            }
            
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    public void eliminar(Tienda car) throws Exception{
        
        DatosTienda dao;
        
        try {
            dao = new DatosTienda();
            dao.eliminarID(car);
            this.listar("V");
        } catch (Exception e) {
            throw e;
        }
    }
}
