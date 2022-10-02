package UsedCases.Employee;

import Dao.EmployeeDao;
import Dao.EmployeeDaoImpl;

import java.util.Scanner;

public class EmployeePasswordChangeCase {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Email");
        String email= sc.next();

        System.out.println("Enter Password");
        String pass= sc.next();

        EmployeeDao dao=new EmployeeDaoImpl();

        String m= dao.PasswordChange(email,pass);
        System.out.println(m);
    }

}
