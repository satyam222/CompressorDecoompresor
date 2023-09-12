/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import com_decom.compressor;
import com_decom.decompressor;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * author satya
 */
public class appFrame extends JFrame implements ActionListener {
    
    JButton compressButton;
    JButton decompressButton;
    
    appFrame(){
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close jframe on exit
        compressButton=new JButton("SELECT FILE TO COMPRESS");
        compressButton.setBounds(20, 100, 200, 30);//setting boundary
        compressButton.addActionListener(this);//adding action listener
        
        decompressButton =new JButton("SELECT FILE TO DECOMPRESS");
        decompressButton.setBounds(250, 100, 200, 30);//setting boundary
        decompressButton.addActionListener(this);//adding action listener
        
        this.add(compressButton);
        this.add(decompressButton);
        this.setSize(1000,500);//size of jframe
        this.getContentPane().setBackground(Color.red);
        this.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == compressButton){
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showOpenDialog(null);
            if(response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.print(file);
                try{
                    compressor.method(file);//written under compressor class
                }
                catch(Exception ee){
                    JOptionPane.showMessageDialog(null, ee.toString());
                }
            }
        }
        if(e.getSource() == decompressButton){
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showOpenDialog(null);
            if(response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.print(file);
                try{
                    decompressor.method(file);//written under decompressor class
                }
                catch(Exception ee){
                    JOptionPane.showMessageDialog(null, ee.toString());
                }
            }
        }
    }
}
