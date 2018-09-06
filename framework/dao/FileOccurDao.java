package com.tis.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.tis.model.FileOccurrBean;
import com.tis.model.FilePropBean;

import com.tis.util.DbUtil;

public class FileOccurDao {

	
	private Connection connection;

	

	public  String Configproperty="C:\\Users\\Thomas-Innovation\\Downloads\\simbu\\TextMiningWeb\\src\\db.properties";

	
	public String table2;
	
	

	 public static void main(String[] args){

		 FileOccurDao cons= new FileOccurDao();	
		 
	 
	 }
	
	
	
	
	
	
	

	public FileOccurDao() {

		connection = DbUtil.getConnection();
	
	
		try{	
			Properties file= new Properties();
			file.load(new FileInputStream(Configproperty));
		
			table2 = file.getProperty("table2");
			System.out.println("table2 : "+table2);
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
			
		}
	
	
	
	}
	

	
	
	public List<FileOccurrBean> getAllUsers() {
		List<FileOccurrBean> users = new ArrayList<FileOccurrBean>();
		try {
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from '"+table2+"'");
			//System.out.println("simbu");
			while (rs.next()) {
				FileOccurrBean user = new FileOccurrBean();
				user.setId(rs.getInt("id"));
				user.setFile_name(rs.getString("file_name"));
			
				user.setFile_id(rs.getInt("file_id"));
			
				user.setTopic(rs.getString("topic"));
				user.setSearch_word(rs.getString("search_word"));
				user.setNo_of_occurrence_exact(rs.getInt("no_of_occurrence_exact"));
				user.setNo_of_occurrence_near(rs.getInt("no_of_occurrence_near"));
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
	
	
	
	

