package pl.sda.gdajava25;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class DrużynaPiłkarska {
   private String nazwaDrużyny;
   private int bramkiStracone;
   private int bramkiTrafione;
   private int meczeWygrane;
   private int meczePrzegrane;
   private int meczeZremisowane;
   private int liczbaPunktow;

}
