import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "Member_payment")
@DynamicUpdate
public class MemberPayment {

	@Id
	@GeneratedValue(generator = "gen")
	@GenericGenerator(name = "gen", strategy = "foreign", parameters = {
			@Parameter(name = "property", value = "member") })
	@Column(name = "app_no")
	int appNo;
	
	@Column(name = "Paid_amount")
	double feePaid;
	
	@Column(name = "ModeOfPayment")
	String Mop;
	
	@Column(name = "refNo")
	String refNo;
	
	@Column(name = "proposerNumber")
	String ProposerNo;
	
	@Column(name = "ProposerName")
	String proposerName;
	
	@Column(name = "ApplicationDate")
	@Temporal(TemporalType.DATE)
	Date ApplicationDate;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	Member member = new Member();

	public int getAppNo() {
		return appNo;
	}

	public void setAppNo(int appNo) {
		this.appNo = appNo;
	}

	public double getFeePaid() {
		return feePaid;
	}

	public void setFeePaid(double feePaid) {
		this.feePaid = feePaid;
	}

	public String getMop() {
		return Mop;
	}

	public void setMop(String mop) {
		Mop = mop;
	}

	public String getRefNo() {
		return refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public String getProposerNo() {
		return ProposerNo;
	}

	public void setProposerNo(String proposerNo) {
		ProposerNo = proposerNo;
	}

	public String getProposerName() {
		return proposerName;
	}

	public void setProposerName(String proposerName) {
		this.proposerName = proposerName;
	}

	public Date getApplicationDate() {
		return ApplicationDate;
	}

	public void setApplicationDate(Date applicationDate) {
		ApplicationDate = applicationDate;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	/*@Override
	public String toString() {
		return "MemberPayment [appNo=" + appNo + ", feePaid=" + feePaid + ", Mop=" + Mop + ", refNo=" + refNo
				+ ", ProposerNo=" + ProposerNo + ", proposerName=" + proposerName + ", ApplicationDate="
				+ ApplicationDate + ", member=" + member + "]";
	}*/
	
	
}
