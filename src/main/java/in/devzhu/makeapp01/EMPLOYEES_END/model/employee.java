package in.devzhu.makeapp01.EMPLOYEES_END.model;

import javax.persistence.*;

@Entity

public class employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false )
    private Long id;

    @Column(nullable = false, length = 30 )
    private String name;

    @Column(nullable = false, unique = true, length = 30 )
    private String email;
    private String jobtitle;

    @Column(nullable = false, unique = true, length = 15 )
    private String phone;
    @Column( nullable = false, updatable = false )
    private String employeeCode;


//default constructor and constructor with parameters

    public employee() {}


    public employee(Long id, String name, String email, String jobtitle, String phone, String employeeCode) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.jobtitle = jobtitle;
        this.phone = phone;
        this.employeeCode = employeeCode;
    }


    //getter and setter methods
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }


//to string method


    @Override
    public String toString() {
        return "employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", jobtitle='" + jobtitle + '\'' +
                ", phone='" + phone + '\'' +
                ", employeeCode='" + employeeCode + '\'' +
                '}';
    }


}
