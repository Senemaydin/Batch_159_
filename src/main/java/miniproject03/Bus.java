package miniproject03;

import java.util.ArrayList;
import java.util.List;

public class Bus {

    //plate number, seat numbers

    public String numberPlate;

    public List<String> seats = new ArrayList<>();

    //When create a Bus object numberPlate and SeatNo should be present

    public Bus(String numberPlate){
        this.numberPlate = numberPlate;
        for (int i=1; i<32; i++){

            this.seats.add(i + ""); //String.valueOf()

        }

    }
}

