package de.oszimt.fian.hase.model;

import de.oszimt.fian.hase.model.contract.ContractMgmt;
import de.oszimt.fian.hase.model.contract.IntContractMgmt;
import de.oszimt.fian.hase.model.customer.CustomerMgmt;
import de.oszimt.fian.hase.model.customer.IntCustomerMgmt;
import de.oszimt.fian.hase.model.employee.EmployeeMgmt;
import de.oszimt.fian.hase.model.employee.IntEmployeeMgmt;
import de.oszimt.fian.hase.view.IntView;

public class HaseGmbHManagement {

	private final IntEmployeeMgmt employee;
	private final IntCustomerMgmt customer;
	private final IntContractMgmt contract;

	private final IntView view;

	public HaseGmbHManagement(IntView view) {
		this.view = view;
		this.employee = new EmployeeMgmt(this);
		this.customer = new CustomerMgmt(this);
		this.contract = new ContractMgmt(this);
	}

	public IntView getView() {
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
