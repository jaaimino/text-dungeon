/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package td.adventure.interactions;

import td.adventure.item.Item;

/**
 *
 * @author Jacob Aimino
 */
public interface Useable {
    
    /**
     * "Activate" or use a useable
     *  - Go through doors
     *  - Activate scenery
     *  - 
     * @return 
     */
    public boolean use();
    
    /**
     * Use this item on another Useable
     * @param item
     * @return 
     */
    public boolean useOn(Item item);
    
}
