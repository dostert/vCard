/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vcard;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import vcard.cards.VCard;
import vcard.cards.VCardContainer;
import vcard.properties.PropertyTypes;
import vcard.properties.VCardPropertyFormattedName;
import vcard.properties.VCardPropertyName;
import vcard.properties.valuetypes.ValueN;
import vcard.properties.valuetypes.ValueSingleText;

/**
 *
 * @author dostert
 */
public class testapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VCardContainer c = new VCardContainer();
        VCard vc = c.createVCard();
        VCardPropertyName pn = (VCardPropertyName)vc.addProperty(PropertyTypes.N);
        pn.setValue(new ValueN("Ostertag", "Dirk", "Günter,Gotthilf", "Director", ""));
        VCardPropertyFormattedName pfn = (VCardPropertyFormattedName)vc.addProperty(PropertyTypes.FN);
        pfn.setValue(new ValueSingleText("Dirk Ostertag"));
        
        c.createVCard();
        try {
            c.wirteToFile("./test.vcf");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(testapp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
