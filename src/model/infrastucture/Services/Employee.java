package model.infrastucture;

import java.time.LocalDate;

public class Employee {
        private long id;
    private String name;
    private String lastName;
    private LocalDate hiringDate;
    private Sex sex;
    private String idDepartment;
    public Employee(long id,String name,String lastName,LocalDate hiringDate,Sex sex,String idDepartment){
        this.id=id;
        this.name=name;
        this.lastName=lastName;
        this.hiringDate=hiringDate;
        this.sex=sex;
        this.idDepartment=idDepartment;

    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getHiringDate() {
        return hiringDate;
    }

    public Sex getSex() {
        return sex;
    }

    public String getIdDepartment() {
        return idDepartment;
    }
}
