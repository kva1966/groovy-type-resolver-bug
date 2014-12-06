package typeresolvernpebug.subpackage

import groovy.transform.CompileStatic

@CompileStatic
abstract class Base {
  protected static <T extends Object> void genericsArgWithProtectedKeyword(T entity) {
  }

  static <T extends Object> void genericsArgsNoProtectedKeyword(T entity) {
  }

  protected static <T extends Object> void genericsNoArgWithProtectedKeyword() {
  }

  protected static void nonGenericsArgWithProtectedKeyword(Object entity) {
  }

  static void nonGenericsArgNoProtectedKeyword(Object entity) {
  }
}
