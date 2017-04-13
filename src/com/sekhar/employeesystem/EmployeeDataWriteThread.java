/**
 * 
 */
package com.sekhar.employeesystem;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import com.sekhar.employeesystem.model.Employee;

/**
 * @author Shekar
 *
 */
public class EmployeeDataWriteThread implements Runnable {
	/**
	 * employees list
	 */
	private List<Employee> employees = null;

	/**
	 * 
	 * @param employees
	 */
	public EmployeeDataWriteThread(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public void run() {

		try {
			Thread.sleep(5000l);
			Util.saveInFile(employees, "FIRST");
			Util.saveInFile(employees, "SECOND");
			Util.saveInFile(employees, "THIRD");

		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
