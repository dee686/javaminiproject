package UsedCases.Employee;

import Bean.Complain;
import Dao.EmployeeDao;
import Dao.EmployeeDaoImpl;

import java.util.List;
import java.util.Scanner;
import Exception.EmployeeComplainException;
public class ComplainListCase {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Complainer Name");
        String name= sc.next();
        EmployeeDao dao=new EmployeeDaoImpl();

        try {
           List <Complain> Comp=  dao.viewComplainRegistered(name);
           Comp.forEach(C -> System.out.println(C));

        } catch (EmployeeComplainException e) {
            System.out.println(e.getMessage());;
        }
    }
}
