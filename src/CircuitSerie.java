public class CircuitSerie extends AbstarctCircuit {

    private int x = 0;
    private int y;
    private double valeurFinal = 0;
    private double valeurDeLaResistance;
    private double courant;


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

    public double calculerResistance() {
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
