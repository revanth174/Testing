
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "kfjskl")
public class Employee {
	@Id
	int id;
	
	String sdname;
	

	public String getSdname() {
		return sdname;
	}

	public void setSdname(String sdname) {
		this.sdname = sdname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
