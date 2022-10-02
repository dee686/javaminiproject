package Dao;

import Bean.Complain;
import Bean.Employee;
import Bean.EngineerComplainDTO;
import com.masai.util.Dbutill;
import Exception.EmployeeComplainException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public String EmployeeRegister(int id, String name, String email, String pass) {

        String M="Not Registered";

        try (Connection conn= Dbutill.provideConnection()){

            PreparedStatement ps=conn.prepareStatement("insert into Employee values(?,?,?,?)");
            ps.setInt(1,id);
            ps.setString(2,name);
            ps.setString(3,email);
            ps.setString(4,pass);

            int x= ps.executeUpdate();

            if(x>0){
                M="Employee Registered Successfully";
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return M;
    }

    @Override
    public Employee EMPLOYEELogin(String email, String Pass) throws EmployeeComplainException{

        Employee emp=new Employee();

        try (Connection conn=Dbutill.provideConnection()){

            PreparedStatement ps=conn.prepareStatement("Select * from Employee Where EEmail=? And EPassword=? ");
            ps.setString(1,email);
            ps.setString(2,Pass);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){
                int id= rs.getInt("EId");
                String n=rs.getString("EName");
                String e=rs.getString("EEmail");
                String p=rs.getString("EPassword");

                emp=new Employee(id,n,e,p);
            }else {
                throw new EmployeeComplainException("Email or Password incorrect");
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return emp;
    }

    @Override
    public String ComplainRegistration(String CName, String cat) {

        String M="Not Registered";

        try (Connection conn=Dbutill.provideConnection()){
            PreparedStatement ps= conn.prepareStatement("insert into complain value(?,?)");
            ps.setString(1,CName);
            ps.setString(2,cat);
            int x= ps.executeUpdate();
            if(x>0){
                M="Complain Registered SuccessFully";
            }

        } catch (SQLException e) {
            M=e.getMessage();
        }
        return M;
    }

    @Override
    public EngineerComplainDTO viewComplain(int cid) throws EmployeeComplainException{

        EngineerComplainDTO complains=new EngineerComplainDTO();

        try (Connection conn=Dbutill.provideConnection()){
        PreparedStatement ps=conn.prepareStatement("Select * from EngineerComplainDto where EComplainId=?");
        ps.setInt(1,cid);
        ResultSet rs= ps.executeQuery();
        if(rs.next()){
            int id= rs.getInt("ENId");
            String n=rs.getString("ENName");
            String c= rs.getString("ENCategory");
            int Cid=rs.getInt("EComplainId");
            String s=rs.getString("ComplainStatus");
            complains =new EngineerComplainDTO(id,n,c,Cid,s);

        }else {
            throw new EmployeeComplainException("No Complain Found");
        }

        } catch (SQLException e) {
            System.out.println(e.getMessage());;
        }


        return complains;
    }

    @Override
    public List<Complain> viewComplainRegistered(String cname)throws EmployeeComplainException {
        List<Complain> complains=new ArrayList<>();

        try (Connection conn=Dbutill.provideConnection()){
            PreparedStatement ps=conn.prepareStatement("Select * from Complain Where CName=?");
            ps.setString(1,cname);
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
            int id= rs.getInt("ComplainId");
            String CName=rs.getString("CName");
            String C=rs.getString("category");

            Complain complain=new Complain(id,CName,C);
            complains.add(complain);
            }
            if(complains.size()==0){
                throw new EmployeeComplainException("No Complain Registered");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return complains;
    }

    @Override
    public String PasswordChange(String email, String pass) {

        String m="Password Not Changed";

        try (Connection conn=Dbutill.provideConnection()){

            PreparedStatement ps=conn.prepareStatement("UPDATE Employee set EPassword =? WHERE EEmail=?");

            ps.setString(1,pass);
            ps.setString(2,email);

            int x= ps.executeUpdate();

            if(x>0){
                m="Password Successfully Changed";
            }

        } catch (SQLException e) {
         m=e.getMessage();
        }


        return m;
    }
}
