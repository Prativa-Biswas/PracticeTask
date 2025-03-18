package com.nt.ArrayList;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class StoreObject {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students you want to store: ");
        int noOfStudent = sc.nextInt();
        sc.nextLine(); // ✅ Consume leftover newline after nextInt()

        for (int i = 0; i < noOfStudent; i++) {
            System.out.println("Enter student ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // ✅ Consume leftover newline after nextInt()

            System.out.println("Enter student name: ");
            String name = sc.nextLine(); // ✅ Properly reads name

            System.out.println("Enter student Fee: ");
            double fee = sc.nextDouble();
            sc.nextLine(); // ✅ Consume leftover newline after nextDouble()

            System.out.println("Enter date of Admission (yyyy-MM-dd): ");
            String dateNo = sc.nextLine(); // ✅ Now properly reads date input

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = null;

            try {
                date = sdf.parse(dateNo); // Convert String to Date
                System.out.println("Converted Date: " + date);
            } catch (ParseException e) {
                e.printStackTrace();
                System.out.println("Invalid date format! Please enter in yyyy-MM-dd format.");
                return;
            }

            Student student = new Student(id, name, fee, date);
            studentList.add(Student.getStudentObject());
        }

        // Serialize student list
        try (FileOutputStream fileOut = new FileOutputStream("Student.txt");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
           for(int i=0;i<studentList.size();i++) {
        	   out.writeObject(studentList.get(i));
           }
            System.out.println("Student list has been serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
