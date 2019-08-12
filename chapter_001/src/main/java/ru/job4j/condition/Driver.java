package ru.job4j.condition;

public class Driver {
    private char license = 'N';

    public void passExamOn(char category){
        this.license = category;
    }

    public boolean hasLicense(){
<<<<<<< HEAD
        return this.license == 'A' || this.license =='B' || this.license == 'C';
=======
        return this.license == 'A' || this.license == 'B' || this.license == 'C';
>>>>>>> 6bf10cb85f4c8c96b7c4055ac62758b100139585
    }

    public boolean canDrive(char category){
        return this.license == category;
    }
}
