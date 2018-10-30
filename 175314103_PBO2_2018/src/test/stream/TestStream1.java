/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lenovo
 */
public class TestStream1 {

    public static void main(String[] args) {
        FileOutputStream fos = null;

        File file = new File("text.txt");
        String data = "hello I'm Syelen";
        try {
            fos = new FileOutputStream(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestStream1.class.getName()).log(Level.SEVERE, null, ex);

        } catch (IOException ex) {
            Logger.getLogger(TestStream1.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        }
    }
}
