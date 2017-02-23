package helloworld

import grails.rest.*

@Resource(uri='/persons')
class Person {
    String name

    static constraints = {
        name blank: false
    }
}
