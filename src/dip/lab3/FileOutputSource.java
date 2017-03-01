/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

import java.io.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;

/**
 *
 * @author Aruni
 */
public class FileOutputSource implements MessageOutputSource {

    private final String fileName;

    public FileOutputSource(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void outputMessage(String message) {

        PrintWriter outputFile = null;
        try {
            outputFile = new PrintWriter(this.fileName);
            outputFile.println(message);
            outputFile.flush();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (outputFile != null) {
                outputFile.close();
            }

        }

    }

}
