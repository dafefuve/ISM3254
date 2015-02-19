package assignment13;

/**
 * Created by dafefuve on 2/19/15.
 */
public class assignment13 {
    public static void main(String[] args) {
        String[] stress = {"English", "Thai", "German", "Russian", "Dutch", "Persian"};
        String[] syllable = {"French", "Spanish", "Chinese", "Hindi"};
        String[] moral = {"Japanese", "Ganda", "Korean"};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(j == 0){
                    System.out.print(stress[i]);
                    System.out.print("\t\t");
                }
                else if (j==1){
                    System.out.print(syllable[i]);
                    System.out.print("\t\t");
                }
                else{
                    System.out.print(moral[i]);
                    System.out.print("\t\t");
                }
            }
            System.out.println();
        }
    }
}
