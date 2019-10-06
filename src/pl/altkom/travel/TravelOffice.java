package pl.altkom.travel;

import java.util.*;

public class TravelOffice {
    private Set<Customer> customers;
    private Map<String,Trip> trips;


    public TravelOffice() {
        customers = new HashSet<>();
        trips = new HashMap<>();
    }

    public void addCustomer(Customer c) {
        customers.add(c);

    }
    public void addTrip(String s, Trip trip){
        trips.put(s,trip);
    }

    public boolean removeTrip(String s){
        if(trips.containsKey(s)){
            trips.remove(s);
            return true;
        } else{
            return false;
        }

    }
    public  boolean removeCustomer(Customer c){
                return customers.remove(c);
            }

    public Customer findCustomerByName(String s){
        for(Customer c:customers){
            if(c.getName().equals(s)){
                return c;
            }
        }
        return null;
    }

    public int getCustomersCount() {
        return customers.size();
    }

    public Set<Customer> getCustomers() {
        return customers;
    }

    public Map<String, Trip> getTrips() {
        return trips;
    }

    @Override
    public String toString() {
        return "TravelOffice{" +
                "customers=" + customers +
                ", customersCounter=" + getCustomersCount() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TravelOffice)) return false;
        TravelOffice that = (TravelOffice) o;
        return Objects.equals(customers, that.customers) &&
                Objects.equals(trips, that.trips);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customers, trips);
    }
}
