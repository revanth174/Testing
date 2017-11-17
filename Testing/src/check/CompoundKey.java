package check;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CompoundKey implements Serializable {

	int appno;
	int memberId;
	
	
	public int getAppno() {
		return appno;
	}
	public void setAppno(int appno) {
		this.appno = appno;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMmemberId(int memberId) {
		this.memberId = memberId;
	}
	
	
}
