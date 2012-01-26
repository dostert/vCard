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
    
    public VCard(){
    }
    
    public void initNew(){
        myProperties.clear();
        VCardPropertyBase p;
        addProperty(PropertyTypes.BEGIN);
        p = addProperty(PropertyTypes.VERSION);
        ((VCardPropertyVersion)p).setValue(new ValueSingleText(VCardPropertyBase.DEFAULT_VALUE_21));
        addProperty(PropertyTypes.END);       
    }
    
    public boolean writeDown(PrintWriter pw){
        Collections.sort(myProperties, new ComparatorProperties());
        for(VCardPropertyBase vc : myProperties){
            pw.println(vc.toString());
        }
        return true;
    }
    
    public final VCardPropertyBase addProperty(PropertyTypes type){
        VCardPropertyBase p = null;
        
        switch(type){
            case ADR:
                p = new VCardPropertyDeliveryAddress();
                break;
            case BDAY:
                p = new VCardPropertyBirthday();
                break;
            case BEGIN:
                p = new VCardPropertyBegin();
                break;
            case EMAIL:
                p = new VCardPropertyEMail();
                break;
            case END:
                p = new VCardPropertyEnd();
                break;
            case FN:
                p = new VCardPropertyFormattedName();
                break;
            case LABEL:
                p = new VCardPropertyLabelAddress();
                break;
            case N:
                p = new VCardPropertyName();
                break;
            case NICKNAME:
                p = new VCardPropertyNickName();
                break;
            case TEL:
                p = new VCardPropertyTelephone();
                break;
            case TITLE:
                p = new VCardPropertyTitle();
                break;
            case VERSION:
                p = new VCardPropertyVersion();
                break;
            default:
                p = null;
        }
        if(p != null){
            myProperties.add(p);
        }
        return p;
    }
}
