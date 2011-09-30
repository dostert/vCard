/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vcard.cards;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author dostert
 */
public class VCardContainer {
    public ArrayList<VCard> cards = new ArrayList<VCard>();
    
    public VCard createVCard(){
        VCard vc = new VCard();
        vc.initNew();
        cards.add(vc);
        return vc;
    }
    
    public boolean wirteToFile(String filename) throws FileNotFoundException{
        File f = new File(filename);
        PrintWriter pw = new PrintWriter(f);
        for(VCard vc : cards){
            vc.writeDown(pw);
        }
        pw.close();
        return true;
    } 
}
