package Bean;

public class Employee {
    public Employee(int empId, String empName, String empEmail, String empPassword) {
        EmpId = empId;
        EmpName = empName;
        EmpEmail = empEmail;
        EmpPassword = empPassword;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmpId=" + EmpId +
                ", EmpName='" + EmpName + '\'' +
                ", EmpEmail='" + EmpEmail + '\'' +
                ", EmpPassword='" + EmpPassword + '\'' +
                '}';
    }

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public String getEmpEmail() {
        return EmpEmail;
    }

    public void setEmpEmail(String empEmail) {
        EmpEmail = empEmail;
    }

    public String getEmpPassword() {
        return EmpPassword;
    }

    public void setEmpPassword(String empPassword) {
        EmpPassword = empPassword;
    }

    int EmpId;
   String EmpName;
   String EmpEmail;
   String EmpPassword;
}
