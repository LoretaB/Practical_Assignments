package Task1;

public class Officer {
    private String name;
    private String surname;
    private int officerID;
    private String workingDistrict;
    private int crimesSolved;

    public Officer() {
    }

    public Officer(String name, String surname, int officerID, String workingDistrict, int crimesSolved) {
        this.name = name;
        this.surname = surname;
        this.officerID = officerID;
        this.workingDistrict=workingDistrict;
        this.crimesSolved=crimesSolved;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getOfficerID() {
        return officerID;
    }

    public void setOfficerID(int officerID) {
        this.officerID = officerID;
    }

    public String getWorkingDistrict() {
        return workingDistrict;
    }

    public void setWorkingDistrict(String workingDistrict) {
        this.workingDistrict = workingDistrict;
    }

    public int getCrimesSolved() {
        return crimesSolved;
    }

    public void setCrimesSolved(int crimesSolved) {
        this.crimesSolved = crimesSolved;
    }

    public String toString() {
        return "Name: " + getName() + "\nSurname: " + getSurname() + "\nOfficer ID: " + getOfficerID() + "\nWorking district: " + getWorkingDistrict() + "\nCrimes solved: " + getCrimesSolved()+"\n";
    }

    public int calculatedLevel(int crimesSolved) {
        int officeLevel=0;
        if(crimesSolved<20){
            officeLevel=1;
        } else if(crimesSolved>=20 && crimesSolved<40){
            officeLevel=2;
        } else if(crimesSolved>=40){
            officeLevel=3;
        }
        return officeLevel;
    }

}

