/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vcard.properties;

import vcard.properties.valuetypes.ValueSingleText;

/**
 *
 * @author dostert
 */
public class VCardPropertyVersion  extends VCardPropertyBase{
 
    @Override
    protected void setMyCardinality() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public String getName() {
        return PropertyTypes.VERSION.getName();
    }      
    
    public void setValue(ValueSingleText value){
        myValue = value;
    }
}
