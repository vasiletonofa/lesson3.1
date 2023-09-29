public class Automobil {

    public Integer anulProducerii;

    public Integer km;

    public Automobil(Integer anul, Integer kilometraj) {
        anulProducerii = anul;
        km = kilometraj;
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

}
