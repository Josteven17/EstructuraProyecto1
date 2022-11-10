/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author josep
 */
public class Paciente {

    String nombre;
    //Medicamentos med = new Medicamentos();
    LinkedList<Medicamentos> medicinas;
    LinkedList<String>medi = new LinkedList<String>();

    public Paciente(String n, LinkedList list) {
        this.nombre = n;
        medicinas = new LinkedList<Medicamentos>();
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void MostrarPacientes() {
        String dato = "";

    }

    public void recetar() {
        String medixc = JOptionPane.showInputDialog(null, "Medicamento");
        medi.add(medixc);
    }

    public String devolver() {
        String dato = "";

        for (int i = 0; i < medi.size(); i++) {
            dato += medi.get(i) + " ";
        }
      
        return dato;
    }

}
