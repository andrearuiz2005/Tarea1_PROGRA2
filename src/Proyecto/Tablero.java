/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Proyecto;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;

/**
 *
 * @author ar466
 */
public class Tablero extends javax.swing.JFrame {

    Tablero_1 tablero;
    
    /**
     * Creates new form Tablero
     */
    public Tablero() {
        initComponents();
        tablero = new Tablero_1();
        configurarTablero();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void configurarTablero() {
    jPanel1.removeAll();
         GridLayout gridLayout = new GridLayout(tablero.getFila(), tablero.getColumna());
        gridLayout.setHgap(0);
        gridLayout.setVgap(0); 
        jPanel1.setLayout(gridLayout);
        for (int i = 0; i < tablero.getFila(); i++) {
        for (int j = 0; j < tablero.getColumna(); j++) {
           JButton button = new JButton(String.valueOf(tablero.getValorCasilla(i, j)));
            Color color = (i + j) % 2 == 0 ? Color.red : Color.WHITE;
            button.setBackground(color);
            button.setFont(new Font("Arial", Font.PLAIN, 31)); 
            button.setFocusPainted(false); 
            Dimension dimension = new Dimension(90, 90); 
            button.setPreferredSize(dimension);
            button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1)); 
            button.setBorder(BorderFactory.createRaisedBevelBorder()); 

            jPanel1.add(button);
        }
    }
    jPanel1.revalidate();
    jPanel1.repaint();
    
}

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero().setVisible(true);
            }
        });
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
