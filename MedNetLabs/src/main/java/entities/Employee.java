package entities;

public class Employee {
	private int Id;
	private String uid, pwd, fname, mname, lname, gender, dob, address, city, state;
	
	public Employee()
	{
		super();
	}
	
	public Employee(String uid, String pwd, String fname, String mname, String lname, String gender, String dob,
			String address, String city, String state) {
		super();
		this.uid = uid;
		this.pwd = pwd;
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.gender = gender;
		this.dob = dob;
		this.address = address;
		this.city = city;
		this.state = state;
	}

	public Employee(int id, String uid, String pwd, String fname, String mname, String lname, String gender, String dob,
			String address, String city, String state) {
		super();
		this.Id = id;
		this.uid = uid;
		this.pwd = pwd;
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.gender = gender;
		this.dob = dob;
		this.address = address;
		this.city = city;
		this.state = state;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public int getId() {
		return Id;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", uid=" + uid + ", pwd=" + pwd + ", fname=" + fname + ", mname=" + mname
				+ ", lname=" + lname + ", gender=" + gender + ", dob=" + dob + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", getUid()=" + getUid() + ", getPwd()=" + getPwd() + ", getFname()="
				+ getFname() + ", getMname()=" + getMname() + ", getLname()=" + getLname() + ", getGender()="
				+ getGender() + ", getDob()=" + getDob() + ", getAddress()=" + getAddress() + ", getCity()=" + getCity()
				+ ", getState()=" + getState() + ", getId()=" + getId() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}
