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
public class MODUL4_KEL50 {

    /**
     * @param args the command line arguments
     */
    // non-return type dengan parameter
    static void cetak(String kelompok){  
        System.out.println(kelompok);
    }
    // non-return type tanpa parameter
    static void cetak1(){
        System.out.println("Hello Praktikan DKP 2020 ^^ ");
    }
    // return type dengan parameter
    static String cetak2(String text){
        return text;
    }
    // return type tanpa parameter
    static String cetak3(){
        return "Kali ini kita akan belajar mengenai Function";
    }

    public static void main(String[] args) {
        //penggunaan function non-return type dengan megisikan argument untuk parameter kelompok
        cetak("Kelompok 50");
        //penggunaan function non-return type tanpa parameter
        cetak1(); 
        //penggunaan function return type dengan mengisikan nilai pada parameter text
        System.out.println(cetak2("Function dengan Return"));
        //penggunaan function return type tanpa parameter
        System.out.println(cetak3()); 
    }
}
