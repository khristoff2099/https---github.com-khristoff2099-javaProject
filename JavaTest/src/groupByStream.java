import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupByStream{
   public static void main(String[] args){
      Employee[] e = {
         new Employee(1, "Jose", 51000),
         new Employee(2, "Maria", 71600),
         new Employee(3, "Raul", 71600),
         new Employee(4, "Oscar", 62001),
         new Employee(5, "Maria", 62001),
         new Employee(6, "Eloisa", 71600),
         new Employee(7, "Israel", 62001),
         new Employee(8, "Ernesto", 51000)};
      List<Employee> l = Arrays.asList(e);
      Map<Integer, List<Employee>> gs = l.stream().collect(Collectors.groupingBy(Employee::getSalary));
      System.out.println(gs);
      
   } 
}

class Employee{
    private Integer id;
    private String name;
    private Integer salary; 
   public Employee(Integer id, String name, Integer salary) {
      this.id = id;
      this.name = name;
      this.salary = salary;
   } 
   public Integer getId(){
	  return id;
   }
   public void setId(Integer id){
      this.id = id;
   }
   public String getName(){
      return name;
   }
   public void setName(String name){
	  this.name = name;
   }
   public Integer getSalary(){
      return salary;
   }
   public void setSalary(Integer salary){
	  this.salary = salary;
   }
   @Override
   public String toString(){
	   return String.format(getId().toString(), getName(), getSalary().toString());
   } 
}