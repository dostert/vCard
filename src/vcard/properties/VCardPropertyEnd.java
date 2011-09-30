/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vcard.properties;

/**
 *
 * @author dostert
 */
public class VCardPropertyEnd  extends VCardPropertyBase{

    public VCardPropertyEnd(){
        setValue(new ValueSingleText(DEFAULT_VALUE_VCARD));
    }
            
    @Override
    protected void setMyCardinality() {
        myCardinality = CARDINALITY_EXACT_ONCE_MUST;
    }
     
    @Override
    public String getName() {
        return PropertyTypes.END.getName();
    }
}
