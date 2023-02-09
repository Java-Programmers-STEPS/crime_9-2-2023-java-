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

public class ComplaintDltsDao {
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crimefinal", "root", "");
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

	public static int register(ComplaintDtls u) {
		int i = 0;

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		i = (Integer) session.save(u);

		t.commit();
		session.close();

		return i;

	}

	public static List<ComplaintDtls> getAllRecords() {
		List<ComplaintDtls> list = new ArrayList<ComplaintDtls>();

		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("select * from complaintdtls");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ComplaintDtls com = new ComplaintDtls();
				com.setId(rs.getInt("id"));
				com.setPolicestationname(rs.getString("policestationname"));
				com.setPetitionername(rs.getString("petitionername"));
				com.setGender(rs.getString("gender"));
				com.setAddress(rs.getString("address"));
				com.setComplaintdetails(rs.getString("complaintdetails"));
				com.setIdproof(rs.getBlob("idproof"));
				com.setPhonenumber(rs.getString("phonenumber"));
				com.setDateofbirth(rs.getDate("dateofbirth"));
				com.setDateofcomplaint(rs.getDate("dateofcomplaint"));
				com.setOccupation(rs.getString("occupation"));
				list.add(com);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}

	public static ComplaintDtls getRecordById(int id) {
		ComplaintDtls u = null;
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("select * from complaintdtls where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				u = new ComplaintDtls();
				u.setId(rs.getInt("id"));
				u.setPolicestationname(rs.getString("policestationname"));
				u.setPetitionername(rs.getString("petitionername"));
				u.setGender(rs.getString("gender"));
				u.setAddress(rs.getString("address"));
				u.setComplaintdetails(rs.getString("complaintdetails"));
				u.setIdproof(rs.getBlob("idproof"));
				u.setPhonenumber(rs.getString("phonenumber"));
				u.setDateofbirth(rs.getDate("dateofbirth"));
				u.setDateofcomplaint(rs.getDate("dateofcomplaint"));
				u.setOccupation(rs.getString("occupation"));

			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return u;
	}

}
