/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tola.lemma.number_format;

import java.text.DecimalFormat;

/**
 *
 * @author Tola Lemma
 */

public class Format {
    public static void main(String[] args) {
       var pi=3.138;
       var dF=new DecimalFormat( "#.##");
   var formattedText=dF.format(pi); 
System.out.println(formattedText);
}
}

