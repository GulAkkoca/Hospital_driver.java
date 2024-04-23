/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital_driver;

/**
 *
 * @author Gül
 */
public class Patients {

    private String patientName;// name of the patient
    private int patientID;// ıd of the patient
    private String entryDate;// the date when the patiened was admitted to the hospital
    private Doctors doctor = new Doctors(); // the doctor assigned to the patient

    // deafult constructor
    public Patients() {

    }

    // Constructor  to initialize the patient object
    public Patients(String patientName, int patientID, String entryDate, Doctors doctor) {
        this.patientName = patientName;
        this.patientID = patientID;
        this.entryDate = entryDate;
        this.doctor = new Doctors(doctor);

    }

    // copy constructor
    public Patients(Patients p) {
        this.patientName = p.patientName;
        this.patientID = p.patientID;
        this.entryDate = p.entryDate;
        this.doctor = p.doctor;
    }
// accessors and mutators

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getEnrtyDate() {
        return entryDate;
    }

    public void setEnrtyDate(String enrtyDate) {
        this.entryDate = enrtyDate;
    }

    public Doctors getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctors doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "Patient{" + "patientName=" + patientName + ", patientID=" + patientID + ", enrtyDate=" + entryDate;//+ ", doctor=" + doctor + '}';
    }

    // this method control wheter copy variable and variable are equal or not
    public boolean equals(Patients p) {
        return ((patientName.equals(patientName) && (patientID == p.patientID) && (entryDate == p.entryDate) && doctor.equals(doctor)));
    }

}
