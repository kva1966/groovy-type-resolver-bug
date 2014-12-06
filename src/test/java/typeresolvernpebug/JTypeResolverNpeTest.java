package typeresolvernpebug;

import org.junit.Test;

public class JTypeResolverNpeTest {

  @Test
  public void noNpeOnCallingProtectedStaticGenericArgMethodInDifferentPackage() {
    new CausesNpe();
    // using the java subclass is fine.
    // new JavaCausesNpe(); // -- okay
  }

  @Test
  public void noNpeMiscel() {
    new NoNpe1();
    new NoNpe2();
    new NoNpe3();
  }
}
