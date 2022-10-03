package Application;

import Dao.HodDao;
import Dao.HodDaoImpl;
import UsedCases.Employee.*;
import UsedCases.Engineer.ComplainViewCase;
import UsedCases.Engineer.EngLoginCase;
import UsedCases.Engineer.PasswordChangedCase;
import UsedCases.Engineer.UpdateStatusCase;
import UsedCases.HOD.*;

import java.util.Scanner;

public class SelectOption {

    public static void selectOption(){
        System.out.println("Please Select Option To Continue");

        Scanner sc=new Scanner(System.in);

        System.out.println("Select 1 for Hod Login");
        System.out.println("Select 2 for Engineer Login");
        System.out.println("Select 3 For Employee Login");
        System.out.println("Select 4 to register new Employee");

        int choice=sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Hod Login Page");
                HodLoginCase.main(null);
                break;
            case 2:
                System.out.println("Engineer Login");
                EngLoginCase.main(null);
                break;
            case 3:
                System.out.println("Employee Login");
                EmployeeLoginCase.main(null);
                break;
            case 4:
                System.out.println("New Registration");
                EmployeeRegisteredCase.main(null);
                break;
        }
    }
    public static void hodSelectOption(){
        System.out.println("Please Select Option To Continue");

        Scanner sc=new Scanner(System.in);
        System.out.println("Select 1 to Assign Problem");
        System.out.println("Select 2 for register a new engineer");
        System.out.println("select 3 for view complain");
        System.out.println("select 4 for delete engineer");
        System.out.println("select 5 for view Engineer");
        System.out.println("select 6 to exit from hod login");

        int choice=sc.nextInt();

        switch (choice){
            case 1:
                AssignProblemCase.main(null);
                break;
            case 2:
                EngRegistrationCase.main(null);
                break;
            case 3:
                ViewHODComplainCase.main(null);
            case 4:
                EngineerDeleteCase.main(null);
            case 5:
                EngineersViewCases.main(null);
            case 6:
                selectOption();
                break;
        }
    }
    public static void EngSelectOption(){

        System.out.println("Please Select Option To Continue");

        Scanner sc=new Scanner(System.in);
        System.out.println("Select 1 to view complain");
        System.out.println("Select 2 for updating the case");
        System.out.println("select 3 for change password");
        System.out.println("select 4 to see all problem assigned to him");

        System.out.println("select 5 to exit from engineer login");

        int choice=sc.nextInt();

        switch (choice) {
            case 1:
                ComplainViewCase.main(null);
                break;
            case 2:
                UpdateStatusCase.main(null);
                break;
            case 3:
                PasswordChangedCase.main(null);
            case 4:
                ComplainViewCase.main(null);
                break;
            case 5:
                selectOption();
                break;
        }
    }
    public static void EmployeeSelectOption(){
        System.out.println("Please Select Option To Continue");

        Scanner sc=new Scanner(System.in);
        System.out.println("Select 1 to register new complain");
        System.out.println("Select 2 status of complain");
        System.out.println("select 3 for view list of complain");
        System.out.println("select 4 change password");

        System.out.println("select 5 to exit from hod login");

        int choice=sc.nextInt();

        switch (choice){
            case 1:
                ComplainRegistrationCase.main(null);
                break;
            case 2:
                ViewComplainCase.main(null);
                break;
            case 3:
               ComplainListCase.main(null);
            case 4:
                EmployeePasswordChangeCase.main(null);

            case 5:
                selectOption();
                break;
        }
    }
}
