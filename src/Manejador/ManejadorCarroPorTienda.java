package Manejador;

import Datos.DatosCarroPorTienda;
import Modelo.CarroPorTienda;
import java.util.List;

public class ManejadorCarroPorTienda {
    
    private CarroPorTienda carroT = new CarroPorTienda();
    private List<CarroPorTienda> lstCarroT;
    private String accion;
    
    /* ----------------------------- Sets & Gets ----------------------------- */

    public CarroPorTienda getCarroT() {
        return carroT;
    }

    public void setCarroT(CarroPorTienda CarroT) {
        this.carroT = CarroT;
    }

    public List<CarroPorTienda> getLstCarroT() {
        return lstCarroT;
    }

    public void setLstCarroT(List<CarroPorTienda> lstCarroT) {
        this.lstCarroT = lstCarroT;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }
    
    
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
        this.carroT.setIdCxT(0);
        this.carroT.setIdCarro(0);
        this.carroT.setIdTienda(0);
    }
    
    public void registrar() throws Exception{
        
        DatosCarroPorTienda dao;
        
        try {
            dao = new DatosCarroPorTienda();
            dao.registrar(carroT);
            this.listar("V");
            this.limpiar();
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void modificar() throws Exception{
        
        DatosCarroPorTienda dao;
        
        try {
            dao = new DatosCarroPorTienda();
            dao.modificar(carroT);
            this.listar("V");
            this.limpiar();
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    public void listar(String valor) throws Exception{
        DatosCarroPorTienda dao;
        dao = new DatosCarroPorTienda();
        lstCarroT = dao.listar();
    }
    
    public void leerID(CarroPorTienda car) throws Exception{
        
        DatosCarroPorTienda dao;
        CarroPorTienda temp;
        
        try {
            dao = new DatosCarroPorTienda();
            temp = dao.leerID(car);
            
            if (temp != null) {
                this.carroT = temp;
                this.accion = "Modificar";
            }
            
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    public void eliminar(CarroPorTienda car) throws Exception{
        
        DatosCarroPorTienda dao;
        
        try {
            dao = new DatosCarroPorTienda();
            dao.eliminarID(car);
            this.listar("V");
        } catch (Exception e) {
            throw e;
        }
    }
}
