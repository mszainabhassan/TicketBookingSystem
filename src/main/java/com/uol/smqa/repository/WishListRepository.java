package com.uol.smqa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uol.smqa.model.Customer;
import com.uol.smqa.model.WishList;
@Repository
public interface WishListRepository extends JpaRepository<WishList,Integer>{
List<WishList> findByCustomer(Customer customer);
}
