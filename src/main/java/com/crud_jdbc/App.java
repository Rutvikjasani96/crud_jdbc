package com.crud_jdbc;

import com.crud_jdbc.dao.EmpDao;
import com.crud_jdbc.entites.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        Used xml file
//        ApplicationContext context = new ClassPathXmlApplicationContext("empconfig.xml");

//        Used Java config file
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        EmpDao empDao = context.getBean("empDao",EmpDao.class);


//        Insert Data
//        Emp emp = new Emp();
//        emp.setId(3);
//        emp.setName("Dhruvin Palsana");
//        emp.setSalary(200);
//        emp.setCity("Ahmedabad");
//        emp.setStatus(false);
//        int insertResult = empDao.insertData(emp);
//        System.out.println(insertResult+" Rows Inserted...");


//        Update Data
//        Emp emp1 = new Emp();
//        emp1.setId(2);
//        emp1.setName("Rutvik");
//        emp1.setSalary(20000);
//        emp1.setCity("Surat, Gujarat");
//        emp1.setStatus(true);
//        int updateResult = empDao.updateData(emp1);
//        System.out.println(updateResult+" Rows Updated...");

//        Delete Data
//        int deleteResult = empDao.deleteData(2);
//        System.out.println(deleteResult+" Rows Deleted...");

//         Select 1 Data(Row)
//        Emp emp2 = empDao.selectOneData(1);
//        System.out.println(emp2);

//        Select all the Data(Rows)
        List<Emp> emps = empDao.selectAllData();
        for(Emp emp3 : emps){
            System.out.println(emp3);
        }
    }
}
