public interface IComposant {

    void mettreSousTension(double tension);

    double calculerTension();

    void specifierCourant(double courant);

    double calculerCourant();

    double calculerResistance();
}
