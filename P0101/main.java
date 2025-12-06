package P0101;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Display display = new Display();
        GetData getData = new GetData();
        Scanner sc = new Scanner(System.in);
        int choice;
        EmployeeDAO EmployeeManagement = new EmployeeDAO();
        ArrayList<Employee> EmployeeList = new ArrayList<>();
        do {
            // 1. Display a menu
            display.displayMenu();
            // 2. Ask and Get user's choice
            choice = getData.getInteger(sc, "Let's select option: ", 1, 6);
            switch (choice) {
                case 1:// Add Employee
                    EmployeeManagement.addEmployee((ArrayList<Employee>) EmployeeList);
                    break;
                case 2: // Update employees
                    EmployeeManagement.updateEmployee((ArrayList<Employee>) EmployeeList);
                    break;
                case 3:// Removed employees
                    int Id;
                    EmployeeManagement.removedEmployee((ArrayList<Employee>) EmployeeList);
                    break;
                case 4: // Search employees
                    EmployeeManagement.Search((ArrayList<Employee>) EmployeeList);
                    break;
                case 5:// Sort employees by salary
                    EmployeeManagement.SortBySalary((ArrayList<Employee>) EmployeeList);
                    break;
            }

        } while (choice < 6);
    }
}
