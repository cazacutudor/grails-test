package helloworld

import grails.converters.JSON
import grails.converters.XML

class BookController {

    def index() {
        def books = Book.all
        render books
    }

    def create() {

    }

    def save(Book book) {
        if(book.hasErrors()) {
            respond book.errors, view:'create'
        }
    }

    def show(Book book) {
        render book
    }

    def edit() {

    }

    def update(Book book) {
        if(book == null) {
            render status: NOT_FOUND
        }

    }

    def delete() {

    }
}
