class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        // Create a company
        Company company = new Company("My Company");

        // Create a salesperson
        Salesperson salesperson = new Salesperson("John", 1000, 10);

        // Create a manager
        Manager manager = new Manager("Mary", 100);

        // Create a secretary
        Secretary secretary = new Secretary("Bob");

        // Add the employees to the company
        company.addEmployee(salesperson);
        company.addEmployee(manager);
        company.addEmployee(secretary);

        // Print the company's name
        System.out.println(company.getName());

        // Print the company's employees
        for (Employee employee : company.getEmployees()) {
            System.out.println(employee.getName());
        }

        // Employees are working
        for (Employee employee : company.getEmployees()) {
            employee.work();
        }   

    }
}