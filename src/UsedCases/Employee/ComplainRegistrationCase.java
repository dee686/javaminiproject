package UsedCases.Employee;

import Application.SelectOption;
import Bean.Complain;
import Dao.EmployeeDao;
import Dao.EmployeeDaoImpl;

import java.util.Scanner;

public class ComplainRegistrationCase {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Complainer Name");
        String cname= sc.next();
        System.out.println("Enter Category of Complain");
        String c=sc.next();

        EmployeeDao dao=new EmployeeDaoImpl();

        String m= dao.ComplainRegistration(cname,c);
        System.out.println(m);
        SelectOption.EmployeeSelectOption();
    }
}
