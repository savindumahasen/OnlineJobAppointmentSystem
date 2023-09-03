package com.Savindu.OnlineJobAppointmenWebSystem.Model;

public class Appointment {
 
    private int appointmentID;
	private String jobSeekerFirstName;
	private String jobSeekerLastName;
	private String country;
	private String  jobSeekerEmail;
	private String consultantFirstName;
	private String consultantLastName;
	private String consultantEmail;
	private String jobField;
	private String appointmentDate;
	private String appointmentTime;
	private String status;
	
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Appointment(int appointmentID,String jobSeekerFirstName, String jobSeekerLastName, String country, String jobSeekerEmail, String consultantFirstName,
		String consultantLastName,	String consultantEmail, String jobField,String appointmentDate,String appointmentTime,String status) {
		super();
		this.appointmentID=appointmentID;
		this.jobSeekerFirstName = jobSeekerFirstName;
		this.jobSeekerLastName =jobSeekerLastName;
		this.country = country;
		this.jobSeekerEmail =jobSeekerEmail;
		this.consultantFirstName = consultantFirstName;
		this.consultantLastName=consultantLastName;
		this.consultantEmail = consultantEmail;
		this.jobField = jobField;
		this.appointmentDate=appointmentDate;
		this.appointmentTime=appointmentTime;
		this.status=status;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getAppointmentID() {
		return appointmentID;
	}
	public void setAppointmentID(int appointmentID) {
		this.appointmentID = appointmentID;
	}
	public String getJobSeekerFirstName() {
		return jobSeekerFirstName;
	}
	public void setJobSeekerFirstName(String jobSeekerFirstName) {
		this.jobSeekerFirstName = jobSeekerFirstName;
	}
	public String getJobSeekerLastName() {
		return jobSeekerLastName;
	}
	public void setJobSeekerLastName(String jobSeekerLastName) {
		this.jobSeekerLastName = jobSeekerLastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getJobSeekerEmail() {
		return jobSeekerEmail;
	}
	public void setJobSeekerEmail(String jobSeekerEmail) {
		this.jobSeekerEmail = jobSeekerEmail;
	}
	public String getConsultantFirstName() {
		return consultantFirstName;
	}
	public void setConsultantFirstName(String consultantFirstName) {
		this.consultantFirstName = consultantFirstName;
	}
	public String getConsultantLastName() {
		return consultantLastName;
	}
	public void setConsultantLastName(String consultantLastName) {
		this.consultantLastName = consultantLastName;
	}
	public String getConsultantEmail() {
		return consultantEmail;
	}
	public void setConsultantEmail(String consultantEmail) {
		this.consultantEmail = consultantEmail;
	}
	public String getJobField() {
		return jobField;
	}
	public void setJobField(String jobField) {
		this.jobField = jobField;
	}
	public String getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public String getAppointmentTime() {
		return appointmentTime;
	}
	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}
	
	
	
}