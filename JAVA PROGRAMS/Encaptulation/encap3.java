class Employee {  

private String emp_name; 

 private String emp_id; 

 private double net_salary; 

 public Employee(String emp_name, String emp_id, double net_salary) { 

 this.emp_name = emp_name; 

 this.emp_id = emp_id; 

 this.net_salary = net_salary; } 

 public String getEmpName() { return emp_name; } 

public String getEmpId() { return emp_id; } 

public double getSalary() { return net_salary; } 

public void setEmpName(String emp_name) { this.emp_name = emp_name; } 

public void setEmpId(String emp_id) { this.emp_id = emp_id; } 

public void setSalary(double net_salary) { this.net_salary = net_salary; } } 

 public class encap3 { public static void main(String args[]) {  

 Employee emp = new Employee("Robert", "EMP001", 75450.00); 

// Printing data 
System.out.println("Employee (Intial Values):"); 
System.out.println(emp.getEmpId() + " , " + emp.getEmpName() + " , " + emp.getSalary()); 
 
// Updating values using setter methods 
emp.setEmpName("Riyan"); 
emp.setEmpId("EMP002"); 
emp.setSalary(90500.00); 
 
// Printing data 
System.out.println("Employee (Updated Values):"); 
System.out.println(emp.getEmpId() + " , " + emp.getEmpName() + " , " + emp.getSalary()); 
  

} } 