package check;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class Service {

	public static void main(String args[]) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		
		 /* Member mem = new Member();
		  
		  mem.setName("revanth"); mem.setFname("sreenu"); mem.setTitle("MR");
		  mem.setDate(new Date());
		  
		  
		  Address ad = new Address(); ad.setDno(1); ad.setStreet("revanth");
		  ad.setRoad("1st road"); ad.setTaluk("yamuna"); ad.setCity("Bangalore");
		  ad.setDistrict("chk"); ad.setState("karnataka");
		  ad.setPincode("560060"); ad.setMember(mem);
		  
		  MemberDetails details = new MemberDetails(); details.setOccupation("farmer");
		  details.setMaritalStatus(true); details.setNoc(0);
		  details.setVemanaVani(true); details.setMember(mem);
		  details.setQualification("degree");
		  
		  
		  
		  MemberPayment payment = new MemberPayment(); payment.setFeePaid(10000);
		  payment.setRefNo("ref48943"); payment.setMop("online");
		  payment.setApplicationDate(new Date()); payment.setMember(mem);
		  
		  
		  mem.setAddress(ad); mem.setDetails(details); mem.setPayment(payment);
		*/
		
		/*check.Member mem = new check.Member();
		 mem.setAppno(123);
		 mem.setMemberId(252);
		  mem.setName("revanth"); mem.setFname("sreenu"); mem.setTitle("MR");
		  mem.setDate(new Date());
		  
		  
		  check.Address ad = new check.Address(); ad.setDno(1); ad.setStreet("revanth");
		  ad.setRoad("1st road"); ad.setTaluk("yamuna"); ad.setCity("Bangalore");
		  ad.setDistrict("chk"); ad.setState("karnataka");
		  ad.setPincode("560060"); 
		  
		  check.MemberDetails details = new check.MemberDetails(); details.setOccupation("farmer");
		  details.setMaritalStatus(true); details.setNoc(0);
		  details.setVemanaVani(true); 
		  details.setQualification("degree");
		 mem.setCurrentAddress(ad);
		 mem.setDetails(details);*/
		Session session = sessionFactory.openSession();

		Transaction t = session.beginTransaction();
		/*Member m = new Member();
		m.setName("venkat");
		Address currentAddress = new Address();
		currentAddress.setCity("bangalore");
		currentAddress.setDistrict("karnataka");
		
		session.save(m);*/
		/*Object o =session.get(Address.class, 2);
		Address a = (Address)o;
				//session.delete(m);
		 a.setCity("kadapa");
		 a.setDistrict("Kapa");
		 a.setState("AP");
	   session.update(a);*/
		//session.save(mem);
		/*
		 * session.save(ad); session.save(details);
		 */
		/*
		 * System.out.println("1: search by application number");
		 * System.out.println("2: search by pincode");
		 * System.out.println("3: search by taluk");
		 * System.out.println("4: search by district"); Scanner scan = new
		 * Scanner(System.in); int op = scan.nextInt();
		 */
		
	
		/*NativeQuery<Member> q = session.createNativeQuery("select * from member where app_no in (select app_no from member_address where taluk = 'yamuna')",Member.class);
		 
		List<Member> li = q.list();
		for(Member m : li)
		{
			System.out.println(m);
		}*/
		t.commit();
		session.close();
		sessionFactory.close();
	}

}
