/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vcard.properties;

/**
 *
 * @author dostert
 */
public enum PropertyTypes {
    BEGIN(VCardPropertyBase.PropertyName_BEGIN),
    VERSION(VCardPropertyBase.PropertyName_VERSION),
    ADR(VCardPropertyBase.PropertyName_ADR),
    BDAY(VCardPropertyBase.PropertyName_BDAY),
    EMAIL(VCardPropertyBase.PropertyName_EMAIL),
    FN(VCardPropertyBase.PropertyName_FN),
    LABEL(VCardPropertyBase.PropertyName_LABEL),
    N(VCardPropertyBase.PropertyName_N),
    NICKNAME(VCardPropertyBase.PropertyName_NICKNAME),
    TEL(VCardPropertyBase.PropertyName_TEL),
    TITLE(VCardPropertyBase.PropertyName_TITLE),
    URL(VCardPropertyBase.PropertyName_URL),
    END(VCardPropertyBase.PropertyName_END);
   
    private String myName;
    
    PropertyTypes(String name){
        myName = name;
    }
    
    public String getName(){
        return myName;
    }
}
