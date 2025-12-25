import java.util.Scanner;

/**
 * Main class used to test multiple Lab & Home Task classes.
 */
public class Main {

    public static void main(String[] args) {

        /* ===================== Lab Task No 1 ===================== */
        System.out.println("=== Testing Address and Person Class ===\n");

        // Creating Address and Person objects
        Address address = new Address("Maple Street", "15B", "Boston", "02115");
        Person person = new Person("Sarah Johnson", address);

        // Display person information
        System.out.println(person);


        /* ===================== Lab Task No 2 ===================== */
        System.out.println("\n=== Employee Management System ===\n");
        System.out.println("Current Year: 2012\n");

        // Creating employee with DOB and DOJ
        Date dob1 = new Date(15, 5, 1980);
        Date doj1 = new Date(10, 3, 2008);

        Employee emp1 = new Employee("John Smith", "EMP001", doj1, dob1);

        // Display employee info and checks
        System.out.println("=== Employee 1 ===");
        System.out.println(emp1);
        System.out.println("Joined within last 5 years? " + emp1.joinedWithinLastFiveYears());
        System.out.println("Age less than 40 years? " + emp1.isAgeLessThanForty());


        /* ===================== Lab Task No 3 ===================== */
        System.out.println("\nEnter book details:");
        Book book = new Book();
        book.getdata();

        System.out.println("\nEnter audio cassette details:");
        Tape tape = new Tape();
        tape.getdata();

        System.out.println("\n=== Results ===");
        book.putdata();
        tape.putdata();


        /* ===================== Lab Task No 4 ===================== */
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== Testing Person1 Class ===");
        Person1 person1 = new Person1();
        person1.input();
        person1.display();

        System.out.println("\n=== Testing Student Class ===");
        Student student = new Student();
        student.input();
        student.display();

        System.out.println("\n=== Testing with Parameterized Constructor ===");
        Student student2 = new Student("P002", "Alice Smith", "456 Oak St", "S2024002", 88.5);
        student2.display();


        /* ===================== Lab Task No 5 ===================== */
        System.out.println("\n=== Testing Computer Class ===");

        // Default computer
        Computer computer1 = new Computer();
        computer1.display();

        // Parameterized computer
        Computer computer2 = new Computer(64, 8192, 512000, 3200.0);
        computer2.display();

        System.out.println("\n=== Testing Laptop Class ===");

        // Default laptop
        Laptop laptop1 = new Laptop();
        laptop1.display();

        // Parameterized laptop
        Laptop laptop2 = new Laptop(64, 16384, 1000000, 2400.0,
                13.3, 9.1, 0.6, 3.2);
        laptop2.display();

        // Updating laptop1 values
        laptop1.setWordSize(32);
        laptop1.setMemorySize(4096);
        laptop1.setStorageSize(256000);
        laptop1.setSpeed(2200.0);
        laptop1.setLength(15.6);
        laptop1.setWidth(10.2);
        laptop1.setHeight(0.8);
        laptop1.setWeight(4.5);
        laptop1.display();


        /* ===================== Home Task No 1 ===================== */
        System.out.println("\n=== TESTING STUDENT RESULT SYSTEM ===");

        Test student1 = new Test();
        student1.getdata();
        student1.getmarks();
        student1.Finalresult();
        student1.displayAll();


        /* ===================== Home Task No 2 ===================== */
        System.out.println("\n=== TESTING SIMPLE AND COMPLEX CLASSES ===");

        // Testing Simple class
        Simple simple1 = new Simple(10, 5);
        simple1.displayNumbers();
        simple1.add();
        simple1.sub();
        simple1.mul();
        simple1.div();

        // Testing Complex class
        Complex complex1 = new Complex(12, 3);
        complex1.showAllOperations();

        Complex complex2 = new Complex(-5, 2);
        complex2.showAllOperations();

        Complex complex3 = new Complex(0, 4);
        complex3.showAllOperations();


        /* ===================== Home Task No 3 ===================== */
        System.out.println("\n=== ELECTRICITY BILL CALCULATION SYSTEM ===");

        Electricity consumer1 = new Electricity("John Smith", 80);
        consumer1.displayBill();

        More_Electricity consumer2 = new More_Electricity("Alice Johnson", 90);
        consumer2.displayBill();

        More_Electricity consumer3 = new More_Electricity("Bob Wilson", 200);
        consumer3.displayBill();

        More_Electricity consumer4 = new More_Electricity("Sarah Davis", 500);
        consumer4.displayBill();


        /* ===================== Home Task No 4 ===================== */
        System.out.println("\n=== PACKAGE DELIVERY SERVICE ===");

        // Regular Package
        Package regularPackage = new Package(
                "John Smith", "123 Main St", "New York", "NY", "10001",
                "Alice Johnson", "456 Oak Ave", "Boston", "MA", "02101",
                32.5, 0.25
        );
        regularPackage.displayInfo();

        // Two-day delivery package
        TwoDayPackage twoDayPackage = new TwoDayPackage(
                "Bob Wilson", "789 Pine Rd", "Chicago", "IL", "60601",
                "Sarah Davis", "321 Maple Ln", "Seattle", "WA", "98101",
                48.0, 0.30, 5.50
        );
        twoDayPackage.displayInfo();

        // Overnight delivery package
        OvernightPackage overnightPackage = new OvernightPackage(
                "Mike Taylor", "555 Cedar St", "Los Angeles", "CA", "90001",
                "Emma Brown", "777 Birch Blvd", "Miami", "FL", "33101",
                16.0, 0.35, 0.40
        );
        overnightPackage.displayInfo();


        /* ===================== PACKAGE COMPARISON ===================== */
        System.out.println("\n=== PACKAGE COMPARISON ===");

        double weight = 24.0;
        double costPerOunce = 0.28;

        Package p1 = new Package(
                "Same Sender", "123 St", "City", "ST", "12345",
                "Same Receiver", "456 St", "City2", "ST2", "67890",
                weight, costPerOunce
        );
        p1.displayInfo();

        TwoDayPackage p2 = new TwoDayPackage(
                "Same Sender", "123 St", "City", "ST", "12345",
                "Same Receiver", "456 St", "City2", "ST2", "67890",
                weight, costPerOunce, 6.00
        );
        p2.displayInfo();

        OvernightPackage p3 = new OvernightPackage(
                "Same Sender", "123 St", "City", "ST", "12345",
                "Same Receiver", "456 St", "City2", "ST2", "67890",
                weight, costPerOunce, 0.50
        );
        p3.displayInfo();

        // Close scanner
        scanner.close();
    }
}
