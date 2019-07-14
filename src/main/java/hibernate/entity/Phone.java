package hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Phone {

	@Id
	@Column(name = "phone_id")
	private long id;
	
	@Column(name = "type") 
	private String type;
	@Column(name = "area_code")
	private String areaCode;
	@Column(name = "p_number")
	private String pNumber;
}
