import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "member")
@DynamicUpdate
public class Member {
	@Id
	@GeneratedValue
	@Column(name = "app_no")
	int appNo;

	@Column(name = "membershipType")
	String Type;

	@Column(name = "member_title")
	String title;

	@Column(name = "member_name")
	String name;

	@Column(name = "member_fname")
	String fname;

	@Column(name = "member_dateofbirth")
	@Temporal(TemporalType.DATE)
	Date date;
    
	

	@Embedded//@OneToOne(mappedBy = "member",cascade = CascadeType.ALL)
	@AttributeOverrides(value = { 
			@AttributeOverride(column = @Column(name = "current_dno"), name = "dno"),
			@AttributeOverride(column = @Column(name = "current_street"), name = "street"),
			@AttributeOverride(column = @Column(name = "current_road"), name = "road"),
			@AttributeOverride(column = @Column(name = "current_city"), name = "city"),
			@AttributeOverride(column = @Column(name = "current_taluk"), name = "taluk"),
			@AttributeOverride(column = @Column(name = "current_district"), name = "district"),
			@AttributeOverride(column = @Column(name = "current_state"), name = "state"),
			@AttributeOverride(column = @Column(name = "current_pincode"), name = "pincode")
			})
	private Address currentAddress;
	
	@Embedded
	@AttributeOverrides(value = { 
			@AttributeOverride(column = @Column(name = "permanent_dno"), name = "dno"),
			@AttributeOverride(column = @Column(name = "permanent_street"), name = "street"),
			@AttributeOverride(column = @Column(name = "permanent_road"), name = "road"),
			@AttributeOverride(column = @Column(name = "permanent_city"), name = "city"),
			@AttributeOverride(column = @Column(name = "permanent_taluk"), name = "taluk"),
			@AttributeOverride(column = @Column(name = "permanent_district"), name = "district"),
			@AttributeOverride(column = @Column(name = "permanent_state"), name = "state"),
			@AttributeOverride(column = @Column(name = "permanent_pincode"), name = "pincode")
			})
	private Address permanentAddress;

	public Address getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(Address currentAddress) {
		this.currentAddress = currentAddress;
	}

	public Address getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	@OneToOne(mappedBy = "member", cascade = CascadeType.ALL)
	private MemberDetails details;
	

	@OneToOne(mappedBy = "member", cascade = CascadeType.ALL)
	private MemberPayment payment;
	

	public MemberDetails getDetails() {
		return details;
	}

	public void setDetails(MemberDetails details) {
		this.details = details;
	}

	public int getAppNo() {
		return appNo;
	}

	public void setAppNo(int appNo) {
		this.appNo = appNo;
	}

	
	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public MemberPayment getPayment() {
		return payment;
	}

	public void setPayment(MemberPayment payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "Member [appNo=" + appNo + ", Type=" + Type + ", title=" + title + ", name=" + name + ", fname=" + fname
				+ ", date=" + date + ", currentAddress=" + currentAddress + ", permanentAddress=" + permanentAddress +"]";
	}

	

	
	

}
