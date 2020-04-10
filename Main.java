import java.util.Scanner;

public class Main
{
  private static int id = 0;
  public static void main (String[]args)
  {

    //obj1
    /* instead of this :

       Scanner scan = new Scanner (System.in);
       System.out.println ("Enter app name");
       String softwareName = scan.nextLine ();
       System.out.println ("Enter app Version");
       double softwareVersion = scan.nextDouble ();
       Software object1 = new Software (id,softwareName, softwareVersion);

       I've used createObject() function :
     */
    Software object1 = createObject (1);
    //obj2 

    Software object2 = createObject (2);

    //obj3

    Software object3 = createObject (3);
    /* error: cannot assign a value to final variable id 

       object3.setId(33);

     */

    //obj4

    final Software object4 = createObject (4);

    double temp = object1.getVersion ();
      object1.setVersion (object2.getVersion ());
      object2.setVersion (temp);

      object1.print ();
      object2.print ();
      object3.print ();
      object4.print ();

      System.out.println ("Match obj1 and obj2 :" + Match (object1, object2));
      System.out.println ("Total obj3 and obj4 :" + Total (object3, object4));

  }
  public static boolean Match (Software first_object, Software second_object)
  {
    if (first_object.getName ().equals (second_object.getName ()))
      if (first_object.getId () == second_object.getId ())
	    if (first_object.getVersion () == second_object.getVersion ())
	      if (first_object.isActive () == second_object.isActive ())
	        return true;

    return false;
  }

  public static int Total (Software first_object, Software second_object)
  {
    return first_object.getId () + second_object.getId ();
  }
  public static Software createObject (int obj_number)
  {
    Software obj;
    Scanner scan = new Scanner (System.in);
    System.out.println ("Enter app " + obj_number + " name");
    String softwareName = scan.nextLine ();
    System.out.println ("Enter app " + obj_number + " Version");
    double softwareVersion = scan.nextDouble ();
    obj = new Software (++id, softwareName, softwareVersion);
    return obj;
  }
}
