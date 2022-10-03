package UsedCases.HOD;
import Application.SelectOption;
import Exception.EngineerComplainException;
import Bean.EngineerComplainDTO;
import Dao.EngineerDao;
import Dao.EngineerDaoImpl;

import java.util.List;
import java.util.Scanner;

public class ViewHODComplainCase {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Engineer Id");

        int id= sc.nextInt();



        EngineerDao dao=new EngineerDaoImpl();

        try {
            List<EngineerComplainDTO> complains= dao.ViewProblem(id);

            complains.forEach(c -> System.out.println(c));
        }catch (EngineerComplainException e) {
            System.out.println(e.getMessage());
        }finally {
            SelectOption.hodSelectOption();
        }


    }
}
