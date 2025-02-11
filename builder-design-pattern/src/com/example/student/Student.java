package com.example.student;

public class Student {
    protected int rollNumber;
    protected String firstName;
    protected String lastName;
    protected String department;
    protected String email;
    protected String address;
    protected String phone;
    protected String section;
    protected int std;
    protected boolean isFeesPaid;
    protected boolean isHosteler;
    protected boolean isTransportFacility;
    protected boolean isLibraryFacility;
    protected boolean isCanteenFacility;
    protected boolean isSportsFacility;
    protected boolean isGymFacility;
    protected boolean isMedicalFacility;
    protected boolean isPlacementFacility;
    protected boolean isScholarshipFacility;
    protected boolean isLoanFacility;
    protected boolean isInsuranceFacility;
    protected boolean isMessFacility;
    protected boolean isWifiFacility;

    public Student(StudentBuilder studentBuilder) {
        this.rollNumber = studentBuilder.rollNumber;
        this.firstName = studentBuilder.firstName;
        this.lastName = studentBuilder.lastName;
        this.department = studentBuilder.department;
        this.email = studentBuilder.email;
        this.address = studentBuilder.address;
        this.phone = studentBuilder.phone;
        this.section = studentBuilder.section;
        this.std = studentBuilder.std;
        this.isFeesPaid = studentBuilder.isFeesPaid;
        this.isHosteler = studentBuilder.isHosteler;
        this.isTransportFacility = studentBuilder.isTransportFacility;
        this.isLibraryFacility = studentBuilder.isLibraryFacility;
        this.isCanteenFacility = studentBuilder.isCanteenFacility;
        this.isSportsFacility = studentBuilder.isSportsFacility;
        this.isGymFacility = studentBuilder.isGymFacility;
        this.isMedicalFacility = studentBuilder.isMedicalFacility;
        this.isPlacementFacility = studentBuilder.isPlacementFacility;
        this.isScholarshipFacility = studentBuilder.isScholarshipFacility;
        this.isLoanFacility = studentBuilder.isLoanFacility;
        this.isInsuranceFacility = studentBuilder.isInsuranceFacility;
        this.isMessFacility = studentBuilder.isMessFacility;
        this.isWifiFacility = studentBuilder.isWifiFacility;
    }

    public String toString() {
        return String.format("""
                Roll Number: %d
                First Name: %s
                Last Name: %s
                Department: %s
                Email: %s
                Address: %s
                Phone: %s
                Section: %s
                Standard: %d
                Fees Paid: %b
                Hosteler: %b
                Transport Facility: %b
                Library Facility: %b
                Canteen Facility: %b
                Sports Facility: %b
                Gym Facility: %b
                Medical Facility: %b
                Placement Facility: %b
                Scholarship Facility: %b
                Loan Facility: %b
                Insurance Facility: %b
                Mess Facility: %b
                Wifi Facility: %b
                """, rollNumber, firstName, lastName, department, email, address, phone,
                section, std, isFeesPaid, isHosteler, isTransportFacility, isLibraryFacility,
                isCanteenFacility, isSportsFacility, isGymFacility, isMedicalFacility, isPlacementFacility,
                isScholarshipFacility, isLoanFacility, isInsuranceFacility, isMessFacility, isWifiFacility);
    }
}
