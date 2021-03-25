import java.util.Scanner;

public class Main {



    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        Resistor resistor;
        CircuitParallele circuitEnParallele = new CircuitParallele();
        AbstarctCircuit circuit = null;


        System.out.println("Bonjour utilisateur voici la facons d'écrire votre circuit");
        System.out.println("Veuillez ecrire de la facon suivante : ");
        System.out.println("Pour mettre une résistance en serie mettre les resistance voulu entre ()");
        System.out.println("Pour mettre une resistance en parallèle mettre les resistance voulu entre []");
        System.out.println("Tres important de pas oublier de mettre des espaces après chaque paranthèse");
        System.out.println("et après chaque crochet ");
        System.out.println("et aprèes chaque résistance ");
        System.out.println("voici aussi comment écrire les résistance");
        System.out.println("Vous devez choisir parmis les caratèere suivant et en écrire 4 ou 5");
        System.out.println("Les caractere sont les suivant : NBROJVbMLoA");

        String circuitVoulu = sc.next();
        circuit = FabriqueCircuit.fabriqueCircuit(circuitVoulu);

        System.out.println("veuillez écrire la tension souhaité");

        double tension1;
        circuit.tension = sc.nextDouble();

        System.out.println(circuit.toString());








       /* String choixDuCircuit = sc.next();
        char premiereLettreDuChoix = choixDuCircuit.toUpperCase().charAt(0);

        if (premiereLettreDuChoix == 'P'){
            circuit = new CircuitParallele();

            System.out.println("Bonjour utilisateur");
            System.out.println("Veuillez écrire la tension");

            circuit.tension = sc.nextDouble();


            System.out.println("Vous devez choisir parmis les caratèere suivant et en écrire 4 ou 5");
            System.out.println("Les caractere sont les suivant : NBROJVbMLoA");
            String choixCouleur = sc.next();

            String[] choixCouleurs = choixCouleur.split(",");

            for (int i=0; i < choixCouleurs.length; i++) {
                resistor = FabriqueResistor.fabriqueResistor(choixCouleurs[i]);
                circuit.ajouterResistor(resistor);
            }

            System.out.println(circuit.toString());

        }else if (premiereLettreDuChoix == 'S'){
            circuit = new CircuitSerie();


            System.out.println("Bonjour utilisateur");
            System.out.println("Veuillez écrire la tension");

            circuit.mettreSousTension(sc.nextDouble());

            System.out.println("Veuillez entrer vos chaine de caractère afin de crée votre résistor");
            System.out.println("Veuillez séparer chaque résistor par une virgule");
            System.out.println("Vous devez choisir parmis les caratèere suivant et en écrire 4 ou 5");
            System.out.println("Les caractere sont les suivant : NBROJVbMLoA");
            String choixCouleur = sc.next();

            String[] choixCouleurs = choixCouleur.split(",");

            for (int i=0; i < choixCouleurs.length; i++) {
                resistor = FabriqueResistor.fabriqueResistor(choixCouleurs[i]);
                circuit.ajouterResistor(resistor);
            }

            System.out.println(circuit.toString());

        }*/


    }
}
