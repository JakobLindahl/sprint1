package sprint1;

import javax.swing.*;

public class Orm extends Djur {

    Orm(int vikt, String namn) {
        super(vikt, namn);
    }

    @Override
    public void printMåltid() {
        JOptionPane.showMessageDialog(null, getNamn() + " ska ha " + 20 + "g ormpellets");
    }
}
