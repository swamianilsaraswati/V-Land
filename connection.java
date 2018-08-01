/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample_shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTextField;

/**
 *
 * @author Shivi
 */
public class connection extends javax.swing.JFrame {

    /**
     * Creates new form connection
     */
    public connection() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 968, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 631, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
                    connection f1=new connection();
                    JTextField tf=new JTextField("hi");
                    tf.setBounds(200,200,100,100);
                    f1.add(tf);
                    tf.setVisible(true);
                    try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/swami?autoReconnect=true&useSSL=false", "root", "root");
			
                        Statement stmt=conn.createStatement();
                        ResultSet rs= stmt.executeQuery("select * from product_name");
                        /*while(rs.next()){
                            text.setText(rs.getString("product"));
                        }*/
                        //text1.setText("hi");
                        System.out.println("Connected");
                        while(rs.next())
                            tf.setText(rs.getString("product"));
                        //System.out.println(rs.getString("product"));
			conn.close();
		}catch(SQLException e){
                    e.printStackTrace();
                }catch(Exception e1){
                    System.out.println("error");
                    e1.printStackTrace();
                }
        java.awt.EventQueue.invokeLater(new Runnable() {
            connection f=new connection();
            public void run() {
                f1.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
