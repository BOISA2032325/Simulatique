import java.util.Scanner;

public class Main {


    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        Resistor resistor;
        Circuit circuit = new Circuit();
        CircuitEnParallele circuitEnParallele = new CircuitEnParallele();


        //Question

        System.out.println("Bonjour utilisateur");
        System.out.println("Veuillez écrire la tension");

        circuit.tension = sc.nextDouble();

        System.out.println("Veuillez entrer vos chaine de caractère afin de crée votre résistor");
        System.out.println("Veuillez séparer chaque résistor par une virgule");
        System.out.println("Vous devez choisir parmis les caratèere suivant et en écrire 4 ou 5");
        System.out.println("Les caractere sont les suivant : NBROJVbMLoA");
        String choixCouleur = sc.next();

        String[] choixCouleurs = choixCouleur.split(",");

        for (int i=0; i < choixCouleurs.length; i++){
            resistor = FabriqueResistor.fabriqueResistor(choixCouleurs[i]);
            circuit.ajouterResistor(resistor);
        }

        System.out.println("Maintenant veuillez choisir le type de ciruit");
        System.out.println("Les choix sont en parallèle ou en série");


    }
}
