package lesson13;

import java.util.Objects;

public class Employee implements Comparable <Employee>{

    private String name;
    private Integer id;
    private int workAge;


    public Employee () {
    }

    public Employee(String name, Integer id, int workAge) {
        this.name = name;
        this.id = id;
        this.workAge =  workAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return workAge == employee.workAge && name.equals(employee.name) && id.equals(employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, workAge);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", workAge=" + workAge +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return o.getWorkAge () - this.getWorkAge();
    }
    public void printWorkAge () {
        System.out.println(this.getWorkAge());


    }
}


