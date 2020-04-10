public class Software
{
  private String name;		// software name
  private double version;	// current version of software
  private boolean active;	// is it active or not
  private final int id;		// Constant integer member for assignment 2

    Software (int software_id, String software_name, double software_version,
	      boolean software_active)
  {				// class constructor to set data while creating object
    name = new String (software_name);
    version = software_version;
    active = software_active;
    id = software_id;

  }
  Software (int software_id, String software_name, double software_version)
  {				// overload constructor to create object without setting software activation
    name = new String (software_name);
    version = software_version;
    active = false;
    id = software_id;
  }
  Software (Software object)
  {				// overload constructor to copy data from another object
    name = object.getName ();
    version = object.getVersion ();
    active = object.isActive ();
    id = object.id;
  }
  public int getId ()
  {				// funcation to get software id
    return id;
  }

/*   
    public void setId (int newId)
  {				// function to change software id
    id = newId;
  } 
  
  error: cannot assign a value to final variable id
*/
  public String getName ()
  {				// function to get software name
    return name;
  }
  public void setName (String newName)
  {				// function to change software name
    name = newName;
  }
  public double getVersion ()
  {				// function to get software version
    return version;
  }
  public void setVersion (double newVersion)
  {				// function to change software version
    version = newVersion;
  }
  public boolean isActive ()
  {				// Check if software is active or not
    return active;
  }
  public void activate ()
  {				// activate software
    active = true;
  }
  public void deactivate ()
  {				// deactivate software
    active = false;
  }
  public void print ()
  {				// print object data 
    System.out.println ("---------------------------------");
    System.out.println ("Application ID: " + id);
    System.out.println ("Application Name: " + name);
    System.out.println ("Application Version: " + version);
    System.out.println ("Application Activation: " + active);
    System.out.println ("---------------------------------");

  }
}
