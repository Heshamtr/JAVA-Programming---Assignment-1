public class Software
{
  private String name;		// software name
  private double version;	// current version of software
  private boolean active;	// is it active or not 

    Software (String software_name, double software_version,
	      boolean software_active)
  {				// class constructor to set data while creating object
    name = new String (software_name);
    version = software_version;
    active = software_active;

  }
  Software (String software_name, double software_version)
  {				// overload constructor to create object without setting software activation
    name = new String (software_name);
    version = software_version;
    active = false;

  }

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
}
