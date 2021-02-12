import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class FabriqueResistor {



    public enum couleur{
        N(0),
        B(1),
        R(2),
        O(3),
        J(4),
        V(5),
        b(6),
        M(7),
        G(8),
        L(9),
        o(0),
        A(0);

        private int valeur;


        couleur(int valeur) {
            this.valeur = valeur;
        }
    }

    public enum tolerence{

        N(0),
        B(1),
        R(2),
        O(3),
        J(4),
        V(0.5),
        b(0.25),
        M(0.1),
        G(0.05),
        L(0),
        A(10),
        o(5);

        private double valeurTolerence;

        tolerence(double valeurTolerence){
            this.valeurTolerence = valeurTolerence;
        }
    }

    public static Resistor fabriqueResistor(String couleurs){

        Resistor resistor = new Resistor();
        Pattern couleurChoisie = Pattern.compile("([NBROJVbML]){2,3}[NBROJVbMLoA][BROJVbMoA]$");
        String strChar1,strChar2,strChar3,strChar4,strChar5 = "xxxxx";
        double multiplicateur;
        couleur choix1,choix2,choix3,choix4,choix5;
        tolerence tolChoix;
        double tolValeur;
        int valeur1,valeur2,valeur3,valeur4,valeur5;
        Matcher matcher = couleurChoisie.matcher(couleurs);

        if (matcher.find()){


            strChar1 = Character.toString(couleurs.charAt(0));
            strChar2 = Character.toString(couleurs.charAt(1));
            strChar3 = Character.toString(couleurs.charAt(2));
            strChar4 = Character.toString(couleurs.charAt(3));

            if (couleurs.length() == 5) {
                strChar5 = Character.toString(couleurs.charAt(4));
                choix5 = couleur.valueOf(strChar5);
                valeur5 = choix5.valeur;
            }

            choix1 = couleur.valueOf(strChar1);
            choix2 = couleur.valueOf(strChar2);
            choix3 = couleur.valueOf(strChar3);
            choix4 = couleur.valueOf(strChar4);

            valeur1 = choix1.valeur;
            valeur2 = choix2.valeur;
            valeur3 = choix3.valeur;
            valeur4 = choix4.valeur;

            if (couleurs.length() == 5) {
                multiplicateur = valeur4;
                if (couleurs.charAt(4) == 'A') {
                    multiplicateur = 0.01;
                } else if (couleurs.charAt(4) == 'o') {
                    multiplicateur = 0.1;
                }
            }

            if (couleurs.charAt(3) == 'A'){
                multiplicateur = 0.01;
            }else if (couleurs.charAt(3) == 'o'){
                multiplicateur = 0.1;
            }

            multiplicateur = Math.pow(10,valeur3);

            if (couleurs.length() == 5){
                tolChoix = tolerence.valueOf(strChar5);
                tolValeur = tolChoix.valeurTolerence;
            }

            tolChoix = tolerence.valueOf(strChar4);
            tolValeur = tolChoix.valeurTolerence;

            resistor.setTolerence(tolValeur);

            if (couleurs.length() == 5){
                resistor.setResistance((valeur1 * 100 + valeur2 * 10 + valeur3) * multiplicateur);
            }
            resistor.setResistance((valeur1 * 10 + valeur2) * multiplicateur);

            return resistor;

        }

        return null;

    }


}
