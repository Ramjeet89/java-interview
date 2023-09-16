package com.interview.utils.SerializeandDeSerialize;

import java.io.*;

public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;

    public Employee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }
}

class SerializeEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Amy");
        Employee emp2 = new Employee(2, "Ankit");
        try {
            OutputStream outputStream = new FileOutputStream("ser.txt");
            ObjectOutput objectOutput = new ObjectOutputStream(outputStream);
            System.out.println("Serialization process has started, serializing employee objects...");

            objectOutput.writeObject(emp1);
            objectOutput.writeObject(emp2);
            objectOutput.close();
            System.out.println("Object Serialization completed.");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
