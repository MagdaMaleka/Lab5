public class Tshirt {
    private TshirtSize size;
    private String manufacture;

    public Tshirt(TshirtSize size, String manufacture) {
        this.size = size;
        this.manufacture = manufacture;
    }

    public TshirtSize getSize() {
        return size;
    }

    public String getManufacture() {
        return manufacture;
    }
}
