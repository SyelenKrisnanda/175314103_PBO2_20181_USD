/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import VIEW.mainFrame;
import javax.swing.JFrame;
/**
 * 
 * @author lenovo
 */
 
 
public class testMainFrame {
     public static void main(String[] args) {
        mainFrame test = new mainFrame();
        test.setSize(400, 500);
        test.setVisible(true);
    test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}