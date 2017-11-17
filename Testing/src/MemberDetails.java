import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "Member_Details")
@DynamicUpdate
public class MemberDetails {

	@Id
	@GeneratedValue(generator = "gen")
	@GenericGenerator(name = "gen", strategy = "foreign", parameters = {
			@Parameter(name = "property", value = "member") })
	@Column(name = "app_no")
	int Appno;

	@Column(name = "qualification")
	String qualification;

	@Column(name = "occupation")
	String occupation;

	@Column(name = "maritalstatus")
	Boolean maritalStatus;

	@Column(name = "noOfChildrens")
	int noc;

	@Column(name = "vemanaVani")
	boolean VemanaVani;

	@OneToOne
	@PrimaryKeyJoinColumn
	Member member = new Member();

	public Boolean getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(Boolean maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public int getNoc() {
		return noc;
	}

	public void setNoc(int noc) {
		this.noc = noc;
	}

	public boolean isVemanaVani() {
		return VemanaVani;
	}

	public void setVemanaVani(boolean vemanaVani) {
		VemanaVani = vemanaVani;
	}

	public int getAppno() {
		return Appno;
	}

	public void setAppno(int appno) {
		Appno = appno;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

}
