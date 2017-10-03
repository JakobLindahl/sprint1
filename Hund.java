package sprint1;

import javax.swing.JOptionPane;

public class Hund extends Djur {

    Hund(double vikt, String namn) {
        super(vikt, namn);
    }

    private double portion() {
        return getVikt() * 1000 / 100;
    }

    @Override
    public void måltid() {
        JOptionPane.showMessageDialog(null, getNamn() + " ska ha " + (int) portion() + "g hundfoder");
    }
}