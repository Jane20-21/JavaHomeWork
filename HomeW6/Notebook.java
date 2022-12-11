public class Notebook {

    private int articul;
    private String model;
    private int price;
    private int ram;
    private int hdd;
    private double diagonal;

    public Notebook(int articul, String model, int price, int ram, int hdd, double diagonal) {
        this.articul = articul;
        this.model = model;
        this.price = price;
        this.ram = ram;
        this.hdd = hdd;
        this.diagonal = diagonal;
    }

    public int getArticul() {
        return articul;
    }

    public void setArticul(int articul) {
        this.articul = articul;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return "Notebook [articul=" + articul + ", model=" + model + ", price=" + price + ", ram=" + ram + ", hdd="
                + hdd
                + ", diagonal=" + diagonal + "]";
    }
}
