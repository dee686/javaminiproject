package UsedCases.Engineer;

import Dao.EngineerDao;
import Dao.EngineerDaoImpl;

import java.util.Scanner;

public class PasswordChangedCase {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Email");

        String email= sc.next();

        System.out.println("Enter the new password");

        String password= sc.next();

        EngineerDao dao=new EngineerDaoImpl();

        String message=dao.ChangePassword(email,password);

        System.out.println(message);
    }
}
