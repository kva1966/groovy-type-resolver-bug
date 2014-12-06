package typeresolvernpebug;

import typeresolvernpebug.subpackage.Base;

public class JCausesNpe extends Base {
  public static void bar() {
    genericsArgWithProtectedKeyword(null);
  }

}
