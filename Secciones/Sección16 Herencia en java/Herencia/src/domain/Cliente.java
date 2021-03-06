
package domain;

import java.util.Date;


public class Cliente extends Persona{
 private int  idcliente;
 private Date fechaRegistro;
 private boolean vip;
 private static int contadorCliente;
 
 public Cliente(Date fechaRegistro,boolean vip,String nombre, 
         char genero, int edad, String dirección
 ){
    super(nombre,genero,edad,dirección);
     this.idcliente= ++Cliente.contadorCliente;
     this.fechaRegistro= fechaRegistro;
     this.vip= vip;
 }

    public int getIdcliente() {
        return idcliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("idcliente=").append(idcliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", =").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
 
    
}
