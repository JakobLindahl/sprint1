package sprint1;

import java.util.ArrayList;
import java.util.List;

public class Databas {

    private final IDjur Sixten = new Hund(5, "Sixten");
    private final IDjur Dogge = new Hund(10, "Dogge");
    private final IDjur Venus = new Katt(5, "Venus");
    private final IDjur Ove = new Katt(3, "Ove");
    private final IDjur Hypno = new Orm(1, "Hypno");

    List<IDjur> getAllaDjur() {

        List<IDjur> allDjur = new ArrayList<>();
        allDjur.add(Sixten);
        allDjur.add(Dogge);
        allDjur.add(Venus);
        allDjur.add(Ove);
        allDjur.add(Hypno);

        return allDjur;
    }
}
