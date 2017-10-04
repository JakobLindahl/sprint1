package sprint1;

import javax.swing.*;

public class Katt extends Djur {

    Katt(double vikt, String namn) {
        super(vikt, namn);
    }

    private double portion() {
        return getVikt() * 1000 / 150;
    }

    @Override
    public void printMåltid() {
        JOptionPane.showMessageDialog(null, getNamn() + " ska ha " + (int) portion() + "g kattfoder");
    }
}
