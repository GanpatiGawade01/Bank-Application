package bank.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account 
{	@Id
	private long Acno;
	private String Acname;
	private String AcAddress;
	private long AadharNo;
	private String PanNo;
	private long mobileNo;
	private String Gender;
	private double Balance;

	
	public long getAcno() {
		return Acno;
	}
	public void setAcno(long acno) {
		Acno = acno;
	}
	public String getAcname() {
		return Acname;
	}
	public void setAcname(String acname) {
		Acname = acname;
	}
	public String getAcAddress() {
		return AcAddress;
	}
	public void setAcAddress(String acAddress) {
		AcAddress = acAddress;
	}
	public long getAadharNo() {
		return AadharNo;
	}
	public void setAadharNo(long aadharNo) {
		AadharNo = aadharNo;
	}
	public String getPanNo() {
		return PanNo;
	}
	public void setPanNo(String panNo) {
		PanNo = panNo;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	
	

}