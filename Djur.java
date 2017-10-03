package sprint1;

abstract class Djur implements IDjur {
    //inkapsling av vikt, går ej att se utanför superklass och subklasserna
    private double vikt;
    private String namn; //namnet går ej att ändra men går att se med getnamn

    Djur(double vikt, String namn) {
        setVikt(vikt);
        setNamn(namn);
    }
    //går bara att nås via konstruktorn då klassen är abstract
    private void setVikt(double vikt) {
        this.vikt = vikt;
    }

    private void setNamn(String namn) {
        this.namn = namn;
    }
    //dynamisk bindning då ifall metoden ej hittas
    //i en subklass hittas den i superklassen här
    @Override
    public void måltid() {
        System.out.println("Finns ingen måltid för det här djuret");
    }
    //protected för att metoden inte ska kunna ses utanför superklassen och sub klasserna
    protected double getVikt() {
        return vikt;
    }
    //dynamisk bindning då metoden ej finns i subklasserna och metoden hittas här
    @Override
    public String getNamn() {
        return namn;
    }
    //alla djur måste ha en portion!
    protected abstract double portion();
}
