package crimeManagementSystem;

public class Officers {
private int id;
private String fullname,email,password,cpassword,address,phone,gender;
int pennumber;

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getCpassword() {
	return cpassword;
}
public void setCpassword(String cpassword) {
	this.cpassword = cpassword;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFullname() {
	return fullname;
}
public void setFullname(String fullname) {
	this.fullname = fullname;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getPennumber() {
	return pennumber;
}
public void setPennumber(int pennumber) {
	this.pennumber = pennumber;
}



}
