/*
 * Created on 26.11.2004
 */
package com.ual.ais;

import java.util.Collection;
import java.util.Map;

import javax.faces.context.FacesContext;

/**
 * @author laliluna.de
 */
public class BookList {

	// ------------------------- Properties ---------------------------
	Collection books;

	// ------------------------- Getter and Setter --------------------
	
	/**
	 * @return collection of books
	 */
	public Collection getBooks(){
		
		SimulateDB simulateDB = new SimulateDB();
		
		/* Get the session map of the external context 
		 * Holt sich die Session auf dem Externen Context
		 */
		Map session = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		
		/* Get all books from the simulated database 
		 * Lies alle Bücher auf der simulierten Datenbank aus
		 */
		books = simulateDB.getAllBooks(session);
		
		return books;
	}
		
	/**
	 * @param books The books to set.
	 */
	public void setBooks(Collection books) {
		this.books = books;
	}	
}
