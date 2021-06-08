import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrganizationStructure {

    public Employee ceo;

    public static class Employee {
        public String name;
        public String title;
        public List<Employee> directReports;

        public Employee(String name, String title, List<Employee> directReports) {
            this.name=name;
            this.title=title;
            this.directReports=directReports;
        }
    }
    public static void main(String[] args) {
        List<Employee> aList = new ArrayList<>();
        Employee  D=new Employee("D", "Manager", aList);
        Employee  E=new Employee("E", "Manager", aList);
        Employee  I=new Employee("I", "Director", aList);
        Employee B=new Employee("B", "CFO",Arrays.asList(I));
        Employee  C=new Employee("C", "CTO", Arrays.asList(D,E));


    }

}
