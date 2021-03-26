public interface IComposant {

    void mettreSousTension(double tension);

    double calculerTension();

    void specifierCourant(double courant);

    double calculerCourant();

    double calculerResistance();

    /* Pour faire le circuit en x
    (/ONNo/ONNo/ONNo/[/BVBo/VNNo/JNNo/MBNo/]/)
     */
}
