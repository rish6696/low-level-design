package com.example.student;

public class StudentBuilder {
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


    public StudentBuilder setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }

    public StudentBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public StudentBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public StudentBuilder setDepartment(String department) {
        this.department = department;
        return this;
    }

    public StudentBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public StudentBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public StudentBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public StudentBuilder setSection(String section) {
        this.section = section;
        return this;
    }

    public StudentBuilder setStd(int std) {
        this.std = std;
        return this;
    }


    public StudentBuilder setFeesPaid(boolean feesPaid) {
        isFeesPaid = feesPaid;
        return this;
    }

    public StudentBuilder setHosteler(boolean hosteler) {
        isHosteler = hosteler;
        return this;
    }

    public StudentBuilder setTransportFacility(boolean transportFacility) {
        isTransportFacility = transportFacility;
        return this;
    }

    public StudentBuilder setLibraryFacility(boolean libraryFacility) {
        isLibraryFacility = libraryFacility;
        return this;
    }

    public StudentBuilder setCanteenFacility(boolean canteenFacility) {
        isCanteenFacility = canteenFacility;
        return this;
    }

    public StudentBuilder setSportsFacility(boolean sportsFacility) {
        isSportsFacility = sportsFacility;
        return this;
    }

    public StudentBuilder setGymFacility(boolean gymFacility) {
        isGymFacility = gymFacility;
        return this;
    }

    public StudentBuilder setMedicalFacility(boolean medicalFacility) {
        isMedicalFacility = medicalFacility;
        return this;
    }

    public StudentBuilder setPlacementFacility(boolean placementFacility) {
        isPlacementFacility = placementFacility;
        return this;
    }

    public StudentBuilder setScholarshipFacility(boolean scholarshipFacility) {
        isScholarshipFacility = scholarshipFacility;
        return this;
    }

    public StudentBuilder setLoanFacility(boolean loanFacility) {
        isLoanFacility = loanFacility;
        return this;
    }

    public StudentBuilder setInsuranceFacility(boolean insuranceFacility) {
        isInsuranceFacility = insuranceFacility;
        return this;
    }

    public StudentBuilder setMessFacility(boolean messFacility) {
        isMessFacility = messFacility;
        return this;
    }

    public StudentBuilder setWifiFacility(boolean wifiFacility) {
        isWifiFacility = wifiFacility;
        return this;
    }

    public Student build() {
        return new Student(this);
    }
    
}
