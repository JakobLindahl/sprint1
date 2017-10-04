package sprint1;

abstract class Djur implements IDjur {

    //inkapsling av vikt, går ej att se utanför superklass och subklasserna
    private final double vikt;
    private final String namn; //namnet går ej att ändra men går att se med getnamn

    Djur(double vikt, String namn) {
        this.vikt = vikt;
        this.namn = namn;
    }
    protected double getVikt() {
        return vikt;
    }

    //dynamisk bindning då metoden ej finns i subklasserna och metoden hittas här
    @Override
    public String getNamn() {
        return namn;
    }
}
