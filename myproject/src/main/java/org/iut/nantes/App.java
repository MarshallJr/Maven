package org.iut.nantes;
public class App {
    /**
     * Réalise une addition
     * @param args
     *
     */
    public static void main(String[] args) {
        Calculette cal = new Calculette();
        int res = cal.addition(5, 6);
        System.out.println("Calcul : " + res);
    }
}
