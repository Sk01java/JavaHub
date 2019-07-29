package com.yss.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yss.config.SpringHibernateConfig;
import com.yss.hib.daos.CustomerDao;
import com.yss.pojos.Customer;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes={SpringHibernateConfig.class})
public class SpringHibernateTest {
	@Autowired
	ApplicationContext context;
	
	@Test
	public void testSpringHibernate() {
		CustomerDao custDao = (CustomerDao) context.getBean("custdao");
		Customer c = new Customer();
		c.setCno(2);
		c.setCname("Kumar");
		c.setAddress("Gurgaon");
		c.setPhone(7065602245L);
		custDao.save(c);
		System.out.println("Record inserted successfully...");
	}
}
