/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td.runtime;

import com.esotericsoftware.minlog.Log;
import java.io.IOException;
import td.managers.IOManager;

/**
 *
 * @author Jacob Aimino
 */
public class TextDungeon {

    /**
     * @param args the command line arguments
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        Log.set(Log.LEVEL_NONE);
        IOManager.initialize(IOManager.CONSOLE);
        IOManager.input();
    }

}
