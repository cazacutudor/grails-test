import helloworld.Book
import helloworld.Person

class BootStrap {

    def init = { servletContext ->

//        Books
        new Book(name: "A book", pages: 100, postDate: new Date()).save()
        new Book(name: "A book 2", pages: 1200, postDate: new Date()).save()
        new Book(name: "A book 3", pages: 1300, postDate: new Date()).save()

//        Persons
        new Person(name: "Autor 1")
        new Person(name: "Autor 2")
        new Person(name: "Autor 3")
    }
    def destroy = {
    }
}
