package Domain;
public class Place {
    private Place place;
    public Place(Place place, String address) {this.place = place; this.address = address;}
    private String address;
    public Place getPlace() {return place;}
    public void setPlace(Place place) {this.place = place;}
    public Place(String address) {this.place = place; this.address = address;}
    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}}