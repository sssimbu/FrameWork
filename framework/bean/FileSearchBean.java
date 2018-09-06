package com.tis.model;

public class FileSearchBean {
	
	int id,file_id,line_number,page_number;
	String file_name,topic,user_search_word,system_search_word,matching_word,synonyms,removed_synonyms,negation,start_time,end_time;
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
	public int getLine_number() {
		return line_number;
	}
	public void setLine_number(int line_number) {
		this.line_number = line_number;
	}
	public int getPage_number() {
		return page_number;
	}
	public void setPage_number(int page_number) {
		this.page_number = page_number;
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
	public String getUser_search_word() {
		return user_search_word;
	}
	public void setUser_search_word(String user_search_word) {
		this.user_search_word = user_search_word;
	}
	public String getSystem_search_word() {
		return system_search_word;
	}
	public void setSystem_search_word(String system_search_word) {
		this.system_search_word = system_search_word;
	}
	public String getMatching_word() {
		return matching_word;
	}
	public void setMatching_word(String matching_word) {
		this.matching_word = matching_word;
	}
	public String getSynonyms() {
		return synonyms;
	}
	public void setSynonyms(String synonyms) {
		this.synonyms = synonyms;
	}
	public String getRemoved_synonyms() {
		return removed_synonyms;
	}
	public void setRemoved_synonyms(String removed_synonyms) {
		this.removed_synonyms = removed_synonyms;
	}
	public String getNegation() {
		return negation;
	}
	public void setNegation(String negation) {
		this.negation = negation;
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
