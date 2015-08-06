/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td.io;

import java.util.Scanner;

/**
 *
 * @author Jacob Aimino
 * 
 * Needs to somehow interact with iomanager events
 */
public class ConsoleInterface extends UserInterface {

    Scanner scanner;

    public ConsoleInterface() {
        scanner = new Scanner(System.in);
    }

    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public String input() {
        ScannerThread scanThread = new ScannerThread(scanner);
        new Thread(scanThread).start();
        return "";
    }

}
