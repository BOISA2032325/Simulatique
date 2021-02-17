import java.util.Scanner;

public class Main {

    //Je n'ai pas reussie a mettre dans le package parce que mon to string est publique et
    //je sait pas comment le changer.


    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        Resistor resistor;
        AbstarctCircuit circuit = new AbstarctCircuit();
        CircuitParallele circuitEnParallele = new CircuitParallele();


        System.out.println("Maintenant veuillez choisir le type de ciruit");
        System.out.println("Les choix sont en parallèle ou en série");


        String choixDuCircuit = sc.next();
        char premiereLettreDuChoix = choixDuCircuit.toUpperCase().charAt(0);

        if (premiereLettreDuChoix == 'P'){
            CircuitParallele parallele = new CircuitParallele();

            System.out.println("Bonjour utilisateur");
            System.out.println("Veuillez écrire la tension");

            circuit.tension = sc.nextDouble();

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

            parallele.calculerResistance();
            parallele.calculerCourrant();
            System.out.println(parallele.toString());

        }else if (premiereLettreDuChoix == 'S'){
            CircuitSerie serie = new CircuitSerie();


            System.out.println("Bonjour utilisateur");
            System.out.println("Veuillez écrire la tension");

            circuit.tension = sc.nextDouble();

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

            serie.calculerResistance();
            serie.calculerCourrant();

            System.out.println(serie.toString());

        }


    }
}
