public class ConstructionCompany {
	public static void main(String[] args) {

		Worker john = new Worker("John", 400.0);

		// Create a new hourly worker
		HourlyWorker jane = new HourlyWorker("Jane", 100.0, (double) 10);

		// Create a new project
		Project project = new Project("Project 1", "123-45-6789", (double) 40);

		// Add the worker to the project
		project.addWorker(jane);
		project.addWorker(john);

		// Print workers assigned to this project
		System.out.println("Workers assigned to project: ");
		for (Worker worker : project.getWorkers()) {
			System.out.println(worker.getName());
		}

		// Pay the workers
		project.payWorkers();

	}
}