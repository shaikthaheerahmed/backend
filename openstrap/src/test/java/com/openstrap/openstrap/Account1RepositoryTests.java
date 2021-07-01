package com.openstrap.openstrap;



import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.openstrap.openstrap.models.Account1;
import com.openstrap.openstrap.repositories.Account1Repository;

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
@Rollback(false)
public class Account1RepositoryTests {
@Autowired
private Account1Repository repo;

@Autowired
private TestEntityManager entityManager;

@Test
public void accountcreate() {
	Account1 account=new Account1();
	account.setUsername("thaheer");
	account.setPassword("ahmed");
	account.setQualification("B-Tech");
	account.setGender("male");
	account.setAmount("10000");
	Account1 savedAccount=repo.save(account);
	
	entityManager.find(Account1.class, savedAccount.getId());
	assertThat(savedAccount.getQualification()).isEqualTo(savedAccount.getQualification());
}

}
