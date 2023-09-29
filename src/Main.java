public class Main {
    public static void main(String[] args) {

      Automobil bmw = new Automobil(2005, 111111);

      System.out.println(bmw.getAnulProducerii());
      System.out.println(bmw.getKm());


      bmw.setAnulProducerii(2008);

      System.out.println(bmw.getAnulProducerii());
      System.out.println(bmw.getKm());


      String a = "2";

      Integer v = new Integer(a);

      int x = v.intValue();

      short b = v.shortValue();

      Boolean t = new Boolean("true");

      boolean r = t.booleanValue();

    }

}
