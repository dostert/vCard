/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vcard.properties;

import vcard.properties.valuetypes.ValueN;

/**
 *
 * @author dostert
 */
public class VCardPropertyName  extends VCardPropertyBase{

    @Override
    protected void setMyCardinality() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public String getName() {
        return PropertyTypes.N.getName();
    }        
    
}
