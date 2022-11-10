/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author josep
 */
public class Medicamentos {

    int cantidad;
    String medicamento;


    
    public Medicamentos(String med) {
        this.medicamento = med;
        this.cantidad = 0;

    }

     public Medicamentos() {
        this.medicamento = "";
 

    }
    

    public void setMedicamento(String med) {
        this.medicamento = med;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setCantidad(int can) {
        this.cantidad = can;
    }

    public int getCantidad() {
        return cantidad;
    }
}
