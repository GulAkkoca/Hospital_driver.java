/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospital_driver;

/**
 *
 * @author Gül
 */
public class Doctors {

    private String doctorname;// the name of the doctor
    private int doctorID;//a unique identifier for each doctor 
    private String speacilazition;// the specialized area of the doctor
    private Patients[] patients;//the array of all patient objects 
    private int noOfPatient;//the number of patients currently assigned to the doctor
    private boolean isAvaible;//the boolean variable which is false if any 4 patients  assigned to the doctor. 
// default constructor

    public Doctors() {

    }
// Constructor initializing object

    public Doctors(String doctorname, int doctorID, String speacilazition, int noOfPatient) {
        this.doctorname = doctorname;
        this.doctorID = doctorID;
        this.speacilazition = speacilazition;
        this.patients = new Patients[4];
        this.noOfPatient = 0;
        this.isAvaible = true;

    }
// copy constructor

    public Doctors(Doctors d) {
        this.doctorname = d.doctorname;
        this.doctorID = d.doctorID;
        this.speacilazition = d.speacilazition;
        this.noOfPatient = d.noOfPatient;
        this.isAvaible = d.isAvaible;
    }
// accessors and mutators methods

    public String getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public String getSpeacilazition() {
        return speacilazition;
    }

    public void setSpeacilazition(String speacilazition) {
        this.speacilazition = speacilazition;
    }

    public int getNoOfPatient() {
        return noOfPatient;
    }

    public void setNoOfPatient(int noOfPatient) {
        this.noOfPatient = noOfPatient;
    }

    public void setPatients(Patients[] patients) {
        this.patients = patients;
    }

    public Patients[] getPatient() {
        return patients;
    }

// assigns a patient to the doctor 
    public void assingPatient(Patients p) {

        if (noOfPatient < 4) { // if currently assigned patient less than 4
            isAvaible = true;// its okay
            patients[noOfPatient] =  new Patients(p);
            noOfPatient++;//  patient reffered to doctor
            System.out.println( p.getPatientID()+"  this patients was reffered to doctor by system" );
        } else {

            isAvaible = false;
            System.out.println(" sorry we cannot assign patient: " + p.getPatientID());

        }

    }

// String method( print method)
    @Override
    public String toString() {
        return """
               Doctor{
               ==> doctorname=""" + doctorname + "\n" + "=>  doctorID=" + doctorID + "\n" + "=>  speacilazition=" + speacilazition + "\n" + "=>  noOfPatient=" + noOfPatient + "\n" + "=>  isAvaible=" + isAvaible + '}';
    }

}
