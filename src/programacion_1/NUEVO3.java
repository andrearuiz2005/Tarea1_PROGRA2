/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package programacion_1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author ar466
 */


public class NUEVO3 extends javax.swing.JFrame {
 private JPanel mainPanel;
    private JTextField playerXField;
    private JTextField playerOField;
    private JButton startButton;
    private JButton[][] buttons;
    private JLabel statusLabel;
    private String playerX;
    private String playerO;
    private char currentPlayer;
    private char[][] board;
    private static final int SIZE = 3;
    /**
     * Creates new form NUEVO3
     */
    public NUEVO3() {
        initComponents();
        setTitle("Tic-Tac-Toe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        initializeComponents();
        setContentPane(mainPanel);
        board = new char[SIZE][SIZE];
        initializeBoard();
    }
    
    private void initializeComponents() {
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(3, 2));
        topPanel.add(new JLabel("Player X:"));
        playerXField = new JTextField();
        topPanel.add(playerXField);
        topPanel.add(new JLabel("Player O:"));
        playerOField = new JTextField();
        topPanel.add(playerOField);
        startButton = new JButton("Start");
        topPanel.add(startButton);
        statusLabel = new JLabel("Enter player names and press Start");
        topPanel.add(statusLabel);
        mainPanel.add(topPanel, BorderLayout.NORTH);
        
        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(SIZE, SIZE));
        buttons = new JButton[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                buttons[i][j] = new JButton("");
                buttons[i][j].setFont(new Font("Arial", Font.PLAIN, 40));
                gridPanel.add(buttons[i][j]);
                final int row = i;
                final int col = j;
                buttons[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        handleButtonClick(row, col);
                    }
                });
            }
        }
        mainPanel.add(gridPanel, BorderLayout.CENTER);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playerX = playerXField.getText();
                playerO = playerOField.getText();
                if (playerX.isEmpty() || playerO.isEmpty()) {
                    JOptionPane.showMessageDialog(TicTacToe.this, "Please enter names for both players.");
                    return;
                }
                currentPlayer = 'X';
                statusLabel.setText("Turn: " + playerX);
                resetBoard();
                enableButtons(true);
            }
        });
    }
private void handleButtonClick(int row, int col) {
        if (buttons[row][col].getText().isEmpty() && board[row][col] == '-') {
            board[row][col] = currentPlayer;
            buttons[row][col].setText(String.valueOf(currentPlayer));
            if (checkWin()) {
                statusLabel.setText((currentPlayer == 'X' ? playerX : playerO) + " wins!");
                enableButtons(false);
            } else if (checkDraw()) {
                statusLabel.setText("It's a draw!");
                enableButtons(false);
            } else {
                currentPlayer = (currentPlayer == 'X' ? 'O' : 'X');
                statusLabel.setText("Turn: " + (currentPlayer == 'X' ? playerX : playerO));
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid move. Try again.");
        }
    }

private void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = '-';
            }
        }
    }

private boolean checkWin() {
        for (int i = 0; i < SIZE; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return true;
            }
        }
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }
        return false;
    }
private boolean checkDraw() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    private void resetBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = '-';
                buttons[i][j].setText("");
            }
        }
    }
private void enableButtons(boolean enable) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                buttons[i][j].setEnabled(enable);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }
}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NUEVO3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NUEVO3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NUEVO3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NUEVO3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NUEVO3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
