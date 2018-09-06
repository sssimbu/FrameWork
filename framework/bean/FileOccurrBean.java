package com.tis.model;

public class FileOccurrBean {

	
	
	int id,file_id,no_of_occurrence_exact,no_of_occurrence_near;
	String file_name,topic,search_word,start_time,end_time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFile_id() {
		return file_id;
	}
	public void setFile_id(int file_id) {
		this.file_id = file_id;
	}
	public int getNo_of_occurrence_exact() {
		return no_of_occurrence_exact;
	}
	public void setNo_of_occurrence_exact(int no_of_occurrence_exact) {
		this.no_of_occurrence_exact = no_of_occurrence_exact;
	}
	public int getNo_of_occurrence_near() {
		return no_of_occurrence_near;
	}
	public void setNo_of_occurrence_near(int no_of_occurrence_near) {
		this.no_of_occurrence_near = no_of_occurrence_near;
	}
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getSearch_word() {
		return search_word;
	}
	public void setSearch_word(String search_word) {
		this.search_word = search_word;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}

	
}
