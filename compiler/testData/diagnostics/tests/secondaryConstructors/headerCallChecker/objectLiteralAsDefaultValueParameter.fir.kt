// !DIAGNOSTICS: -UNUSED_PARAMETER

fun A.foobar() = 3

class A {
    fun foo() = 1
    constructor( x: Any = object {
        fun bar() = <!UNRESOLVED_REFERENCE!>foo<!>() + <!UNRESOLVED_LABEL!>this@A<!>.<!UNRESOLVED_REFERENCE!>foo<!>() +
                    <!INAPPLICABLE_CANDIDATE!>foobar<!>()
    })
}
