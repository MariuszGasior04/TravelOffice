package pl.altkom.travel;

public abstract class Trip {
    private Date start;
    private Date end;
    private String destination;
    private double price;

    public Trip(Date start, Date end, String destination, double price) {
        this.start = start;
        this.end = end;
        this.destination = destination;
        this.price = price;
    }

    public String toString() {
        return String.format("Wycieczka do %s, od %s do %s, za %f",
                destination,
                start.toString(),
                end.toString(),
                getPrice());
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
