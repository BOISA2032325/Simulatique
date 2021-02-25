public class CircuitSerie extends AbstarctCircuit {

    // REB : retirez ces attributs
    private int x = 0;
    private int y;
    private double valeurFinal = 0;
    private double valeurDeLaResistance;
    private double courant;


    public double calculerResistance() {
        // initialiser valeuDeLaResistance à 0
        for (int i = 0; i< emplacementDuTableau; i ++){
            valeurDeLaResistance += (tableauResistor[i].getResistance());
        }

       return valeurDeLaResistance;
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
