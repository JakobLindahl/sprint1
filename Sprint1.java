package sprint1;

import java.util.List;
import javax.swing.JOptionPane;

public class Sprint1 {

    List<IDjur> alladjur;

    public void fråga() {
        while (true) {
            String val = JOptionPane.showInputDialog("vilket djur ska få mat?");
            if (val == null || val.equals("")) {
                System.exit(0);
            }

            boolean djuretfinns = false;
            for (IDjur djur : alladjur) {
                if (djur.getNamn().equals(val)) {
                    djur.måltid();
                    djuretfinns = true;
                }
            }//loop c
            if (!djuretfinns) {
                System.out.println("Djuret finns inte");
            }//if c
        }//while true c
    }//fråga c

    public void databas() {
        Databas databas = new Databas();
        alladjur = databas.getAllaDjur();
        fråga();
    }//databas c
    
    public static void main(String[] args) {
        Sprint1 prog = new Sprint1();
        prog.databas();
    }//main c
}
