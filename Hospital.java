/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital_driver;

/**
 *
 * @author Gül
 */
public class Hospital {

    private String hospitalName;//The Hospital's name
    private int numberOfDoctor;//number of doctors currently working at the hospital 
    private int numberOfPatient;//number of patients currently admitted to the hospital
    private Doctors[] doctors;// array of doctor Object working in the hospital
    private Patients[] patients;// array of patient objects come to the hospital
    private int sizeOfDoctors = 100;// the  maximum doctor capacity of hospital
    private int sizeOfPatients = 400;//the maximum patient capacity of hospital

    /**
     * Default constructor
     */
    public Hospital() {

    }
//constructor - builds a hospital when create hospital object  the object include hospital name
// numberOfDoctor, numberOfPatient

    public Hospital(String hospitalName, int numberOfDoctor, int numberOfPatient) {
        this.hospitalName = hospitalName;
        doctors = new Doctors[sizeOfDoctors];// initializing arrays for doctors
        patients = new Patients[sizeOfPatients];//  initializing arrays for patients
        this.numberOfDoctor = numberOfDoctor;
        this.numberOfPatient = numberOfPatient;
    }
    // This method  add patient in the hospital until  
    //number currently admitted greater than size of patient

    public void addPatient(Patients p) {
        if (numberOfPatient >= sizeOfPatients) {
            System.out.println(" the hospital's patient capacity is full");
        } else {
            patients[numberOfPatient] = p;// I wrote without copied because when I write 
            // new patients(p)  method is not able to adding to copy object just it can copy original object 

        }
        numberOfPatient++;

    }
// addDoctors it has a parameter that called Doctors d
// this method add doctors in the hospital
// if number of doctor greater than size of Doctors  hospital cant add any doctor

    public void addDoctors(Doctors d) {
        if (numberOfDoctor > sizeOfDoctors) {
            System.out.println(" The Hospital's doctor capacity is full, new doctor isnt added by system.  ");
        } else {
            doctors[numberOfDoctor] = d;
        }
        numberOfDoctor++;

    }
// findPatient - given a name as an argument this method  searches patient
// the hospital system to find the name . If the patient's name is found a new 
// Patients object of that patient is created and returned , otherwise 
// null is returned

    public Patients findPatient(int id) {
        int i;
        for (i = 0; i < numberOfPatient; i++) {
            if (patients[i].getPatientID() == id) {
                return new Patients(patients[i]);
            }

        }
        return null;
    }
// findDoctors - given a id as an argument. this method searches doctors 
// the hospital system to find the name. If the doctor's id is found  a new
// doctors object of that doctors is created and returned, otherwise 
// null is returned    

    public Doctors findDoctors(int id) {
        for (int i = 0; i < numberOfDoctor; i++) {
            if (doctors[i].getDoctorID() == id) {
                return new Doctors(doctors[i]);
            }
        }

        return null;
    }

    // 
    public void removePatient(Patients p) {
        for (int i = 0; i < numberOfPatient; i++) {// itarete  through the patients array
            if (patients[i].equals(p)) { // if patient's index that I want is equal patients 's p object
                for (int j = i; j < numberOfPatient - 1; j++) { // itarete start from to patients[i] index and  contniue  until number of Patient-1
                    Patients temp; // shifting elements
                    temp = patients[i];
                    patients[j] = patients[j + 1];
                    patients[j + 1] = temp;
                }
                patients[numberOfPatient - 1] = null; // last patients index equal null because we want to remove the patient whose is healed from list
                numberOfPatient--;// until the list is =0

                break;// exit loops

            }

        }
        for (int i = 0; i < numberOfDoctor; i++) { // itarete throuhg the doctors array
            Doctors currentDoctor = doctors[i];//  current doctor being assigmented 
            Patients[] dP = currentDoctor.getPatient(); // mevcut doktorun hasta bilgilerini dP objesine alıyoruz
            for (int j = 0; j < currentDoctor.getNoOfPatient(); j++) { // doktorun hastalarının içinde sıralama yapıyoruz
                if (dP[j].equals(p)) {// seçtiğimiz doktorun hasta listesinden çıkarılacak hastayla patients'daki hasta eşitse 
                    for (int t = j; t < currentDoctor.getNoOfPatient() - 1; t++) { // doctorun hastasının indexinden başlayıp doktor hasta kapasitesi kadar döndür
                        Patients temp; // shifting elements
                        temp = dP[t];
                        dP[t] = dP[t + 1];
                        dP[t + 1] = temp;
                    }
                    dP[currentDoctor.getNoOfPatient() - 1] = null;//last patient index equal null because we want to remove the patient whose is healed from list
                    currentDoctor.setNoOfPatient(currentDoctor.getNoOfPatient() - 1);// until the list is =0
                    break;
                }

            }
        }
        System.out.println(" this patient removed: " + p);

    }
//  this method is print method  

    @Override
    public String toString() {

        return "Hospital{" + "********" + hospitalName + "********" + "\n" + "-numberOfDoctor= " + numberOfDoctor + "\n" + "-numberOfPatient= " + numberOfPatient + "\n" + "-doctors= " + doctors[0] + "\n" + "-patients= " + patients[4] + "\n" + "-sizeOfDoctors= " + sizeOfDoctors + "\n" + "-sizeOfPatients= " + sizeOfPatients + '}';

    }
}
