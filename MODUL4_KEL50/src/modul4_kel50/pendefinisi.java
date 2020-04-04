/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4_kel50;

/**
 *
 * @author Kiko
 */
public class pendefinisi {
    public static void main(String[] args) {
        
public void greeting(){
            
    public void greeting(){
        System.out.println("Hai, saya method dari class pendefinisi. Salam kenal :)");
    }
    public void kelompok(String kelompok){
        System.out.println(kelompok);
    }
    public String kenalan (String nama, String hobi){
        return "Hai, Nama saya " + nama + " hobi saya " + hobi;
    }

            pendefinisi objek = new pendefinisi();
 
        objek.greeting();
        objek.kelompok("Kelompok xx");
        String print = objek.kenalan("Erika", "Baca Novel");
        System.out.println(print);


}
