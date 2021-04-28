package com.AlexNester.blog.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title, annons, blogtext;
	private int views;
	
	public Post() {	
	}
	public Post(String title, String annons, String blogtext) {
		this.title = title;
		this.annons = annons;
		this.blogtext = blogtext;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAnnons() {
		return annons;
	}
	public void setAnnons(String annons) {
		this.annons = annons;
	}
	public String getBlogtext() {
		return blogtext;
	}
	public void setBlogtext(String fulltext) {
		this.blogtext = fulltext;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	
	
	
}
