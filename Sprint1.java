package sprint1;

import java.util.*;
import javax.swing.*;

public class Sprint1 {

    private List<IDjur> allaDjur;

    private void go() {
        boolean djuretfinns = false;
        while (!djuretfinns) {
            String val = JOptionPane.showInputDialog("vilket djur ska få mat idag?");
            if (val == null || val.equals("")) {
                System.exit(0);
            }

            for (IDjur djur : allaDjur) {
                if (djur.getNamn().equalsIgnoreCase(val)) {
                    djur.printMåltid();
                    djuretfinns = true;
                }//if c
            } //loop c
            if (!djuretfinns) {
                JOptionPane.showMessageDialog(null, "Djuret finns inte");
            }//if c
        }//while true c
    }//fråga c

    private void set() {
        Databas databas = new Databas();
        allaDjur = databas.getAllaDjur();
        go();
    }//databas c

    public static void main(String[] args) {
        Sprint1 prog = new Sprint1();
        prog.set();
    }//main c
}
