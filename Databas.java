package sprint1;

import java.util.*;

public class Databas {

    private final Hund Sixten = new Hund(5, "Sixten");
    private final Hund Dogge = new Hund(10, "Dogge");
    private final Katt Venus = new Katt(5, "Venus");
    private final Katt Ove = new Katt(3, "Ove");
    private final Orm Hypno = new Orm(1, "Hypno");

    List<IDjur> getAllaDjur() {

        List<IDjur> allaDjur = new ArrayList<>();
        allaDjur.add(Sixten);
        allaDjur.add(Dogge);
        allaDjur.add(Venus);
        allaDjur.add(Ove);
        allaDjur.add(Hypno);

        return allaDjur;
    }
}
