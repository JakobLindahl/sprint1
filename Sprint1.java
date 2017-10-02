package sprint1;

import java.util.List;
import javax.swing.JOptionPane;

public class Sprint1 {

    public static void main(String[] args) {
        Databas databas = new Databas();
        List<Djur> alladjur = databas.getAllaDjur();

        while (true) {

            String val = JOptionPane.showInputDialog("vilket djur ska få mat?");
            if (val == null || val.equals("")) {
                System.exit(0);
            }

            boolean djuretfinns = false;
            for (Djur djur : alladjur) {
                if (djur.getNamn().equals(val)) {
                    djur.måltid();
                    djuretfinns = true;
                }
            }
            if (!djuretfinns) {
                System.out.println("Djuret finns inte");
            }
        }
    }
}
