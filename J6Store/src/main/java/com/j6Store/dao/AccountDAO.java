package com.j6Store.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.j6Store.entity.Account;

public interface AccountDAO extends JpaRepository<Account, String>{

}
