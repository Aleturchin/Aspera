package lesson13;

import java.util.*;


public class EmployeeRunner {
    public static void main(String[] args) {

        List<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Иванов И.И", 1, 20));
        employees.add(new Employee("Сидоров С.С", 2, 18));
        employees.add(new Employee("Петров П.П", 3, 17));
        employees.add(new Employee("Новиков А.И", 10, 12));
        employees.add(new Employee("Смирнов И.С", 12, 13));
        employees.add(new Employee("Волков А.В", 5, 17));
        employees.add(new Employee("Лебедев В.Н", 4, 16));
        employees.add(new Employee("Морозов Е.П", 11, 12));
        employees.add(new Employee("Федоров Н.Р", 7, 16));
        System.out.println(employees);

        ListIterator<Employee> iterator = employees.listIterator();
         while (iterator.hasNext()) {
            Employee currentEmployee = iterator.next();
           if (currentEmployee.getWorkAge() > 18) {
                System.out.println(currentEmployee.getName());
           }
       }
         System.out.println("______________");

        while (iterator.hasPrevious()) {
            int currentEmployeeIndex = iterator.previousIndex();
            iterator.previous();
            if (currentEmployeeIndex % 2 != 0) {
                iterator.remove();
            }
        }
        System.out.println(employees);

            }

        }







