package crimeManagementSystem;

import java.sql.Blob;
import java.sql.Date;

public class CriminalRegistration {
	private int id;
	private String policestationname,crimetype,fullname,nationality,gender,address,occupation,mostwanted,jailterm;
private int firid;
private Date dateofcrime,dateofbirth;
private Blob criminalimage;
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
public String getCrimetype() {
	return crimetype;
}
public void setCrimetype(String crimetype) {
	this.crimetype = crimetype;
}
public String getFullname() {
	return fullname;
}
public void setFullname(String fullname) {
	this.fullname = fullname;
}
public String getNationality() {
	return nationality;
}
public void setNationality(String nationality) {
	this.nationality = nationality;
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
public String getOccupation() {
	return occupation;
}
public void setOccupation(String occupation) {
	this.occupation = occupation;
}
public String getMostwanted() {
	return mostwanted;
}
public void setMostwanted(String mostwanted) {
	this.mostwanted = mostwanted;
}
public String getJailterm() {
	return jailterm;
}
public void setJailterm(String jailterm) {
	this.jailterm = jailterm;
}
public int getFirid() {
	return firid;
}
public void setFirid(int firid) {
	this.firid = firid;
}
public Date getDateofcrime() {
	return dateofcrime;
}
public void setDateofcrime(Date dateofcrime) {
	this.dateofcrime = dateofcrime;
}
public Date getDateofbirth() {
	return dateofbirth;
}
public void setDateofbirth(Date dateofbirth) {
	this.dateofbirth = dateofbirth;
}
public Blob getCriminalimage() {
	return criminalimage;
}
public void setCriminalimage(Blob criminalimage) {
	this.criminalimage = criminalimage;
}
	
}

