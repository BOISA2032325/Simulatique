public class CircuitParallele extends AbstarctCircuit {

    private int x = 0;
    private int y;
    private double valeurDeLaResistance = 0;
    private double valeurFinal;
    private double courant;

    public double calculerResistance(){

       for (int i = 0; i<emplacementDuTableau; i ++){
           valeurDeLaResistance += (1/tableauResistor[i].getResistance());
       }

        return 1/valeurDeLaResistance;
    }

    public double calculerCourrant(){

        courant = tension/calculerResistance();

        return courant;
    }

    @Override
    public String toString() {
        return "CircuitEnParallele{" +
                ", valeurDeLaResistance=" + valeurDeLaResistance +
                ", valeurFinal=" + valeurFinal +
                ", courant=" + courant +
                '}';
    }
}
