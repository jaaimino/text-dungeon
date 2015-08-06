/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package td.managers;

import td.io.ConsoleInterface;
import td.io.UserInterface;
import td.io.SwingInterface;

/**
 *
 * @author Jacob Aimino
 */
public class IOManager {
    
    
    static UserInterface io;
    public static final int CONSOLE = 0;
    public static final int SWING = 1;
    
    public static void initialize(int type){
        switch(type){
            case SWING:
                IOManager.io = new SwingInterface();
                break;
            default:
                IOManager.io = new ConsoleInterface();
            break;
        }
    }
    
    public static String input(){
        return io.input();
    }
    
    public static void print(String message){
        io.print(message);
    }
    
}
