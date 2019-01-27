package Com.Stepdefination;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks {
Driverclass Dclass= new Driverclass();
@Before
public void OpenBrowser(){Dclass.OpenBrowser();}

@After
    public void CloseBrowser(){Dclass.CloseBrowser();}
}
