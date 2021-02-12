public class CircuitEnParallele extends Circuit{

    private int x = 0;
    private int y;
    private double valeurDeLaResistance;
    private double valeurFinal;
    private double courant;

    public double calculerResistance(){

        do {
            y = x++;
            valeurDeLaResistance = (1/tableauResistor[emplacementDuTableau].getResistance());
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
        return "CircuitEnParallele{" +
                ", valeurDeLaResistance=" + valeurDeLaResistance +
                ", valeurFinal=" + valeurFinal +
                ", courant=" + courant +
                '}';
    }
}
