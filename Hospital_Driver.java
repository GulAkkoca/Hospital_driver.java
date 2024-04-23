/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospital_driver;

/**
 *
 * @author Gül
 */
public class Hospital_Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Hospital hspt = new Hospital(" Lifeguard hospital", 0, 0);

        Doctors d1 = new Doctors("eylul", 1234, " cardilogy", 0);
        Doctors d2 = new Doctors("Tom", 22334, "dietiest", 0);
        Doctors d3 = new Doctors("hailey", 14567, "dentiest", 0);

        Patients p1 = new Patients("ali", 2345456, " 10.03.2024", d1);
        Patients p2 = new Patients("jerry", 53089567, " 11.03.2024", d2);
        Patients p3 = new Patients("Susan", 4356786, " 12.03.2024", d2);
        Patients p4 = new Patients("Ceren", 7898765, "13.03.2024", d3);
        Patients p5 = new Patients("Alex", 2345778, " 14.03.2024", d1);
        Patients p8 = new Patients("Gloria", 2356345, "18.03.2024", d3);
        Patients p9 = new Patients("Jay", 2356346, " 16.03.2024", d3);
        Patients p10 = new Patients("Phil", 2356347, " 16.03.2024", d3);
        Patients p11 = new Patients("Clarie", 2356348, " 12.03.2024", d3);
        Patients p12 = new Patients("Cam", 2356349, "21.03.2024", d2);
        
        
        hspt.addPatient(p1);
        hspt.addPatient(p2);
        hspt.addPatient(p3);
        hspt.addPatient(p4);
        hspt.addPatient(p5);
        hspt.addPatient(p8);
        hspt.addPatient(p9);
        hspt.addPatient(p10);
        hspt.addPatient(p11);
        hspt.addPatient(p12);
        hspt.addDoctors(d1);
        hspt.addDoctors(d2);
        hspt.addDoctors(d3);

        System.out.println();

        System.out.println();
       
        d1.assingPatient(p1);
        d1.assingPatient(p5);
        d2.assingPatient(p2);
        d2.assingPatient(p3);
        d3.assingPatient(p4);
        d3.assingPatient(p9);
        d3.assingPatient(p8);
        d3.assingPatient(p10);
        d3.assingPatient(p11);
        d2.assingPatient(p12);
        System.out.println(hspt);
        System.out.println();
        System.out.println("Looking for Patient by name and its name is...");
        System.out.println();
        Patients p6 = hspt.findPatient(2345456);
        if (p6 == null) {
            System.out.println("Patient not found");
        } else {
            System.out.print(" The patient id is: " + p6.getPatientID());
        }
        System.out.println();
        System.out.println("Looking for Doctor by id and its id is...");
        Doctors d5 = hspt.findDoctors(1234);
        if (d5 == null) {
            System.out.println(" Doctor not found");
        } else {
            System.out.print(" The doctor id is: " + d5.getDoctorID());
        }

        System.out.println();

        hspt.removePatient(p1);
        hspt.removePatient(p5);
  System.out.println();

        System.out.println(hspt);
    }

}
