public class Automobil {

    public Integer anulProducerii; // null

    public int km; // 0

    String denumire;

    String descriere;


    public Automobil(Integer anul, Integer kilometraj) {
        anulProducerii = anul;
        km = kilometraj;
    }



    public Automobil(Integer anul, Integer kilometraj, String desc, String denumire) {
        anulProducerii = anul;
        km = kilometraj;
        descriere = desc;
    }

    public Automobil(Integer anul) {
        anulProducerii = anul;
    }

    public Automobil(String nume) {
        denumire = nume;
    }

    public Integer incrementByOne(Integer a) {
       return a + 1;
    }

    public void automobilasdasdas() {
        System.out.println("A fost apelata metoda!!");
    }


    public void setAnulProducerii(Integer anul) {
        anulProducerii = anul;
    }

    public int getAnulProducerii() {
        return anulProducerii;
    }

    public int getKm() {
        return km;
    }

    public void setDescriere(String desc) {
        descriere = desc;
    }

}
