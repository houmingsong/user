package user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "t_user")
public class UserEntity {

	@Id
	@Column(name = "uid", length = 32)
	@GenericGenerator(name = "useruuid", strategy = "uuid")
	@GeneratedValue(generator = "useruuid")
	private String id;

	@Column(length = 32)
	private String userName;

	@Column(length = 32)
	private String sex;

	@Column(length = 32)
	private String age;

	@Column(length = 32)
	private String province;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getprovince() {
		return province;
	}

	public void setprovince(String province) {
		this.province = province;
	}

}
