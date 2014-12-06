package typeresolvernpebug

import spock.lang.Specification

class TypeResolverNpeSpec extends Specification {
  def "must not fail with c.s.b.TypeResolver NPE when calling protected static generic-arg method in different package"() {
    when:
    new CausesNpe()

    then:
    true // bug fixed.
  }

  def "must not fail with c.s.b.TypeResolver NPE miscel"() {
    when:
    new NoNpe1()
    new NoNpe2()
    new NoNpe3()

    then:
    true // no bug.
  }
}
