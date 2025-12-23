/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Category;
import utils.JdbcUtils;
import constraint.*;
import model.Product;


/**
 *
 * @author Admin
 */
public class CategoryDAO {

    public List<Category> findAll()  {
        Connection connection = JdbcUtils.getConnection();
        List<Category> list = new ArrayList<>();
        PreparedStatement preparedStatement= null;
        ResultSet resultSet = null;
        try{
            
            String sql = "SELECT * FROM category";
            preparedStatement = connection.prepareStatement(sql);
            resultSet= preparedStatement.executeQuery();
            while(resultSet.next()){
                Category category = new Category();
                category.setId(resultSet.getInt("id"));
                category.setName(resultSet.getString("name"));
                list.add(category);
            }
            System.out.println("Show successfully");
        }
        catch(SQLException e){
            System.err.println(ErrorContraint.FIND_ERROR);
        }
        finally{
            if (preparedStatement != null){
                try{
                    preparedStatement.close();
                }
                catch(SQLException e){
                    e.printStackTrace();
                }
                
            }
            if(resultSet != null){
                try {
                    resultSet.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            if(connection != null){
                JdbcUtils.close(connection);
            }
            
        }
        return list;
    }
    public void insert(Category category) {
        PreparedStatement preparedStatement= null;
        Connection connection = JdbcUtils.getConnection();
        try{
            String sql = "INSERT INTO category(name) VALUES (?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, category.getName());
            
            int result = preparedStatement.executeUpdate();
            if (result >0){
                System.out.println(SuccessfullQuery.INSERT);
            }
            
        }
        catch(SQLException e){
            System.err.println(ErrorContraint.INSERT_ERROR);
            e.printStackTrace();
        }
        finally{
            if (preparedStatement != null){
                try{
                    preparedStatement.close();
                }
                catch(SQLException e){
                    e.printStackTrace();
                }
            }
            if(connection != null){
                JdbcUtils.close(connection);
            }
        }
    }
    public void update(Category category) {
        PreparedStatement preparedStatement= null;
        Connection connection = JdbcUtils.getConnection();
        try{
            String sql = "Update category SET name = ? WHERE id = ?";
            preparedStatement = connection.prepareStatement(sql);
            
            //truyen gia tri vao ? thu 1
            preparedStatement.setString(1, category.getName());
            //truyen gia tri vao dau ? thu 2
            preparedStatement.setInt(2, category.getId());
            
            preparedStatement.executeUpdate();
            System.out.println(SuccessfullQuery.UPDATE);
            
        }
        catch(SQLException e){
            System.err.println(ErrorContraint.UPDATE_ERROR);
        }
        finally{
            if (preparedStatement != null){
                try{
                    preparedStatement.close();
                }
                catch(SQLException e){
                    e.printStackTrace();
                }
            }
            if(connection != null){
                JdbcUtils.close(connection);
            }
        }
        
    }
    public void delete(int id) {
        PreparedStatement preparedStatement= null;
        Connection connection = JdbcUtils.getConnection();

        try{
            String sql = "DELETE FROM category WHERE id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            
            int result = preparedStatement.executeUpdate();
            if(result > 0){
                System.out.println(SuccessfullQuery.DELETE);
            }
            
        }
        catch(SQLException e){
            System.err.println(ErrorContraint.DELETE_ERROR);
            e.printStackTrace();
        }
        finally{
            if (preparedStatement != null){
                try{
                    preparedStatement.close();
                }
                catch(SQLException e){
                    e.printStackTrace();
                }
            }
            if(connection != null){
                JdbcUtils.close(connection);
            }
        }
    }
    
}
