/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vcard.properties;

/**
 *
 * @author dostert
 */
public class VCardPropertyLabelAddress  extends VCardPropertyBase{

    @Override
    protected void setMyCardinality() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public String getName() {
        return PropertyTypes.LABEL.getName();
    }    
}
