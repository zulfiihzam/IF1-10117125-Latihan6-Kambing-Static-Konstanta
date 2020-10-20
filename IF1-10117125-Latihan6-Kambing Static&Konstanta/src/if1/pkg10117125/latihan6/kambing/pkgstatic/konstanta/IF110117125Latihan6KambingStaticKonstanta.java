/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10117125.latihan6.kambing.pkgstatic.konstanta;

/**
 *
 * @author
 * Nama  : Zulfi Ihzam Rahmat
 * Kelas : IF 1
 * NIM   : 10117125
 * Deskripsi Program : 
 */
   
public class IF110117125Latihan6KambingStaticKonstanta {

    /**
     * @param args the command line arguments
     */
    //NAMA_KAMBING SEBAGAI KONSTANTA
        public static final String NAMA_KAMBING = "Midun";
    
        public static void main(String[] args) {
        // TODO code application logic here
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " + Mamalia.jumlahKambing);
    }
    
}
