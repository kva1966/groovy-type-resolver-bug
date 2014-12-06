package typeresolvernpebug

import groovy.transform.CompileStatic

@CompileStatic
final class NoNpe3 extends SamePackageBase {
  static void bar() {
    // either no args, or no generics.
    genericsArgsNoProtectedKeyword(null)
    genericsNoArgWithProtectedKeyword()
    nonGenericsArgWithProtectedKeyword(null)
    nonGenericsArgNoProtectedKeyword(null)
  }
}
