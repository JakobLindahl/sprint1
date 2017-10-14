package sprint1;

import javax.swing.*;

public class Orm extends Djur {
    private static final Foder MAT = Foder.ORMPELLETS;
    
    Orm(int vikt, String namn) {
        super(vikt, namn);
    }

    @Override
    public void printMåltid() {
        JOptionPane.showMessageDialog(null, getNamn() + " ska ha " + 20 + "g "+ MAT.foder);
    }
}
