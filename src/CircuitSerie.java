public class CircuitSerie extends Circuit {

    private int x = 0;
    private int y;
    private double valeurFinal = 0;
    private double valeurDeLaResistance = 0;
    private double courant;


    public double calculerResistance() {
        for (int i = 0; i< emplacementDuTableau; i ++){
            valeurDeLaResistance += (tableauResistor[i].getResistance());
        }

       return valeurDeLaResistance;
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
