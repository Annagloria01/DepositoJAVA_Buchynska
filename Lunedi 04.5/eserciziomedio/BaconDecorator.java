package eserciziomedio;

public class BaconDecorator extends HamburgerDecorator{
    public BaconDecorator(Hamburger hamburger) {
        super(hamburger);
    }

    @Override
    public String getDescrizione() {
        return super.getDescrizione() + ", Bacon";
    }

    @Override
    public double getPrezzo() {
        return super.getPrezzo() + 0.80;
    }
}
