package de.oszimt.aj3.contractMgmt.model.employee;

import de.oszimt.aj3.contractMgmt.model.Address;
import de.oszimt.aj3.contractMgmt.model.HaseGmbHManagement;

import java.util.ArrayList;

public class EmployeeMgmt implements IntEmployeeMgmt {

	private ArrayList<Employee> employeeList;
	private HaseGmbHManagement model;

	public EmployeeMgmt(HaseGmbHManagement model) {
		this.employeeList = new ArrayList<>();
		this.model = model;
	}

	//
	// implementation of interface IntEmployeeMgmt
	//

	@Override
	public boolean add(Employee employee) {
		for (Employee e : employeeList)
			if (e.equals(employee)) {
				getModel().getView().showError("Error: employee "+ employee.getId()+" in used.");
				return false;
			}
		employeeList.add(employee);
		return true;
	}

	@Override
	public Employee get(int id) {
		for (Employee e : employeeList)
			if (e.getId() == id) {
				return e;
			}
		getModel().getView().showError("Error: employee "+ id +" does not exist.");
		return null;
	}

	@Override
	public ArrayList<Employee> getAll() {
		return this.employeeList;
	}

	@Override
	public boolean update(Employee employee) {
		for (int i = 0; i < employeeList.size(); i++)
			if (employeeList.get(i).equals(employee)) {
				employeeList.set(i, employee);
				return true;
			}
		getModel().getView().showError("Error: the employee does not exist.");
		return false;
	}

	@Override
	public boolean delete(int id) {
		for (int i = 0; i < employeeList.size(); i++)
			if (employeeList.get(i).getId() == id) {
				employeeList.remove(i);
				return true;
			}
		getModel().getView().showError("Error: employee "+ id +" does not exist.");
		return false;
	}

	@Override
	public HaseGmbHManagement getModel() {
		return model;
	}

	// 
	//  methods for installing test data
	//

	public void loadData() {

		Employee anEmployee = new Employee("Max", "Müller",
				new Address("Schloßweg", "5", "85777", "Berlin", "Deutschland"), "may.mueller@hase-gmbh.de",
				"0049301234545");
		add(anEmployee);

		anEmployee = new Employee("Lennart", "Jäger", new Address("Teckstraße", "19", "72141", "Berlin", "Deutschland"),
				"lennart.jaeger@hase-gmbh.de", "00493054234545");
		add(anEmployee);

		anEmployee = new Employee("Silvia", "Schäfers",
				new Address("Am Bergsteig", "2", "81541", "Berlin", "Deutschland"), "silvia.schaefers@hase-gmbh.de",
				"0049309856749");
		add(anEmployee);

		anEmployee = new Employee("Heiko", "Guempel",
				new Address("Petershausener Straße", "18", "85302", "Berlin", "Deutschland"),
				"heiko.guempel@hase-gmbh.de", "0049303456741");
		add(anEmployee);

		anEmployee = new Employee("Klaus", "Reder", new Address("Rißeckstraße", "30", "83727", "Berlin", "Deutschland"),
				"klaus.reder@hase-gmbh.de", "0049307686231");
		add(anEmployee);

	}

}
