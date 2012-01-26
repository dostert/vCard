/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vcard.properties;

import vcard.properties.valuetypes.ValueBase;

/**
 *
 * @author dostert
 */
public abstract class VCardPropertyBase {
    /* PropNames */
    public static String PropertyName_BEGIN = "BEGIN";
    public static String PropertyName_END = "END";
    public static String PropertyName_N = "N";
    public static String PropertyName_FN = "FN";
    public static String PropertyName_NICKNAME = "NICKNAME";
    public static String PropertyName_BDAY = "BDAY";
    public static String PropertyName_ADR = "ADR";
    public static String PropertyName_LABEL = "LABEL";
    public static String PropertyName_TEL = "TEL";
    public static String PropertyName_EMAIL = "EMAIL";
    public static String PropertyName_TITLE = "TITLE";
    public static String PropertyName_URL = "URL";
    public static String PropertyName_VERSION  = "VERSION";       
/*    
    +-------------+--------------------------------------------------+
    | Cardinality | Meaning                                          |
    +-------------+--------------------------------------------------+
    |      1      | Exactly one instance per vCard MUST be present.  |
    |      *1     | Exactly one instance per vCard MAY be present.   |
    |      1*     | One or more instances per vCard MUST be present. |
    |      *      | One or more instances per vCard MAY be present.  |
    +-------------+--------------------------------------------------+
*/
    public static String CARDINALITY_NOT_SET = "";
    public static String CARDINALITY_EXACT_ONCE_MUST = "1";
    public static String CARDINALITY_EXACT_ONCE_MAY = "*1";
    public static String CARDINALITY_ONE_OR_MORE_MUST = "1*";
    public static String CARDINALITY_ONE_OR_MORE_MAY = "*";
    
    public static String DEFAULT_VALUE_VCARD = "VCARD";
    public static String DEFAULT_VALUE_40 = "4.0";
    public static String DEFAULT_VALUE_30 = "3.0";
    public static String DEFAULT_VALUE_21 = "2.1";
    
    protected String myCardinality = CARDINALITY_NOT_SET;
    protected ValueBase myValue = null;
    protected abstract void setMyCardinality();
    
    public String getCardinality(){
        return myCardinality;
    }
    
    protected final void setValue(ValueBase value){
        myValue = value;
    }
    
    public ValueBase getValue(){
        return myValue;
    }
    
    public abstract String getName();
    
    @Override
    public String toString(){
        return getName() + ":" + getValue().toString();
    }
}
