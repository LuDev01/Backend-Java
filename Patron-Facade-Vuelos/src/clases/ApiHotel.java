package clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApiHotel {
    private List<Hotel> hoteles;
    public List<Hotel> HotelPorCiudad(String ciudad ){
        hoteles.forEach(hotel -> hotel.getCiudad().equals(ciudad) );


    }

    public ApiHotel() {
        this.hoteles = new ArrayList<>();
        Hotel hotel1= new Hotel("2025-05-19","2025-05-25","Villa del Mar");
        Hotel hotel2= new Hotel("2025-05-19","2025-05-30","Toliman");
        Hotel hotel3= new Hotel("2025-05-19","2025-05-28","Villadeleyva");
        Hotel hotel4= new Hotel("2025-05-20","2025-08-25","Villa del Mar");

        this.hoteles.add(hotel1);
        this.hoteles.add(hotel2);
        this.hoteles.add(hotel3);
        this.hoteles.add(hotel4);
    }
}
