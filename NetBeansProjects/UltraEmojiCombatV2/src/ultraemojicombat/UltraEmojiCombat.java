/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ultraemojicombat;

/**
 *
 * @author Celmar Pereira
 */
public class UltraEmojiCombat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lutador L[] = new Lutador[6];
        L[0] = new Lutador("Pretty Boy", "Fran�a", 31, 1.75f, 
                68.9f, 11, 2, 1);
        L[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 
                57.8f, 14, 2, 3);
        L[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 
                80.9f, 12, 2, 1);
        L[3] = new Lutador("Dead Code", "Austr�lia", 28, 1.93f, 
                81.6f, 13, 0, 2);
        L[4] = new Lutador("Ufocobol", "Brasil", 37, 1.70f, 
                119.3f, 5, 4, 3);
        L[5] = new Lutador("Nerdaard", "EUA", 30, 1.81f, 
                105.7f, 12, 2, 4);
        
        // Luta
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(L[0], L[1]);
        UEC01.lutar();
        
    }
    
}
