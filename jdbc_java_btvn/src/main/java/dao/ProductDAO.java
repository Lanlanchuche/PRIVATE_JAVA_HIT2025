/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import constraint.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Product;
import model.ProductDTO;
import utils.JdbcUtils;

/**
 *
 * @author Admin
 */
public class ProductDAO {
    
    public void insert(Product product){
        PreparedStatement preparedStatement = null;
        Connection connection = JdbcUtils.getConnection();
        try{
            String sql = "INSERT INTO product(name, price, category_id) VALUES (?,?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setDouble(2, product.getPrice());
            preparedStatement.setInt(3, product.getCategoryId());
            
            int result = preparedStatement.executeUpdate();
            
            if(result > 0){
                System.out.println(SuccessfullQuery.INSERT);
            }
        }
        catch(SQLException e){
            System.err.println(ErrorContraint.INSERT_ERROR);
            e.printStackTrace();
        }
        finally{
            if(preparedStatement != null){
                try{
                    preparedStatement.close();
                }
                catch(SQLException e){
                    e.printStackTrace();
                }
            }
            if (connection!=null){
                JdbcUtils.close(connection);
            }
        }
    }
    
    public List<ProductDTO> findAllWithCategoryName(){
        List<ProductDTO> list = new ArrayList<>();
        PreparedStatement preparedStatement = null;
        ResultSet resultset = null;
        Connection connection = JdbcUtils.getConnection();
        try{
            String sql = "SELECT p.*, c.name as category_name " +
                         "FROM product p " +
                         "JOIN category c ON p.category_id = c.id";
            preparedStatement = connection.prepareStatement(sql);
            resultset = preparedStatement.executeQuery();
            while(resultset.next()){
                ProductDTO dto = new ProductDTO();
                dto.setId(resultset.getInt("id"));
                dto.setName(resultset.getString("name"));
                dto.setPrice(resultset.getDouble("price"));
                dto.setCategoryId(resultset.getInt("category_id"));
                dto.setCategoryName(resultset.getString("category_name"));
                list.add(dto);
            }
        }
        catch(SQLException e){
            System.err.println(ErrorContraint.FIND_ERROR);
        }
        finally{
            
            if(resultset!=null){
                try {
                    resultset.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            if(preparedStatement!=null){
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            if(connection!=null){
                JdbcUtils.close(connection);
            }
            
        }
        return list;
    }
    
}
