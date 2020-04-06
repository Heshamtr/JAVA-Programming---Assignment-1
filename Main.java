public class Main
{
  public static void main (String[]args)
  {

    Software word = new Software ("Word", 0.01);
      System.out.println ("----------------");
      System.out.println ("Demo Version");
      System.out.println ("----------------");
      System.out.println ("Application Name: " + word.getName ());
      System.out.println ("Application Version: " + word.getVersion ());
      System.out.println ("Application Activation: " + word.isActive ());

      word.setName ("Microsoft Word");
      word.setVersion (1.00);
      word.activate ();

      System.out.println ("----------------");
      System.out.println ("Software Release");
      System.out.println ("----------------");
      System.out.println ("Application Name: " + word.getName ());
      System.out.println ("Application Version: " + word.getVersion ());
      System.out.println ("Application Activation: " + word.isActive ());

  }
}
