package com.jts.lms.dsh;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import com.jts.lms.service.BookService;

public class adminDashboard {

    static Scanner sc = new Scanner(System.in);

    public void dashboardOption(Connection conn) throws SQLException {
        boolean keepRunning = true;
        while (keepRunning) {
            System.out.println("***************Choose Option***************");
            System.out.println("[1] - Search Book.");
            System.out.println("[2] - Add New Book.");
            System.out.println("[3] - Upgrade Quantity Of Book.");
            System.out.println("[4] - Show All Books.");
            System.out.println("[5] - Register Student.");
            System.out.println("[6] - Show All Registered Student.");
            System.out.println("[7] - Exit From System.");
            System.out.println("*******************************************");

            keepRunning = executeOption(conn);
        }
    }

    public static boolean executeOption(Connection conn) throws SQLException {
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                searchBook(conn);
                break;
            case 2:
                // Add New Book logic
                break;
            case 3:
                // Upgrade Quantity Of Book logic
                break;
            case 4:
                // Show All Books logic
                break;
            case 5:
                // Register Student logic
                break;
            case 6:
                // Show All Registered Student logic
                break;
            case 7:
                System.out.println("LogOut ..............");
                return false; // Exit the loop
            default:
                System.out.println("! Select Valid Option !");
        }
        return true; // Continue the loop
    }

    private static void searchBook(Connection conn) throws SQLException {
        System.out.println("***************Choose Option***************");
        System.out.println("[1] - Search Book By Serial No.");
        System.out.println("[2] - Search Book By Author Name.");
        System.out.println("[3] - Return TO Main Menu.");

        int choice;

        do {
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    BookService bookservice = new BookService();
                    bookservice.searchBySrNo(conn);
                    break;
                case 2:
                    // Search Book By Author Name logic
                    break;
                case 3:
                    System.out.println("Returning Back To Main Menu ..............");
                    break;
                default:
                    System.out.println("! Select Valid Option !");
            }
        } while (choice != 3);
    }
}
