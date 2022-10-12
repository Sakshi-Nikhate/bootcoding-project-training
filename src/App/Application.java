package App;

import online.restaurant.Customer;
import online.restaurant.Vendor;

import java.lang.invoke.VolatileCallSite;

public class Application {
    public static void main(String[] args) {
        Customer sakshi = new Customer();

        sakshi.setName("sakshi");
        sakshi.setCity("Nagpur");
        sakshi.setAddress("Adharah Nagar");
        sakshi.setState("Maharashtra");
        sakshi.setEmailId("sakshinikhate@gmail.com");
        sakshi.setPhoneNumber(123654456);

        Vendor OwlNight = new Vendor();
        OwlNight.setName("OwlNight veg cafe");
        OwlNight.setAddress("Nandanwan");
        OwlNight.setCategory("veg");
        OwlNight.setRating("5.0");
        OwlNight.setCity("Nagpur");





    }
}
