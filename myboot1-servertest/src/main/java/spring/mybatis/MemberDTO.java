package spring.mybatis;

public class MemberDTO {
	private String id;
	private String password;
	private String userName;
	private String phone;
	private String email;
	private String address;

//	다른 생성자 정의하면 기본생성자 명시해줘야 됨
	public MemberDTO() {
	}

	public MemberDTO(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}

	public MemberDTO(String id, String password, String userName, String phone, String email, String address) {
		super();
		this.id = id;
		this.password = password;
		this.userName = userName;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", password=" + password + ", userName=" + userName + ", phone=" + phone
				+ ", email=" + email + ", address=" + address + "]";
	}

}
