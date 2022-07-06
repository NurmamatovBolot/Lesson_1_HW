public class Factory {

    private String country;
    private int quantityOfVehiclesProduced;

    public Factory(String country, int quantityOfVehiclesProduced) {
        this.country = country;
        this.quantityOfVehiclesProduced = quantityOfVehiclesProduced;
    }

    public String getCountry() {
        return country;
    }

    public int getQuantityOfVehiclesProduced() {
        return quantityOfVehiclesProduced;
    }

}
