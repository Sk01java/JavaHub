package com.yss.hib.daos;

import com.yss.pojos.Customer;

public interface CustomerDao {
	public void save(Customer e);
	public void update(Customer e);
	public void delete(int eno);
	public Customer get(int eno);
}
