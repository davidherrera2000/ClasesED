package ed2.Avion;

import java.util.ArrayList;

public class Pasajeros {

    ArrayList<Aviones> avion;

    public Pasajeros(){
        this.avion=new ArrayList<>();
    }

    public void agregarpasajeros(Aviones aviones){
        this.avion.add(aviones);
    }


}
