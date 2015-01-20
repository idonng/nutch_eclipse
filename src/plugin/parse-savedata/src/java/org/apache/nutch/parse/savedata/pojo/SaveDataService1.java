package org.apache.nutch.parse.savedata.pojo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import org.apache.nutch.parse.savedata.dao.SDUtils;
import org.apache.nutch.parse.savedata.pojo.CrawlData;
import org.apache.nutch.parse.savedata.pojo.SaveDataService1;

public class SaveDataService1 {

	private static SaveDataService1 service ;
	
	public static SaveDataService1 getInstance() {
		
		if(service == null) {
			service = new SaveDataService1();
		}
		
		return service;
		
	}
	
	private SaveDataService1() {
		sdUtils = new SDUtils();
	}
	
	private SDUtils sdUtils ;
	
	/**
	 * 插入一条nutch爬取数据
	 * @param sd
	 */
	public void addData(CrawlData sd) {
		PreparedStatement  state = null,sta1=null;
		try {	
			String sql1="select * from savetest p where p.snap=?";
			sta1 = sdUtils.getConn().prepareStatement(sql1);		
		    sta1.setString(1, sd.getSnap());
		    ResultSet re=sta1.executeQuery();
		    while(!re.next())	
		    {
		    	String sql = "insert into savetest(url ,fetchtime ,title , maintext,snap,pubtime,site,infotype,browsenum,commentnum) values(?,?,?,?,?,?,?,?,?,?)" ;		
		    	state = sdUtils.getConn().prepareStatement(sql);	
		    	state.setString(1, sd.getUrl());
		    	state.setTimestamp(2, new Timestamp(sd.getFetchtime().getTime()));
		    	state.setString(3, sd.getTitle());
		    	state.setString(4, sd.getMaintext());
		    	state.setString(5, sd.getSnap());
		    	state.setTimestamp(6,new Timestamp( sd.getPubtime().getTime()));
		    	state.setString(7,sd.getSite());
		    	state.setString(8,sd.getInfotype());
		    	state.setInt(9,sd.getBrowsenum());
		    	state.setInt(10,sd.getCommentnum());
		    //	state.execute();
		    	int row=state.executeUpdate();
		    	if(row>0)
		    	{		    		
		    	System.out.println("Insert Successfully!\n");
		    	}
		    	 break;
		    }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		finally {	
			try {
				if(state != null && !state.isClosed())
				{
					state.close();
				}
				if(sta1 != null && !sta1.isClosed())
				{
					sta1.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	} 
 
	/*public void insertAll(Collection<CrawlData> list) {
		
		String sql = "insert into savedata(url ,fetchtime ,title , maintext,snap,pubtime) values(?,?,?,?,?,?)" ;
		
		PreparedStatement  state = null;
		try {
			Connection conn = sdUtils.getConn();
			conn.setAutoCommit(false);
			
			for(CrawlData sd : list) {
				
				state = conn.prepareStatement(sql);
				 
				
				state.setString(1, sd.getUrl());
				state.setString(2, sd.getFetchtime());
				state.setString(3, sd.getTitle());
				state.setString(4, sd.getMaintext());
				state.setString(5, sd.getSnap());
				state.setString(6, sd.getPubtime());
				
			
				state.execute();
			}
			 
			conn.commit();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				if(state != null && !state.isClosed())
				{
					state.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
	 */
	
}
