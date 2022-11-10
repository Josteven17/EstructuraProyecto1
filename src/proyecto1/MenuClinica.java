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
public class MenuClinica {

    LinkedList<Paciente> listaPacientes = new LinkedList<Paciente>();
    LinkedList<Medicamentos> listamed = new LinkedList<Medicamentos>();
    LinkedList<String> medicamentos = new LinkedList<String>();
    String nombre;
    Paciente p;
    int ban = 1;

    public void Menu() {

        String dato = "***Opciones Menu***\n";
        dato += "1. Agregar paciente\n";
        dato += "2. Agregar medicamento\n";
        dato += "3. Recetar medicamentos\n";
        dato += "4. Mostrar medicamentos de paciente\n";
        dato += "5. Mostrar PAcientes\n";
        dato += "6. Mostrar Medicamentos\n";
        dato += "7. Eliminar Medicamento\n";
        dato += "8. Salir\n";
        int opcion = 0;
        do {

            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, dato));
            switch (opcion) {
                case 1:
                    while (ban > 0) {
                        nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del paciente");
                        listaPacientes.add(new Paciente(nombre, listamed));
                        ban = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea agregar otro paciente? 1= Si / 0 = No "));
                    }
                    ban = 1;

                    break;

                case 2:
                    while (ban > 0) {
                        nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del medicamento");
                        medicamentos.add(nombre);
                        ban = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea agregar otro paciente? 1= Si / 0 = No "));
                    }
                    ban = 1;
                    break;
                case 3:
                    nombre = JOptionPane.showInputDialog(null, "A cual paciente le desea agregar medicamentos");
                    if (busquedaPaciente(nombre) < 0) {
                        JOptionPane.showMessageDialog(null, "El paciente no existe");
                    } else {
                        while (ban > 0) {
                            p = a(busquedaPaciente(nombre));

                            p.recetar();
                            ban = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea agregar otro paciente? 1= Si / 0 = No "));
                        }
                        ban = 1;
                    }
                    break;

                case 4:
                    nombre = JOptionPane.showInputDialog(null, "De cual paciente desea ver la informacion");
                    if (busquedaPaciente(nombre) < 0) {
                        JOptionPane.showMessageDialog(null, "El paciente no existe");
                    } else {
                        p = a(busquedaPaciente(nombre));
                        JOptionPane.showMessageDialog(null, "Paciente: " + p.getNombre() + " Medicamentos: " + p.devolver() + " ");
                    }

                    break;
                case 5:
                    MostrarPacientes();

                    break;
                case 6:
                    MostrarMedicamentos();

                    break;
                    case 7:
                        String med = JOptionPane.showInputDialog(null, "Nombre de medicamento a eliminar");
                        if (EliminarMedicamento(med) < 0 ) {
                            JOptionPane.showMessageDialog(null, "El medicamento no esta en la lista");
                        }else{
                        medicamentos.remove(EliminarMedicamento(med));
                        }


                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Cerrando");
            }
        } while (opcion != 8);

    }

    public Paciente a(int a) {
        Paciente p = listaPacientes.get(a);
        return p;
    }

    public int busquedaPaciente(String nombre) {
        int index = -1;
        int contador = 0;
        for (int i = 0; i < listaPacientes.size(); i++) {
            String n = listaPacientes.get(i).getNombre();
            for (int j = 0; j < nombre.length(); j++) {
                if (nombre.charAt(i) == n.charAt(i)) {
                    contador++;
                }
            }
            if (contador == n.length()) {
                index = i;
                i = listaPacientes.size();
            }

        }

        return index;
    }

    public void MostrarMedicamentos() {
        String dato = "Medicamentos\n";
        for (int i = 0; i < medicamentos.size(); i++) {
            dato +=   medicamentos.get(i).toString() + " ";
        }
        JOptionPane.showMessageDialog(null, dato + " ");
    }

    public void MostrarPacientes() {
        String dato = "Pacientes\n";
        for (int i = 0; i < listaPacientes.size(); i++) {
            dato += listaPacientes.get(i).getNombre() + "\n";
        }
        JOptionPane.showMessageDialog(null, dato + " ");
    }

    public int EliminarMedicamento(String med) {
        
        int index = -1;
        int contador = 0;
        for (int i = 0; i < medicamentos.size(); i++) {
            String n = medicamentos.get(i).toString();
            for (int j = 0; j < med.length(); j++) {
                if (med.charAt(i) == n.charAt(i)) {
                    contador++;
                }
            }
            if (contador == n.length()) {
                index = i;
         
            }
        }
        return index;
    }
}
