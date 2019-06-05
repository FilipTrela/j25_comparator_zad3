package pl.sda.gdajava25;

import java.util.Comparator;

public class ComparatorDrużynaPiłkarska implements Comparator<DrużynaPiłkarska> {

    public int compare(DrużynaPiłkarska o1, DrużynaPiłkarska o2) {
        int liczbaPunktow = Integer.compare(o2.getLiczbaPunktow(), o1.getLiczbaPunktow());
        switch (liczbaPunktow) {
            case 1:
                return 1;
            case -1:
                return -1;
        }
        int liczbaBramekTrafionych = Integer.compare(o2.getBramkiTrafione(), o1.getBramkiTrafione());
        switch (liczbaBramekTrafionych) {
            case 1:
                return -1;
            case -1:
                return -1;
        }
        int liczbaBramekStraconych = Integer.compare(o1.getBramkiStracone(), o2.getBramkiStracone());
        switch (liczbaBramekStraconych) {
            case 1:
                return 1;
            case -1:
                return -1;
        }
        int nazwaDrużyny = o1.getNazwaDrużyny().compareToIgnoreCase(o2.getNazwaDrużyny());
        switch (nazwaDrużyny) {
            case 1:
                return 1;
            case -1:
                return -1;
        }
        return 0;
    }
}
