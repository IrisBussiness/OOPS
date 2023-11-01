package oops;

public class Employee {

    //attributes or data fields
    String empName="dessy";
    double empSalary=45000.98;
    String designation="Dev";

    //behaviour or methods
   /* returnType methodName(type variable, type variable)
   {
                   block of code
    }*/
    void getAnnualPackage(){
        System.out.println("Package: "+empSalary*12+50000);
    }

    public static void main(String[] args) {

        //creating the object
        Employee empObj=new Employee();

        empObj.getAnnualPackage();
        empObj.designation="Developer";

    }

}
