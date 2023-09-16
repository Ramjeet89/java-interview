package com.interview.utils.shallow_deep_copy;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private Map<Integer, Integer> map;

    public Employee(String name, Map<Integer, Integer> map) {
        this.name = name;
        this.map = map;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + "]";
    }

    public String getName() {
        return name;
    }

    public Map<Integer, Integer> getMap() {
        return map;
    }
}

class CloneUsingSerialization {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(1, 11);
        Employee emp = new Employee("ankit", map);

        try {
            OutputStream outputStream = new FileOutputStream("ser.txt");
            ObjectOutput objectOutput = new ObjectOutputStream(outputStream);
            System.out.println("Serialization process has started, "
                    + "serializing employee object...");
            objectOutput.writeObject(emp);
            objectOutput.close();
            outputStream.close();
            System.out.println("employee Serialization completed.");

            //De-Serialization
            InputStream inputStream = new FileInputStream("ser.txt");
            ObjectInput objectInput = new ObjectInputStream(inputStream);
            System.out.println("\nDeSerialization process has started, "
                    + "deSerializing employee object...");
            Employee deSerializedEmp = (Employee) objectInput.readObject();
            inputStream.close();
            objectInput.close();
            System.out.println("employee DeSerialization completed.");

            System.out.println(emp == deSerializedEmp);                     //false
            System.out.println(emp.getName() == deSerializedEmp.getName()); //false
            System.out.println(emp.getMap() == deSerializedEmp.getMap());   //false
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
