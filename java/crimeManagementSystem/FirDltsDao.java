package crimeManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class FirDltsDao {
	
		public static Connection getConnection(){  
		    Connection con=null;  
		    try{  
		        Class.forName("com.mysql.jdbc.Driver");  
		        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crimefinal","root","");  
		    }catch(Exception e){System.out.println(e);}  
		    return con;  
		}  

	
	public static int register(FirDtls u){    
		 int i=0;    
		  
		 StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
		 Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
		  
		SessionFactory factory = meta.getSessionFactoryBuilder().build();  
		Session session = factory.openSession();  
		Transaction t = session.beginTransaction();   
		  
		i=(Integer)session.save(u);    
		  
		t.commit();    
		session.close();    
		    
		return i;    
		   

	}
	public static List<FirDtls> getAllRecords(){  
	    List<FirDtls> list=new ArrayList<FirDtls>();  
	      
	    try{  
	        Connection con=getConnection();  
	        PreparedStatement ps=con.prepareStatement("select * from firdlts");  
	        ResultSet rs=ps.executeQuery();  
	        while(rs.next()){  
	            FirDtls fir=new FirDtls();  
	            fir.setId(rs.getInt("id"));  
	            fir.setFirregistrationnumber(rs.getInt("firregistrationnumber"));  
	            fir.setDistrict(rs.getString("district"));  
	              

	           

	            
	            list.add(fir);  
	        }  
	    }catch(Exception e){System.out.println(e);}  
	    return list;  
	}
	
	public static FirDtls getRecordById(int id){  
	    FirDtls u=null;  
	    try{  
	        Connection con=getConnection() ;
	        PreparedStatement ps=con.prepareStatement("select * from firdlts where id=?");  
	        ps.setInt(1,id);  
	        ResultSet rs=ps.executeQuery();  
	        while(rs.next()){  
	            u=new FirDtls();  
	            u.setId(rs.getInt("id"));  
	            u.setFirregistrationnumber(rs.getInt("firregistrationnumber"));  
	            u.setDateofregistration(rs.getDate("dateofregistration"));
	            u.setDistrict(rs.getString("district"));  
	           
	            
	        }  
	    }catch(Exception e){System.out.println(e);}  
	    return u;  
	}  

}
