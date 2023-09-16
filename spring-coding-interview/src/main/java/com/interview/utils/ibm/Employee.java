package com.interview.utils.ibm;

public class Employee {
    //private String id;
    Integer id;

    public String getId() {
        //return id;
        return String.valueOf(id);
    }

    public void setId(String id) {
        // this.id = id;
        this.id = Integer.parseInt(id);
    }

    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setId("1001");
        System.out.println(employee.getId());
    }
}
