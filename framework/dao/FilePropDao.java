package com.tis.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.tis.model.FilePropBean;

import com.tis.util.DbUtil;

public class FilePropDao {

	
	private Connection connection;


	public  String Configproperty="C:\\Users\\Thomas-Innovation\\Downloads\\simbu\\TextMiningWeb\\src\\db.properties";

	
	public String table1;
	
	

	 public static void main(String[] args){

		 FilePropDao cons= new FilePropDao();	
		 
	 
	 }
	
	
	
	
	
	public FilePropDao() {

		connection = DbUtil.getConnection();

	
		try{	
			Properties file= new Properties();
			file.load(new FileInputStream(Configproperty));
		
			table1 = file.getProperty("table1");
			System.out.println("table1 : "+table1);
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
			
		}
	
	
	
	
	}
	

	
	
	public List<FilePropBean> getAllUsers() {
		List<FilePropBean> users = new ArrayList<FilePropBean>();
		try {
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from '"+table1+"'");
			System.out.println("simbu");
			while (rs.next()) {
				FilePropBean user = new FilePropBean();
				user.setFile_id(rs.getInt("file_id"));
				user.setFile_path(rs.getString("file_path"));
				user.setFile_name(rs.getString("file_name"));
				user.setCustomer_name(rs.getString("customer_name"));
				user.setCustomer_id(rs.getString("customer_id"));
				
				user.setDocument_type(rs.getInt("document_type"));
				user.setReference_number(rs.getInt("reference_number"));
				user.setBranch_id(rs.getString("branch_id"));
				user.setDate(rs.getString("date"));
				user.setTime(rs.getString("time"));
				user.setPassword_protected(rs.getString("password_protected"));
				user.setRead_status(rs.getString("read_status"));
				user.setHighlighting_status(rs.getString("highlighting_status"));
				user.setFile_type(rs.getString("file_type"));
				user.setFile_upload_time(rs.getString("file_upload_time"));
				user.setStart_time(rs.getString("start_time"));
				user.setEnd_time(rs.getString("end_time"));
				user.setRemarks(rs.getString("remarks"));
								
				
				
				
				
				
				users.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return users;
	}

	
	

	}
	
	
	
	

