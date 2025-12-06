package P0101;

import java.util.Date;

public class Employee {
    private int Id;
    private String FirstName;
    private String LastName;
    private String Phone;
    private String Email;
    private String Address;
    private Date DOB;
    private String Sex;
    private int Salary;
    private String Agency;

    public Employee() {
    }

    public Employee(int Id, String FirstName, String LastName, String Phone, String Email, String Address, Date DOB,
            String Sex, int Salary, String Agency) {
        this.Id = Id;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Phone = Phone;
        this.Email = Email;
        this.Address = Address;
        this.DOB = DOB;
        this.Sex = Sex;
        this.Salary = Salary;
        this.Agency = Agency;
    }

    // Getters and Setters
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public String getAgency() {
        return Agency;
    }

    public void setAgency(String agency) {
        Agency = agency;
    }
}