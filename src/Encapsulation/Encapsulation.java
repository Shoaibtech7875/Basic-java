package Encapsulation;

public class Encapsulation {
	
 private long Account_no;
 private String holder_name;
 private String email; 
 private String Address;
public long getAccount_no() {
	return Account_no;
}
public void setAccount_no(Long account_no) {
	Account_no = account_no;
}
public String getHolder_name() {
	return holder_name;
}
public void setHolder_name(String holder_name) {
	this.holder_name = holder_name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
 
}
