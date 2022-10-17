package com.user.abc;

import java.util.List;
import java.util.Scanner;

import com.user.connect.ConnectionFactory;

public class Main {
	public static void main(String[] args) {
		boolean flag = true;

		while (flag) {
			System.out.println("----------------------");
			System.out.println("1. Create Employee");
			System.out.println("2. Edit Employee");
			System.out.println("3. Delete Employee");
			System.out.println("4. View Employee");
			System.out.println("5. Exit");
			System.out.println("----------------------");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter No");
			int no = sc.nextInt();
			EmployeeDao dao = new EmployeeDao(ConnectionFactory.getConn());
			switch (no) {
			case 1:
				System.out.println("Enter Name");
				String name1 = sc.next();
				System.out.println("Enter desg");
				String desg1 = sc.next();
				System.out.println("Enter Email");
				String email1 = sc.next();
				System.out.println("Enter sal");
				int salary1 = sc.nextInt();

				Employee c = new Employee();
				c.setName(name1);
				c.setDesg(desg1);
				c.setEmail(email1);
				c.setSalary(salary1);
				boolean s1 = dao.saveEmployee(c);
				if (s1) {
					System.out.println("Employee No Saved..");
				} else {
					System.out.println("Something wrong on server..");
				}
				break;
			case 2:
				System.out.println("Enter Id");
				int id = sc.nextInt();
				System.out.println("Enter Name");
				String name2 = sc.next();
				System.out.println("Enter desg");
				String desg2 = sc.next();
				System.out.println("Enter Email");
				String email2 = sc.next();
				System.out.println("Enter salary");
				int  salary2 = sc.nextInt();

				Employee c2 = new Employee();
				c2.setId(id);
				c2.setName(name2);
				c2.setName(desg2);
				c2.setEmail(email2);
				c2.setSalary(salary2);
				boolean s2 = dao.editEmployee(c2);
				if (s2) {
					System.out.println("Employee Edit Sucessfully..");
				} else {
					System.out.println("User Is not Available");
				}
				break;
			case 3:
				System.out.println("Enter Id");
				int id3 = sc.nextInt();
				boolean s3 = dao.deleteEmployee(id3);
				if (s3) {
					System.out.println("Employee Delete Sucessfully..");
				} else {
					System.out.println("User Is not Available");
				}
				break;
			case 4:
				List<Employee> list = dao.getAllEmployee();
				if (list.isEmpty()) {
					System.out.println("Employee is Not Available");
				} else {
					for (Employee con : list) {
						System.out.println("Id :" + con.getId());
						System.out.println("Name :" + con.getName());
						System.out.println("designation :"+ con.getDesg());
						System.out.println("Phno :" + con.getEmail());
						System.out.println("Salary :"+con.getSalary());
						System.out.println("---------------------");
					}
				}
				break;
			case 5:
				flag = false;
				System.out.println("Thank u..Visit Again..");
				break;

			default:
				System.out.println("Please Enter Correct No..");
				break;
			}

		}
	}

}
