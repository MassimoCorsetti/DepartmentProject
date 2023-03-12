package model.infrastucture.implementation;
import model.infrastucture.Services.Department;
import model.infrastucture.Exception.DataException;
import model.infrastucture.Exception.EntityNotFoundException;
import model.infrastucture.DepartmentRepository;

import java.sql.*;

public class JDBCDepartmentRepository implements DepartmentRepository {
    private Connection con;
    public JDBCDepartmentRepository (Connection con){
        this.con = con;
    }

    @Override
    public Department addDepartment(Department department) throws DataException {
        try (
                PreparedStatement st = con.prepareStatement("ADD_DEPARTMENT_RETURNING_ID", Statement.RETURN_GENERATED_KEYS);
        ){
            st.setString(1, department.getName());
            st.setLong(2, department.getId());
            st.setInt(3, (int) department.getMaxCapacity());
            try (ResultSet key = st.getGeneratedKeys()){
                st.executeUpdate();
                key.next();
                department.setId(key.getLong(2));
            }
            return department;
        }catch (SQLException e){
            System.out.println(e.getMessage());
            throw new DataException("Ops, Department hasn't added", e);
        }
    }

    @Override
    public void deleteDepartment(Department department) throws DataException, EntityNotFoundException {
        try(
                PreparedStatement st = con.prepareStatement("Delete_Department")
        ){
            st.setLong(1,);
            int rs = st.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

  
}

