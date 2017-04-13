package com.sekhar.employeesystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.sekhar.employeesystem.model.Employee;

/**
 * 
 * @author Shekar
 *
 */
public class App {
	/**
	 * employees list
	 */
	private static List<Employee> employees = new ArrayList<Employee>();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Valid inputs are : SORT or EXIT or SHOW");
		while (true) {

			System.out.print("Enter input: ");
			String input = scanner.nextLine();
			String[] empStrs = null;
			try {
				if (input != null && !input.isEmpty()) {
					switch (input) {
					case "EXIT":
						System.out.println("The process has been aborted");
						System.exit(0);
						break;
					case "SORT":
						Collections.sort(employees);
						Thread th = new Thread(new EmployeeDataWriteThread(employees));
						th.start();
						System.out.println("Data has been written into file.");
						break;
					case "SHOW":
						System.out.println(employees);
						break;
					default:
						empStrs = input.split(",");
						if (empStrs != null) {
							Employee employee = setEmployeeDataToBean(empStrs);
							employees.add(employee);
						}
						break;
					}
				}
			} catch (java.lang.ArrayIndexOutOfBoundsException e) {
				System.out.println("OOPS! thats not a valid input, please try agian.");
			} catch (Exception e) {
				System.out.println("Something went wrong...please restart.");
			}
		}

	}

	/**
	 * set employee data to bean
	 * 
	 * @param empStrs
	 * @return
	 */
	private static Employee setEmployeeDataToBean(String[] empStrs) {
		Employee employee = null;
		if (empStrs != null) {
			employee = new Employee();
			employee.setFirstName(empStrs[0]);
			employee.setLastName(empStrs[1]);
			employee.setExperience(Integer.parseInt(empStrs[2]));
			employee.setAge(Integer.parseInt(empStrs[3]));
			employee.setOrganization(empStrs[4]);
		}
		return employee;

	}

}
