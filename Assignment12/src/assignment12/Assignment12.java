/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment12;

/**
 *
 * @author dafefuve
 */
public class Assignment12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] language = {"Stress", "Syllable", "Moral"};
        String[] stress = {"English", "Thai", "German", "Russian", "Dutch", "Persian"};
        String[] syllable = {"French", "Spanish", "Chinese", "Hindi"};
        String[]  moral = {"Japanese", "Ganda", "Korean"};

        for(int i = 0; i <= stress.length; i++){
            if (i == 0){
                for( int j = 0; j < language.length; j++) {
                    System.out.print(language[j]);
                    if (j == 2) {
                        System.out.println();
                    } else System.out.print("\t\t");
                }
            }
            else{
                for( int j = 0; j < language.length; j++) {
                    if(j == 0){
                        System.out.print(stress[i - 1]);
                        System.out.print("\t\t");
                    }
                    else if(j == 1 && i <= syllable.length) {
                        System.out.print(syllable[i - 1]);
                        System.out.print("\t\t");
                    }
                        else if(j == 2 && i <= moral.length) {
                        System.out.println(moral[i - 1]);
                    }
                        else if(j == 2)
                        System.out.println();
                    else
                        System.out.print("\t\t");
                }
            }
        }
    }
    
}
