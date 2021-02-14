// REB : Doit s'appeler CircuitSerie
public class CircuitSerie extends Circuit {

    private int x = 0;
    private int y;
    private double valeurFinal = 0;
    private double valeurDeLaResistance;
    private double courant;


    public double calculerResistance() {

       do {
           y = x++;
           valeurDeLaResistance = tableauResistor[emplacementDuTableau].getResistance();
           valeurFinal = valeurDeLaResistance + valeurFinal;
       }while (y < emplacementDuTableau);

       return valeurFinal;
    }

    public double calculerCourrant(){

        courant = tension/calculerResistance();

        return courant;

    }

    @Override
    public String toString() {
        return "CircuitEnSerie{" +
                ", valeurFinal=" + valeurFinal +
                ", valeurDeLaResistance=" + valeurDeLaResistance +
                ", courant=" + courant +
                '}';
    }
}
