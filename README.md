# EmployeeSystem
Employee system will read the employees from the command line and saves to three different files when trying sort


# Problem:

Input to be read from command line. Input is split into multiple lines. Each line of input can

be any of below types

1. Employee data in the string format as below : FirstName (String), LastName(String),

Experience(Months), Age(Years), Organization(String)

2. “SORT” keyword.

3. “EXIT” keyword

Employee data needs to be captured for as many as records user wants to input (input type 1

above). Once “SORT” keyword (input type 2 above) is encountered, employee data needs to

be sorted and stored in three different files according to following conditions

● Organization, Experience, FirstName, LastName

● Experience/age ratio, Organization

● Append all the fields of each record.

When writing to a file, simulate a delay of 5 seconds for network latency. User should never

be blocked from entering inputs.

Program execution should be stopped when “EXIT” keyword is received.

There may be some illegal data which should be handled. List down the possible corner cases,

and try to handle them. Try to use best practices wherever is possible.

Eg Input:

Naveen, Chandra, 50, 25, Fission

Virat, Kohli, 74, 55, HCL

Ravi, Ashwin, 77, 35, Cricket

Naveen, Ramesh, 27, 25, Fission

Virat, Kohli, 14, 22, HCL

SORT

Naveen, Bindra, 37, 44, Fission

Ashok, Verma, 17, 17, Fission

Naveen, Chandra, 14, 19, Fission



# Solution
The solution has been provided fot the above problem

# Execution

1.Import project into eclipse as "existing projcts into workspace" 
2. Run App.java using Run as application.
