package com.imooc.viewpager;

public class News {
private String content;
private int id;
public News(String content,int id) {
	this.content=content;
	this.id=id;
}
 public String getContent() {
	return content;
}
 public int getId() {
	return id;
}
 public void setContent(String content) {
	this.content = content;
}
 public void setId(int id) {
	this.id = id;
}
}
