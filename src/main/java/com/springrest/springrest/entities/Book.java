package com.springrest.springrest.entities;

public class Book {
	
private long id;
private String title;
private String description;

public Book(long id, String title, String description) {
	super();
	this.id = id;
	this.title = title;
	this.description = description;
}

public Book() {
	super();
	// TODO Auto-generated constructor stub
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

@Override
public String toString() {
	return "Book [id=" + id + ", title=" + title + ", description=" + description + ", getId()=" + getId()
			+ ", getTitle()=" + getTitle() + ", getDescription()=" + getDescription() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}

}
