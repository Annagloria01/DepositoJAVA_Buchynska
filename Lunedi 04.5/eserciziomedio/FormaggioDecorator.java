package eserciziomedio;

public class FormaggioDecorator extends HamburgerDecorator {
    public FormaggioDecorator (Hamburger hamburger){
        super(hamburger);
    }

    @Override
    public String getDescrizione() {
        return super.getDescrizione() + ", Formaggio";
    }

    @Override
    public double getPrezzo() {
        return super.getPrezzo() + 0.50;
    }
}
