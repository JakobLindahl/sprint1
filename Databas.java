package sprint1;

import java.util.*;

public class Databas {

    private final IDjur Sixten = new Hund(5, "Sixten");
    private final IDjur Dogge = new Hund(10, "Dogge");
    private final IDjur Venus = new Katt(5, "Venus");
    private final IDjur Ove = new Katt(3, "Ove");
    private final IDjur Hypno = new Orm(1, "Hypno");

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
