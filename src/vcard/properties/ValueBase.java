/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vcard.properties;

/**
 *
 * @author dostert
 */
public abstract class ValueBase {
    protected String mValue;
    public ValueBase(String value){
        mValue = value;
    }
    @Override
    public String toString(){
        return mValue;
    }
}
