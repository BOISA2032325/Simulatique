public class CircuitSerie extends Circuit {

    private int x = 0;
    private int y;
    private double valeurFinal = 0;
    private double valeurDeLaResistance;
    private double courant;


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
