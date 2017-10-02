package sprint1;

abstract class Djur implements IDjurVikt {

    private double vikt;
    private String namn;

    public Djur(double vikt, String namn) {
        this.vikt = vikt;
        this.namn = namn;
    }

    @Override
    public double getVikt() {
        return vikt;
    }

    @Override
    public String getNamn() {
        return namn;
    }
}
