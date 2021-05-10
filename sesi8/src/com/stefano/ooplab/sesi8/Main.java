package com.stefano.ooplab.sesi8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Admin admin = new Admin(1, "abcd1234", "Stefano", "stefano.wiryana@binus.ac.id");
        Customer customer = new Customer(2, "177013", "Ana Grey",
                "Jl Melati Putih 45 RT 013/06 Kemanggisan, Dki Jakarta",
                "ana@grey.com",
                "5254259381182041",
                "07/2023",
                "420"
        );
        String choice = "", email = "", password = "";

        System.out.println("Admin: ");
        System.out.println("User ID: " + admin.user_id());
        System.out.println("Email: " + admin.email());

        System.out.println("\nCustomer: ");
        System.out.println("User ID: " + customer.user_id());
        System.out.println("Customer name: " + customer.customer_name());
        System.out.println("Address: " + customer.address());
        System.out.println("Email: " + customer.email());
        System.out.println(customer.bill(10000, 3));

        do {
            System.out.print("\nWho are you [admin/customer]? ");
            choice = input.nextLine();
        }
        while(!choice.equalsIgnoreCase("admin") && !choice.equalsIgnoreCase("customer"));
        System.out.print("Email: ");
        email = input.nextLine();
        System.out.print("Password: ");
        password = input.nextLine();

        if(choice.equalsIgnoreCase("admin")) {
            if(admin.email().equals(email) && admin.verify_login(password)) {
                System.out.print("\nLogged in as: " + admin.email() + " (admin)");
            }
            else {
                System.out.print("\nLog in failed");
            }
        }
        else {
            if(customer.login(email, password)) {
                System.out.print("\nLogged in as: " + customer.email() + " (customer)");
            }
            else {
                System.out.print("\nLog in failed");
            }
        }

    }
}
