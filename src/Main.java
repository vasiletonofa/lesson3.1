
import person.Person;
import person.v2.Person2;

public class Main {
    public static void main(String[] args) {

//      Automobil mercedes = new Automobil("Mercedes");
//
//      Automobil mazda = new Automobil(2009, 30000);
//
//      Automobil bmw = new Automobil(2005, 111111);
//
//      System.out.println(bmw.getAnulProducerii());
//      System.out.println(bmw.getKm());
//
//
//      bmw.setAnulProducerii(2008);
//
//      System.out.println(bmw.getAnulProducerii());
//      System.out.println(bmw.getKm());
//
//
      String a = "120";

      Short v = new Short(a);

      Integer i = new Integer("22");

      int b = Integer.parseInt("233");


      short ll = Short.parseShort("22");

      short hh = new Short("22");

      short  e = v;

      int x = v.intValue();

      short b = v.shortValue();

      Boolean t = new Boolean( "false" );
      boolean c =  t;

      boolean o = false;

      boolean r = t.booleanValue();

      Person person = new Person();
      Person2 person2 = new Person2();

      Integer tt = new Integer(2);

      int nn = tt; // unboxing

      Integer rr = 2; // autoboxing  -> new Integer(2)

      Integer oo = nn; // autoboxing -> new Integer(nn)

      Automobil automobil = new Automobil(2010, 45000);

      System.out.println(automobil.getAnulProducerii());
      System.out.println(automobil.getKm());

      automobil.setDescriere("Automobilul este practic nou");

      System.out.println(automobil.descriere);

    }

}
