/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vcard.cards;

import vcard.properties.valuetypes.ValueSingleText;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import vcard.properties.*;

/**
 *
 * @author dostert
 */
public class VCard {

    private ArrayList<VCardPropertyBase> myProperties = new ArrayList<VCardPropertyBase>();
    
    public VCard() {
    }
    
    public void initNew() {
        myProperties.clear();
        VCardPropertyBase p;
        addProperty(VCardPropertyBegin.class);
        p = addProperty(VCardPropertyVersion.class);
        ((VCardPropertyVersion) p).setValue(new ValueSingleText(VCardPropertyBase.DEFAULT_VALUE_21));
        addProperty(VCardPropertyEnd.class);        
    }
    
    public boolean writeDown(PrintWriter pw) {
        Collections.sort(myProperties, new ComparatorProperties());
        for (VCardPropertyBase vc : myProperties) {
            pw.println(vc.toString());
        }
        return true;
    }
    
    public final VCardPropertyBase addProperty(Class type) {
        VCardPropertyBase cast = null;
        try {
            cast = VCardPropertyBase.class.cast(type.newInstance());
        } catch (Exception ex) {
            return null;
        }
        
        if (cast != null) {
            myProperties.add(cast);
        }
        return (VCardPropertyBase)cast;
    }
    
    
}
