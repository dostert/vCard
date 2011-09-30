/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vcard.properties;

/**
 *
 * @author dostert
 */
public class VCardPropertyBegin  extends VCardPropertyBase{

    public VCardPropertyBegin(){
        setValue(new ValueSingleText(DEFAULT_VALUE_VCARD));
    }
    
    @Override
    protected void setMyCardinality() {
        myCardinality = CARDINALITY_EXACT_ONCE_MUST;
    }

    @Override
    public String getName() {
        return PropertyTypes.BEGIN.getName();
    }

    protected void setValue(ValueSingleText value) {
        myValue = value;
    }
}
