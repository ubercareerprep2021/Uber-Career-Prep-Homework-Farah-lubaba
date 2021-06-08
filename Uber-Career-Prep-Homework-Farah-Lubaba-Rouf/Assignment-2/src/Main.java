import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void printLevelByLevel(OrganizationStructure.Employee root) {
        Queue<OrganizationStructure.Employee> nodes = new LinkedList<>();;
        nodes.add(root);
        OrganizationStructure.Employee temp=null;
        OrganizationStructure.Employee tempLL=root;
        OrganizationStructure.Employee lastNode=null;
        while(!nodes.isEmpty()) {
            temp=nodes.remove();
            System.out.println(temp.name+' '+temp.title);
            for(int i=0;i<temp.directReports.size();i++) {
                nodes.add(temp.directReports.get(i));
                lastNode= temp.directReports.get(i);
            }
            if(!nodes.isEmpty() && temp==tempLL) {
                System.out.println();
                tempLL=lastNode;
            }

        }
    }
    public static void main(String[] args) {
	// write your code here
        List<OrganizationStructure.Employee> aList = new ArrayList<>();
        OrganizationStructure.Employee D=new OrganizationStructure.Employee("D", "Manager", aList);
        OrganizationStructure.Employee E=new OrganizationStructure.Employee("E", "Manager", aList);
        OrganizationStructure.Employee I=new OrganizationStructure.Employee("I", "Director", aList);
        OrganizationStructure.Employee B=new OrganizationStructure.Employee("B", "CFO", Arrays.asList(I));
        OrganizationStructure.Employee C=new OrganizationStructure.Employee("C", "CTO", Arrays.asList(D,E));
    }
}
