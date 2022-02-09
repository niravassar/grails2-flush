package grails2.flush

import org.hibernate.SessionFactory

class BookService {

    SessionFactory sessionFactory

    void run() {
        Book book1 = new Book(title: "NiravBook").save()
        Book book2 = new Book(title: "RobBook").save()
        sessionFactory.getCurrentSession().flush()
        Book book = Book.findByTitle("NiravBook")
        println book.title
    }
}
