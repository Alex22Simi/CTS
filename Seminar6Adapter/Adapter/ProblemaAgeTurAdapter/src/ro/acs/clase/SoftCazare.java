package ro.acs.clase;

public class SoftCazare implements IOferta{
    private String hotel;

    public SoftCazare(String hotel) {
        this.hotel = hotel;
    }

    public String getHotel() {
        return hotel;
    }


    @Override
    public void rezerva() {
        System.out.println("Rezervare la hotelul: " + hotel);
    }
}
