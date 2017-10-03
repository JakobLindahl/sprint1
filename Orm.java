package sprint1;

import javax.swing.JOptionPane;

public class Orm extends Djur {
    private static final double ORMPELLETS = 20;
    
    Orm(int vikt, String namn) {
        super(vikt, namn);
    }

    private double portion() {
        return ORMPELLETS;
    }
    
    
    @Override
    public void måltid() {
        JOptionPane.showMessageDialog(null, getNamn() + " ska ha " + (int)portion() + "g ormpellets");
    }
}