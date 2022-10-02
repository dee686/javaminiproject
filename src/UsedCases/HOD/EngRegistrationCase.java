package UsedCases.HOD;

import Bean.Engineer;
import Dao.HodDao;
import Dao.HodDaoImpl;
import Exception.HodException;
import java.util.Scanner;

public class EngRegistrationCase {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter New Engineer Id");
        int id= sc.nextInt();

        System.out.println("Enter New Engineer Name");
        String name=sc.next();

        System.out.println("Enter New Engineer Email ");
        String email=sc.next();

        System.out.println("Enter New Password ");
        String pass=sc.next();

        System.out.println("Enter Category");
        String cat=sc.next();

        HodDao dao=new HodDaoImpl();

        try {
           String m=dao.EngineerRegister(id,name,email,pass,cat);
            System.out.println(m);
        } catch (HodException e) {
            System.out.println(e.getMessage());
        }

    }
}
