/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package II_PARCIAL;
import Prueba.EmpleadoPorHora;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author ar466
 */


public class TestEmpresa {
    private static Empresa empresa;

    public static void main(String[] args) {
       
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
       
        }

        empresa = new Empresa(10);

        JFrame frame = new JFrame("Gestión de Empleados");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());

        // Panel para los controles de entrada
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Panel para el formulario de entrada
        JPanel formPanel = new JPanel(new GridLayout(4, 2, 5, 5));
        formPanel.setBorder(BorderFactory.createTitledBorder("Datos del Empleado"));

        JTextField nombreField = new JTextField();
        JTextField tarifaField = new JTextField();
        JTextField horasField = new JTextField();
        formPanel.add(new JLabel("Nombre:"));
        formPanel.add(nombreField);
        formPanel.add(new JLabel("Tarifa por Hora:"));
        formPanel.add(tarifaField);
        formPanel.add(new JLabel("Horas Trabajadas:"));
        formPanel.add(horasField);

        inputPanel.add(formPanel);

        // Panel para los botones
        JPanel buttonPanel = new JPanel(new GridLayout(1, 4, 5, 5));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

        JButton agregarButton = new JButton("Agregar Empleado");
        JButton mostrarButton = new JButton("Mostrar Empleados");
        JButton asignarHorasButton = new JButton("Asignar Horas");
        JButton pagarButton = new JButton("Pagar Empleado");
        buttonPanel.add(agregarButton);
        buttonPanel.add(asignarHorasButton);
        buttonPanel.add(mostrarButton);
        buttonPanel.add(pagarButton);

        inputPanel.add(buttonPanel);

        // Área de texto para mostrar resultados
        JTextArea outputArea = new JTextArea();
        outputArea.setEditable(false);
        outputArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane scrollPane = new JScrollPane(outputArea);

        // Agregar componentes al frame
        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Acción para agregar empleado
        agregarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre = nombreField.getText();
                    double tarifa = Double.parseDouble(tarifaField.getText());
                    EmpleadoPorHora empleado = new EmpleadoPorHora(nombre, tarifa);
                    if (empresa.agregarEmpleado(empleado)) {
                        outputArea.append("Empleado agregado.\n");
                    } else {
                        outputArea.append("No se pudo agregar el empleado.\n");
                    }
                } catch (NumberFormatException ex) {
                    outputArea.append("Error en la entrada de datos.\n");
                }
            }
        });

        // Acción para mostrar empleados
        mostrarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                outputArea.setText(empresa.mostrarEmpleados());
            }
        });

        // Acción para asignar horas
        asignarHorasButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre = nombreField.getText();
                    int horas = Integer.parseInt(horasField.getText());
                    if (empresa.asignarHoras(nombre, horas)) {
                        outputArea.append("Horas asignadas a " + nombre + ".\n");
                    } else {
                        outputArea.append("Empleado no encontrado.\n");
                    }
                } catch (NumberFormatException ex) {
                    outputArea.append("Error en la entrada de datos.\n");
                }
            }
        });

        // Acción para pagar a empleado
        pagarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreField.getText();
                String resultado = empresa.pagarEmpleado(nombre);
                outputArea.append(resultado + "\n");
            }
        });

        frame.setVisible(true);
    }
}
