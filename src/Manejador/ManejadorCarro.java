package Manejador;

import Datos.DatosCarro;
import Modelo.Carro;
import java.util.List;

public class ManejadorCarro {
    
    private Carro carro = new Carro();
    private List<Carro> lstCarro;
    private String accion;
//    private UploadedFile file;
    
    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.limpiar();
        this.accion = accion;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public List<Carro> getLstCarro() {
        return lstCarro;
    }

    public void setLstCarro(List<Carro> lstCarro) {
        this.lstCarro = lstCarro;
    }
    
    /* */
    
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
    
    private void limpiar(){
        this.carro.setIdtipoCarro(0);
        this.carro.setModelo("");
        this.carro.setAnno(0);
        this.carro.setMarca(null);
        this.carro.setPrecioBase(0);
        this.carro.setColor("");
        this.carro.setVin("");
        this.carro.setEstadoCarro(true);
    }
    
    private void registrar() throws Exception{
        
        DatosCarro dao;
        
        try {
            dao = new DatosCarro();
            dao.registrar(carro);
            this.listar("V");
            this.limpiar();
        } catch (Exception e) {
            throw e;
        }
    }
    
    private void modificar() throws Exception{
        
        DatosCarro dao;
        
        try {
            dao = new DatosCarro();
            dao.modificar(carro);
            this.listar("V");
            this.limpiar();
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    public void listar(String valor) throws Exception{
        DatosCarro dao;
        dao = new DatosCarro();
        lstCarro = dao.listar();
    }
    
    public void leerID(Carro car) throws Exception{
        
        DatosCarro dao;
        Carro temp;
        
        try {
            dao = new DatosCarro();
            temp = dao.leerID(car);
            
            if (temp != null) {
                this.carro = temp;
                this.accion = "Modificar";
            }
            
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    public void eliminar(Carro car) throws Exception{
        
        DatosCarro dao;
        
        try {
            dao = new DatosCarro();
            dao.eliminarID(car);
            this.listar("V");
        } catch (Exception e) {
            throw e;
        }
    }
}
