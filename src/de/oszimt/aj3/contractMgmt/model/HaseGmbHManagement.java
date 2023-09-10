package de.oszimt.aj3.contractMgmt.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import de.oszimt.aj3.contractMgmt.model.contract.Contract;
import de.oszimt.aj3.contractMgmt.model.contract.ContractMgmt;
import de.oszimt.aj3.contractMgmt.model.contract.IntContractMgmt;
import de.oszimt.aj3.contractMgmt.model.customer.CustomerMgmt;
import de.oszimt.aj3.contractMgmt.model.customer.IntCustomerMgmt;
import de.oszimt.aj3.contractMgmt.model.employee.EmployeeMgmt;
import de.oszimt.aj3.contractMgmt.model.employee.IntEmployeeMgmt;
import de.oszimt.aj3.contractMgmt.view.IView;

public class HaseGmbHManagement {

	private IntEmployeeMgmt employee;
	private IntCustomerMgmt customer;
	private IntContractMgmt contract;

	private IView view;

	public HaseGmbHManagement(IView view) {
		this.view = view;
		this.employee = new EmployeeMgmt(this);
		this.customer = new CustomerMgmt(this);
		this.contract = new ContractMgmt(this);
	}

	public IView getView() {
		return view;
	}

	public IntEmployeeMgmt getEmployee() {
		return employee;
	}

	public IntCustomerMgmt getCustomer() {
		return customer;
	}

	public IntContractMgmt getContract() {
		return contract;
	}
}
