

public class User {
  String name;
  String login() {
    return "LoggedIn";
  }
  String register() {
    if (password.equals("") || username.equals("")) {
      return "Can't be empty";
    } else {
      return("Login successful");
    }
  }
    String logout() {
      return "Logged out successfully";
  }
 
}
public class Admin extends User {
  String StaffNo;
  String UploadResult(String matric, float score) {
    return "result uploaded"
  }
}
public class Student extends User {
  String MatricNo;
  String AdmissionNo;
  String RegisterCourses(String course, String courseCode) {
    return "course has been registered"
  }
  String CheckResult(String course, double GPA) {
    return "result is ready"
   
  }
}

