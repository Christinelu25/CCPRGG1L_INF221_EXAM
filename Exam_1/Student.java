public class Student {
    // Properties

    // surname
    String surname;

    // firstname
    String firstname; 

    // middleInitial
    char middleInitial; 

    //dateOfBirth
    String dateOfBirth;

    //studentNumber
     int studentNumber;

    //studentEmailAddress
    String studentEmailAddress;
    
    //iAmAwesome
    boolean iAmAwesome;

    public void sayMyStudentNumber() {
       System.out.println("student Number:"+ studentNumber);
    }
       public void studentEmailAddress() {
        System.out.println("Email Address:"+ studentEmailAddress);  
    }

    public void iAmAwesome() {
        System.out.println("iAm Awesome:"+ iAmAwesome );  
    }



}