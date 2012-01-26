/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vcard.properties.valuetypes;

/**
 *
 * @author dostert
 */
public class ValueN extends ValueBase {    
    public ValueN(String value){
        super(value);
    }
    public ValueN(String FamilyNames, String GivenNames, String AdditionalNames, String HonorificPrefixes, String HonorificSuffixes){
        super(FamilyNames + ";" + GivenNames + ";"
                + AdditionalNames + ";" + HonorificPrefixes + ";"
                + HonorificSuffixes);
    }
}
