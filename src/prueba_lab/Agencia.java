/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba_lab;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Victoria Murillo = LOGICA - DISEÑO
 * Andrea Ruiz = DISEÑO - LOGICA
 * @author Administrator
 */

public class Agencia {
    private static Banco banco;
    private static JFrame frame; 
    private static JLabel titleLabel;

    public static void main(String[] args) {
        banco = new Banco(10);  

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        frame = new JFrame("Banco Catrachita");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());
        frame.add(panelPrincipal, BorderLayout.CENTER);

       
        JPanel panelTitulo = new JPanel();
        panelTitulo.setBackground(new Color(66, 139, 202));
        panelTitulo.setPreferredSize(new Dimension(frame.getWidth(), 30));
        panelTitulo.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 5));
        panelPrincipal.add(panelTitulo, BorderLayout.NORTH);

        
        titleLabel = new JLabel(frame.getTitle());
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setForeground(Color.WHITE);
        panelTitulo.add(titleLabel);

        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(5, 1, 10, 10));
        panelBotones.setBorder(new EmptyBorder(20, 20, 20, 20));
        panelPrincipal.add(panelBotones, BorderLayout.CENTER);

        // Botones con mejor apariencia y disposición
        JButton btnAgregar = createStyledButton("Agregar Cuenta");
        JButton btnListar = createStyledButton("Listar Cuentas");
        JButton btnIntereses = createStyledButton("Aplicar Intereses");
        JButton btnTransferir = createStyledButton("Transferir");
        JButton btnBuscar = createStyledButton("Buscar Cuenta");

        panelBotones.add(btnAgregar);
        panelBotones.add(btnListar);
        panelBotones.add(btnIntereses);
        panelBotones.add(btnTransferir);
        panelBotones.add(btnBuscar);

       
        btnAgregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new AgregarCuentaForm(banco);
            }
        });

        btnListar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ListarCuentasForm(banco);
            }
        });

        btnIntereses.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                banco.intereses();
                JOptionPane.showMessageDialog(frame, "Intereses aplicados.");
            }
        });

        btnTransferir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new TransferirForm(banco);
            }
        });

        btnBuscar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String codigoStr = JOptionPane.showInputDialog(frame, "Ingrese el código de la cuenta a buscar:");
                if (codigoStr != null && !codigoStr.isEmpty()) {
                    int codigo = Integer.parseInt(codigoStr);
                    CuentaBancaria cuenta = banco.buscar(codigo);
                    if (cuenta != null) {
                        JOptionPane.showMessageDialog(frame, "Cuenta encontrada:\n"
                                + "Código: " + cuenta.getCodigo() + "\n"
                                + "Nombre: " + cuenta.getNombreCliente() + "\n"
                                + "Saldo: " + cuenta.getSaldo());
                    } else {
                        JOptionPane.showMessageDialog(frame, "No se encontró una cuenta con ese código.");
                    }
                }
            }
        });

        frame.setVisible(true);
    }

   
    public static void setJFrameTitle(String title) {
        if (titleLabel != null) {
            titleLabel.setText(title);
        }
        if (frame != null) {
            frame.setTitle(title);
        }
    }

   
    private static JButton createStyledButton(String text) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.BOLD, 14));
        button.setForeground(Color.WHITE);
        button.setBackground(new Color(66, 139, 202));
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setOpaque(true);
        button.setPreferredSize(new Dimension(150, 40));
        return button;
    }
}

