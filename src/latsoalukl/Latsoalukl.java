/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latsoalukl;

/**
 *
 * @author USER
 */
public class Latsoalukl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=4;
        int b=9;
        int total = 0;
        System.out.println("jumlah Deret Aritmatikanya adalah:");
        for (int n=30; n<40; n++ ){
            int u = a + ((n-1)* b);
            total += u;
            System.out.println(u);
    }
        System.out.println("total deret: " +total);
       
}
}
