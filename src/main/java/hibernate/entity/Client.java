package hibernate.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
@Entity
public class Client {

	@Id
	@Column(name = "client_id")
	private long id;
	
	@OneToMany(mappedBy = "owner")
	private List<Address> address;
	
	@OneToMany
	@JoinTable
	  (name="CLIE_PHONE",
	   joinColumns={@JoinColumn(name = "client_id",referencedColumnName = "client_id")},
	   inverseJoinColumns = { @JoinColumn(name = "phone_id",referencedColumnName = "phone_id", unique = true) }
			 )
	private List<Phone> phones;
	
	@Column(name = "firstname")
	private String firstName;
	@Column(name = "lastname")
	private String lastName;
	@Column(name = "salary")
	private String salary;
	@Column(name = "manager_id")
	private String managerId;

}
