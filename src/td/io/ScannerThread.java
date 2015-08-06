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
 */
public class ScannerThread implements Runnable{
    
    Scanner scanner;
    
    public ScannerThread(Scanner scanner){
        this.scanner = scanner;
    }

    @Override
    public void run() {
        while(true){
            
        }
    }
    
}
