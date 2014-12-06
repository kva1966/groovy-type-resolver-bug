package typeresolvernpebug

import groovy.transform.CompileStatic
import typeresolvernpebug.subpackage.Base

/**
 * Base class must be in a different package for this bug to trigger!
 *
 * Calling the method via static reference directly, e.g. Base.foo(), is fine.
 */
@CompileStatic // required to trigger the bug.
class CausesNpe extends Base {
  static void bar() {
    // Referencing the following method causes:
    //      java.lang.NullPointerException
    //      at com.sun.beans.TypeResolver.resolve(TypeResolver.java:203)
    // Removing the 'protected' keyword solves the issue. Obviously a silly thing to have
    // the keyword (my mistake there). But don't believe the repercussions should be that
    // severe.
    genericsArgWithProtectedKeyword(null /* argument irrelevant */)
  }
}
