package typeresolvernpebug

abstract class SamePackageBase {
  protected static <T extends Object> void genericsArgWithProtectedKeyword(T entity) {
  }

  protected static <T extends Object> void genericsNoArgWithProtectedKeyword() {
  }

  static <T extends Object> void genericsArgsNoProtectedKeyword(T entity) {
  }

  protected static <T extends Object> void nonGenericsArgWithProtectedKeyword(Object entity) {
  }

  static <T extends Object> void nonGenericsArgNoProtectedKeyword(Object entity) {
  }
}
