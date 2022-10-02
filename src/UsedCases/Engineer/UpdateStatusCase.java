package UsedCases.Engineer;

import Bean.EngineerComplainDTO;
import Dao.EngineerDao;
import Dao.EngineerDaoImpl;
import Exception.EngineerComplainException;

import java.sql.SQLException;
import java.util.Scanner;

public class UpdateStatusCase {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Please Enter Complain Id");
        int c= sc.nextInt();

        System.out.println("Please Enter status which you want to Update");

        String update=sc.next();

        EngineerDao updation= new EngineerDaoImpl();

        String status=updation.UpdateStatus(c,update);
        System.out.println(status);


    }
}
