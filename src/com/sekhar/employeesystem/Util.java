/**
 * 
 */
package com.sekhar.employeesystem;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

import com.sekhar.employeesystem.model.Employee;

/**
 * @author Shekar
 *
 */
public class Util {
	/**
	 * 
	 * @param employees
	 * @param type
	 * @throws FileNotFoundException
	 * @throws UnsupportedEncodingException
	 */
	public static void saveInFile(List<Employee> employees, String type)
			throws FileNotFoundException, UnsupportedEncodingException {
		PrintWriter writer = new PrintWriter(type.toLowerCase() + ".txt", "UTF-8");
		StringBuilder builder = new StringBuilder();
		switch (type) {
		case "FIRST":
			for (Employee emp : employees) {
				builder.append(emp.getOrganization());
				builder.append(",");
				builder.append(emp.getExperience());
				builder.append(",");
				builder.append(emp.getFirstName());
				builder.append(",");
				builder.append(emp.getLastName());
				builder.append("\n");
			}
			break;
		case "SECOND":
			for (Employee emp : employees) {
				builder.append(emp.getExperience());
				builder.append(",");
				builder.append(emp.getOrganization());
				builder.append("\n");
			}
			break;
		case "THIRD":
			for (Employee emp : employees) {
				builder.append(emp.getFirstName());
				builder.append(",");
				builder.append(emp.getLastName());
				builder.append(",");
				builder.append(emp.getOrganization());
				builder.append(",");
				builder.append(emp.getExperience());
				builder.append(",");
				builder.append(emp.getAge());
				builder.append("\n");

			}
			break;

		default:
			break;
		}
		writer.write(builder.toString());
		writer.close();

	}
}
