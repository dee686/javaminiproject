package UsedCases.HOD;
import Application.SelectOption;
import Exception.HodException;
import Bean.Engineer;
import Dao.HodDao;
import Dao.HodDaoImpl;

import java.sql.SQLException;
import java.util.List;

public class EngineersViewCases {

    public static void main(String[] args) {

        System.out.println("List of all Engineers");

        HodDao dao=new HodDaoImpl();

        try {
            List<Engineer> engineers=dao.EngineerList();
            engineers.forEach(e -> System.out.println(e));

        }catch (HodException e) {
            System.out.println(e.getMessage());
        }finally {
            SelectOption.hodSelectOption();
        }

    }
}
