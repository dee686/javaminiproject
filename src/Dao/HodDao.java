package Dao;

import Bean.Complain;
import Bean.Engineer;
import Bean.Hod;
import Exception.HodException;

import java.util.List;

public interface HodDao {
    public Hod HodLogin(String Email, String pass);
    public String EngineerRegister(int id, String name, String email, String pass, String cat)throws HodException;
    public List<Engineer> EngineerList()throws HodException;
    public String EngDelete(String name);
    public List<Complain> ViewComplain()throws HodException;
    public String AssignProblem(int cId,int engId);

}
