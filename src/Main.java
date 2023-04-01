import com.miguel.tienda.model.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        Pantalon pantalo = new Pantalon();
        Camisa camisa = new Camisa();
        Corbata corbata = new Corbata();
        tienda.setRopas(Arrays.asList(pantalo,camisa,corbata));

        for (Ropa ropa : tienda.getRopas()) {
            System.out.println(ropa.getTipo());
        }

    }
}