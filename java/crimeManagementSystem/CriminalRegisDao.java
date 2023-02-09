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

public class CriminalRegisDao {
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

	public static int register(CriminalRegistration u) {
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

	
	public static List<CriminalRegistration> getAllRecords() {
		List<CriminalRegistration> list = new ArrayList<CriminalRegistration>();

		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("select * from criminal");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				CriminalRegistration cri = new CriminalRegistration();
				cri.setId(rs.getInt("id"));
				cri.setPolicestationname(rs.getString("policestationname"));
				cri.setCrimetype(rs.getString("crimetype"));
				cri.setFullname(rs.getString("fullname"));
				cri.setNationality(rs.getString("nationality"));
				cri.setGender(rs.getString("gender"));
				cri.setAddress(rs.getString("address"));
				cri.setOccupation(rs.getString("occupation"));
				cri.setMostwanted(rs.getString("mostwanted"));
				cri.setFirid(rs.getInt("firid"));
				cri.setDateofcrime(rs.getDate("dateofcrime"));
				cri.setDateofbirth(rs.getDate("dateofbirth"));
				cri.setJailterm(rs.getString("jailterm"));
				cri.setCriminalimage(rs.getBlob("criminalimage"));
				
				list.add(cri);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}

	public static CriminalRegistration getRecordById(int id) {
		CriminalRegistration u = null;
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("select * from criminal where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				u = new CriminalRegistration();
				u.setId(rs.getInt("id"));
				u.setPolicestationname(rs.getString("policestationname"));
				u.setCrimetype(rs.getString("crimetype"));
				u.setFullname(rs.getString("fullname"));
				u.setNationality(rs.getString("nationality"));
				u.setGender(rs.getString("gender"));
				u.setAddress(rs.getString("address"));
				u.setOccupation(rs.getString("occupation"));
				u.setMostwanted(rs.getString("mostwanted"));
				u.setFirid(rs.getInt("firid"));
				u.setDateofcrime(rs.getDate("dateofcrime"));
				u.setDateofbirth(rs.getDate("dateofbirth"));
				u.setJailterm(rs.getString("jailterm"));
				u.setCriminalimage(rs.getBlob("criminalimage"));

			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return u;
	}

}
