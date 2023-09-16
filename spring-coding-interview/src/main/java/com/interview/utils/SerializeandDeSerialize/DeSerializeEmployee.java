package com.interview.utils.SerializeandDeSerialize;

import java.io.*;

public class DeSerializeEmployee {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("ser.txt");
            ObjectInput objectInput = new ObjectInputStream(inputStream);
            System.out.println("DeSerialization process has started, "
                    + "displaying employee objects...");
            Employee emp;
            while ((emp = (Employee) objectInput.readObject()) != null) {
                System.out.println(emp);
            }
            objectInput.close();
        } catch (EOFException e) {
            System.out.println("File ended");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Object DeSerialization completed.");

    }
}