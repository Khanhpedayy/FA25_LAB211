package P0101;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Display {
    public void displayMenu() {
        System.out.println("Main menu: ");
        System.out.println("1. Add Employee");
        System.out.println("2. Update Employee");
        System.out.println("3. Remove Employee");
        System.out.println("4. Search Employee");
        System.out.println("5. Sort Employees by Salary");
        System.out.println("6. Exit");
    }

    public void DisplayElementofList(ArrayList<Employee> EmployeeList, int index) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String DayofBirth = dateFormat.format(EmployeeList.get(index).getDOB());
        System.out.format("%3d%10s%10s%15s%30s%20s%12s%5s%10d%10s\n",
                EmployeeList.get(index).getId(), EmployeeList.get(index).getFirstName(),
                EmployeeList.get(index).getLastName(),
                EmployeeList.get(index).getPhone(), EmployeeList.get(index).getEmail(),
                EmployeeList.get(index).getAddress(), DayofBirth,
                EmployeeList.get(index).getSex(), EmployeeList.get(index).getSalary(),
                EmployeeList.get(index).getAgency());
    }

    public void DisplayAllList(ArrayList<Employee> EmployeeList) {
        System.out.println("The Employees List: ");
        System.out.format("%3s%10s%10s%15s%30s%20s%12s%5s%10s%10s\n", "Id", "First Name",
                "Last Name", "Phone Number", "Email", "Address", "Birthday", "Gender", "Salary", "Agency");
        // loop use to access each element of arraylist from begining to the end
        for (int i = 0; i < EmployeeList.size(); i++) {
            DisplayElementofList(EmployeeList, i);
        }
    }
}
