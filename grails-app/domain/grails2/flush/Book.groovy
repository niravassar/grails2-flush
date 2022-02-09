package grails2.flush

class Book {
    String id = UUID.randomUUID()
    String title

    static mapping = {
        id generator: 'assigned'
    }
}
