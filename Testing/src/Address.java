import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/*@Entity
@Table(name = "member_address")*/
@Embeddable
public class Address {
	/*@Id
	@GeneratedValue(generator = "gen")
	@GenericGenerator(name = "gen", strategy = "foreign", parameters = {
			@Parameter(name = "property", value = "member") })
	@Column(name = "app_no")
	int appNo;*/

	@Column(name = "doorNumber")
	int dno;

	@Column(name = "street")
	String street;

	@Column(name = "road")
	String road;

	@Column(name = "taluk")
	String taluk;

	@Column(name = "district")
	String district;

	@Column(name = "city")
	String city;

	@Column(name = "state")
	String state;

	@Column(name = "pincode")
	String pincode;

	@OneToOne
	@PrimaryKeyJoinColumn
	Member member = new Member();

	/*public int getAppNo() {
		return appNo;
	}

	public void setAppNo(int appNo) {
		this.appNo = appNo;
	}*/

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getRoad() {
		return road;
	}

	public void setRoad(String road) {
		this.road = road;
	}

	public String getTaluk() {
		return taluk;
	}

	public void setTaluk(String taluk) {
		this.taluk = taluk;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	@Override
	public String toString() {
		return "Address [ dno=" + dno + ", street=" + street + ", road=" + road + ", taluk=" + taluk
				+ ", district=" + district + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}

}
