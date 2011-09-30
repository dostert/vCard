/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vcard.properties;

import java.util.Comparator;

/**
 *
 * @author dostert
 */
public class ComparatorProperties implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if( o1 instanceof VCardPropertyBegin)
            return -1;
        if( o2 instanceof VCardPropertyBegin)
            return 1;
        if( o1 instanceof VCardPropertyEnd)
            return 1;
        if( o2 instanceof VCardPropertyEnd)
            return -1;        
        return 0;
    }
    
}
