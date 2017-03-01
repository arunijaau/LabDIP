/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

import java.util.Scanner;

/**
 *
 * @author ajayasooriya
 */
public class KeyboardInputSource implements InputSource {
       
    @Override
    public String inputMessage(){
        System.out.println("Enter an input and press enter: ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
