package hello.hellospring.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.id;

@Entity
public class Member {
	@id @GeneratedValue(strategy = GenerationType.IDENTITY)
 	private Long id;
	private String name;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
