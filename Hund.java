package sprint1;

import javax.swing.*;

public class Hund extends Djur {
    private static final Foder MAT = Foder.HUNDFODER;
    
    Hund(double vikt, String namn) {
        super(vikt, namn);
    }

    private double portion() {
        return getVikt() * 1000 / 100;
    }

    @Override
    public void printMåltid() {
        JOptionPane.showMessageDialog(null, getNamn() + " ska ha " + (int) portion() + "g " + MAT.foder);
    }
}
