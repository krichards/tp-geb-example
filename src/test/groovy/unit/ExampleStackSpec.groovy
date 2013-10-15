package unit

import spock.lang.Shared
import spock.lang.Specification

class ExampleStackSpec extends Specification {

    Stack stack

    def setup() {
        stack = new Stack()
    }

    def "empty stack size"() {
        expect: stack.size() == 0
    }

    def "pop on empty stack throws exception"() {
        when: stack.pop()
        then: thrown(EmptyStackException)
    }

    def "push adds entry to which can be peeked"() {
        when:
        stack.push("elem")

        then:
        stack.size() == 1
        stack.peek() == "elem"
    }

}