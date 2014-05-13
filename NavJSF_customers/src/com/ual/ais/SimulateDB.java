/*
 * Created on 04.10.2004 by laliluna
 *
 */
package com.ual.ais;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;


/**
 * @author laliluna
 *  
 */
public class SimulateDB {

    private Collection books;

    private void init(Map session) {
        books = new ArrayList();
        Random random = new Random();
        books.add(new Book(Math.abs(random.nextLong()), "David Roos", "Struts book", true));
        books.add(new Book(Math.abs(random.nextLong()), "Micheal Jackson", "Java book", true));
        books.add(new Book(Math.abs(random.nextLong()), "Bruce Lee", "Java2 book", false));
        books.add(new Book(Math.abs(random.nextLong()), "Tom Jones" ,"EJB book", true));
        books.add(new Book(Math.abs(random.nextLong()), "Mc Donald", "Jboss for beginners", false));
        books.add(new Book(Math.abs(random.nextLong()), "Lars Mars", "Using Myeclipse for cooking", true));
        books.add(new Book(Math.abs(random.nextLong()), "Mary Jane", "EJB or spending your weekends", true));

        session.put("bookDB", books);
    }

    /**
     * load data from db;
     * @param session
     */
    private void loadData(Map session) {
        //      laliluna 04.10.2004 load books from db
        books = (Collection) session.get("bookDB");
        
        // laliluna 04.10.2004 db not yet initialized, so do it
        if (books == null)
            init(session);

    }
    
    /**
     * save data to DB ;-)
     * @param session
     */
    private void saveData(Map session) {
        session.put("bookDB", books);
    }

    public long saveToDB(Book book, Map session) {
        // laliluna 04.10.2004 load books from db
        loadData(session);

        // laliluna 04.10.2004 loop over collection and trying to find the book
        boolean bookExist = false;
        ArrayList booksNew = (ArrayList) books;
        int index = 0;
        for (Iterator iter = books.iterator(); iter.hasNext();) {
            Book element = (Book) iter.next();
            // laliluna 04.10.2004 if book is found do an update
            if (element.getId() == book.getId()) {
            	booksNew.set(index, book);
                bookExist = true;
                break;
            }
            index++;
        }
        
        books = booksNew;
        
        // laliluna 04.10.2004 if book is not found, create a new book
        if (bookExist == false) {
            Random random = new Random();
            book.setId(random.nextLong());
            books.add(book);
        }

        // laliluna 04.10.2004 save to DB ;-)
        saveData(session);

        return book.getId();
    }

    public Book loadBookById(long id, Map session) {
        // laliluna 04.10.2004 load books from db
        loadData(session);
        // laliluna 04.10.2004 loop over all books and return book if found
        for (Iterator iter = books.iterator(); iter.hasNext();) {
            Book element = (Book) iter.next();
            if (element.getId() == id) return (Book) element;
        }
        return null;
    }
    
    public void deleteBookById(long id, Map session){
    	// laliluna 04.10.2004 load books from db
        loadData(session);
        Collection booksNew = new ArrayList();
        // laliluna 04.10.2004 loop over all books and delete book if found
        for (Iterator iter = books.iterator(); iter.hasNext();) {
            Book element = (Book) iter.next();
            if (element.getId() != id){
            	booksNew.add(element);
            }
        }
        // laliluna 04.10.2004 set the new books
        books = booksNew;
        
        // laliluna 04.10.2004 save to DB ;-)
        saveData(session);
    }

    public Collection getAllBooks(Map session) {
        // laliluna 04.10.2004 load books from db
        loadData(session);
        return books;

    }
}