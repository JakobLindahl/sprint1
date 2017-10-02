package sprint1;

import java.util.ArrayList;
import java.util.List;

public class Databas {

    private final Djur Sixten = new Hund(5, "Sixten");
    private final Djur Dogge = new Hund(10, "Dogge");
    private final Djur Venus = new Katt(5, "Venus");
    private final Djur Ove = new Katt(3, "Ove");
    private final Djur Hypno = new Orm(1, "Hypno");

    List<Djur> getAllaDjur() {

        List<Djur> allDjur = new ArrayList<>();
        allDjur.add(Sixten);
        allDjur.add(Dogge);
        allDjur.add(Venus);
        allDjur.add(Ove);
        allDjur.add(Hypno);

        return allDjur;
    }
}
