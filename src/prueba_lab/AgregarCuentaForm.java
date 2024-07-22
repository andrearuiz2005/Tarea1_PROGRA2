/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba_lab;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Administrator
 */

public class AgregarCuentaForm extends JFrame {
    private Banco banco;

    public AgregarCuentaForm(Banco banco) {
        this.banco = banco;

        setTitle("Agregar Cuenta");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        placeComponents(panel);
        add(panel);

        setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        JLabel codigoLabel = new JLabel("Código:");
        codigoLabel.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(codigoLabel);

        JTextField codigoText = new JTextField(20);
        panel.add(codigoText);

        JLabel nombreLabel = new JLabel("Nombre:");
        nombreLabel.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(nombreLabel);

        JTextField nombreText = new JTextField(20);
        panel.add(nombreText);

        JButton agregarButton = new JButton("Agregar");
        agregarButton.setFont(new Font("Arial", Font.BOLD, 14));
        agregarButton.setBackground(Color.BLUE); // Establecer color de fondo azul
        agregarButton.setForeground(Color.WHITE); // Establecer color de texto blanco
        agregarButton.setAlignmentX(Component.CENTER_ALIGNMENT); // Centrar el botón en el panel
        panel.add(agregarButton);

        agregarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int codigo = Integer.parseInt(codigoText.getText());
                    String nombre = nombreText.getText();
                    if (banco.agregar(codigo, nombre)) {
                        JOptionPane.showMessageDialog(AgregarCuentaForm.this,
                                "Cuenta agregada exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(AgregarCuentaForm.this,
                                "Error al agregar cuenta. El código ya existe o no hay espacio disponible.",
                                "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(AgregarCuentaForm.this,
                            "Ingrese un código válido.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        Banco banco = new Banco(10); // Crear un banco con capacidad para 10 cuentas
        new AgregarCuentaForm(banco);
    }
}
