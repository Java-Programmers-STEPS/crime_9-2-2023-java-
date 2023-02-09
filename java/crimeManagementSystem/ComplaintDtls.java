package crimeManagementSystem;

import java.sql.Blob;
import java.util.Date;

public class ComplaintDtls {
private int id;
private String policestationname,petitionername,gender,address,complaintdetails,occupation;
private Blob idproof;
private String phonenumber;
private Date dateofbirth,dateofcomplaint;


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPolicestationname() {
	return policestationname;
}
public void setPolicestationname(String policestationname) {
	this.policestationname = policestationname;
}
public String getPetitionername() {
	return petitionername;
}
public void setPetitionername(String petitionername) {
	this.petitionername = petitionername;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getComplaintdetails() {
	return complaintdetails;
}
public void setComplaintdetails(String complaintdetails) {
	this.complaintdetails = complaintdetails;
}
public String getOccupation() {
	return occupation;
}
public void setOccupation(String occupation) {
	this.occupation = occupation;
}
public Blob getIdproof() {
	return idproof;
}
public void setIdproof(Blob idproof) {
	this.idproof = idproof;
}


public Date getDateofbirth() {
	return dateofbirth;
}
public void setDateofbirth(Date dateofbirth) {
	this.dateofbirth = dateofbirth;
}
public Date getDateofcomplaint() {
	return dateofcomplaint;
}
public void setDateofcomplaint(Date dateofcomplaint) {
	this.dateofcomplaint = dateofcomplaint;
}
public String getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}




}
