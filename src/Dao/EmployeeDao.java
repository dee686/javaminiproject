package Dao;

import Bean.Complain;
import Bean.Employee;
import Bean.EngineerComplainDTO;
import Exception.EmployeeComplainException;
import java.util.List;

public interface EmployeeDao {

    public String EmployeeRegister(int id,String name,String email,String pass);
    public Employee EMPLOYEELogin(String email, String Pass)throws EmployeeComplainException;
    public String ComplainRegistration(String CName,String cat);
    public EngineerComplainDTO viewComplain(int cid)throws EmployeeComplainException;
    public List<Complain> viewComplainRegistered(String cname)throws EmployeeComplainException;
    public String PasswordChange(String email,String pass);
}
