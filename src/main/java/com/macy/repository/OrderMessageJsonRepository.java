package com.macy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.macy.entity.OrderJsonEntity;

public interface OrderMessageJsonRepository extends JpaRepository<OrderJsonEntity, Integer>{

}
