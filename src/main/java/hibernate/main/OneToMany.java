package hibernate.main;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import hibernate.entity.Department;
import hibernate.entity.Employee;

public class OneToMany 
{
   public static void main(String[] args) 
   {
      EntityManagerFactory emfactory = Persistence.
      createEntityManagerFactory("JavaHelps");
      EntityManager entitymanager = emfactory.createEntityManager( );
      entitymanager.getTransaction( ).begin( );

      //Create Employee1 Entity
      Employee employee1 = new Employee();
      employee1.setNameEmployee("Satish");
      employee1.setSalaryEmployee(45000.0);
      employee1.setDegEmployee("Technical Writer");

      //Create Employee2 Entity
      Employee employee2 = new Employee();
      employee2.setNameEmployee("Krishna");
      employee2.setSalaryEmployee(45000.0);
      employee2.setDegEmployee("Technical Writer");

      //Create Employee3 Entity
      Employee employee3 = new Employee();
      employee3.setNameEmployee("Masthanvali");
      employee3.setSalaryEmployee(50000.0);
      employee3.setDegEmployee("Technical Writer");

      //Store Employee
      entitymanager.persist(employee1);
      entitymanager.persist(employee2);
      entitymanager.persist(employee3);

      //Create Employeelist
      List<Employee> emplist = new ArrayList();
      emplist.add(employee1);
      emplist.add(employee2);
      emplist.add(employee3);

      //Create Department Entity
      Department department = new Department();
      department.setNameDeparment("Development");
      department.setEmployeelist(emplist);

      //Store Department
      entitymanager.persist(department);

      entitymanager.getTransaction().commit();
      entitymanager.close();
      emfactory.close();
   }
}
