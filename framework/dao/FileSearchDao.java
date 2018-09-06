package com.tis.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.tis.model.FileOccurrBean;
import com.tis.model.FileSearchBean;
import com.tis.util.DbUtil;

public class FileSearchDao {

	
	private Connection connection;

	public  String Configproperty="C:\\Users\\Thomas-Innovation\\Downloads\\simbu\\TextMiningWeb\\src\\db.properties";

	
	public String table3;
	
	 public static void main(String[] args){

		 FileSearchDao cons= new FileSearchDao();	
		 
	 
	 }
	
	public FileSearchDao()  {

		connection = DbUtil.getConnection();
	try{	
		Properties file= new Properties();
		file.load(new FileInputStream(Configproperty));
	
		table3 = file.getProperty("table3");
		System.out.println("table3 : "+table3);
	}
	catch(Exception e)
	{
		
		e.printStackTrace();
		
	}
		
	}
	

	
	
	public List<FileSearchBean> getAllUsers() {
		List<FileSearchBean> users = new ArrayList<FileSearchBean>();
		try {
			
			
			
			
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from '"+table3+"'");
			//System.out.println("simbu");
			while (rs.next()) {
				FileSearchBean user = new FileSearchBean();
				user.setId(rs.getInt("id"));
				user.setFile_name(rs.getString("file_name"));
			
				user.setFile_id(rs.getInt("file_id"));
			
				user.setTopic(rs.getString("topic"));
				user.setUser_search_word(rs.getString("user_search_word"));
				
				user.setSystem_search_word(rs.getString("system_search_word"));
				user.setMatching_word(rs.getString("matching_word"));
				user.setLine_number(rs.getInt("line_number"));
				user.setPage_number(rs.getInt("page_number"));
				user.setSynonyms(rs.getString("synonyms"));
				user.setRemoved_synonyms(rs.getString("removed_synonyms"));
				user.setNegation(rs.getString("negation"));
				user.setStart_time(rs.getString("start_time"));
				user.setEnd_time(rs.getString("end_time"));

			
				
				users.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return users;
	}

	
	

	}
	
	
	
	

