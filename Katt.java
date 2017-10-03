package sprint1;

import javax.swing.JOptionPane;

public class Katt extends Djur {

    Katt(double vikt, String namn) {
        super(vikt, namn);
    }

    public double portion() {
        return getVikt() * 1000 / 150;
    }

    @Override
    public void måltid() {
        JOptionPane.showMessageDialog(null,getNamn() + " ska ha " + (int) portion() + "g kattfoder");
    }

}
