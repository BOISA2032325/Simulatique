public class CircuitParallele extends AbstarctCircuit{


    private double valeurFinal;
    private double courant;


    // REB : à implémenter
    // duplication
    @Override
    public void mettreSousTension(double tension) {

    }

    @Override
    public void specifierCourant(double courant) {

    }

    @Override
    public double calculerCourant() {
        return 0;
    }

    public double calculerResistance(){

        // REB : Indentation
        double valeurDeLaResistance = 0;

       for (int i = 0; i<emplacementDuTableau; i ++){
           valeurDeLaResistance += (1/tableauResistor[i].getResistance());
       }

        return 1/valeurDeLaResistance;
    }



    // REB : il faut afficher tous les résitors
    @Override
    public String toString() {
        return "CircuitEnParallele{" +
                ", valeurDeLaResistance=" + calculerResistance() +
                ", valeurFinal=" + valeurFinal +
                ", courant=" + courant +
                '}';
    }
}
