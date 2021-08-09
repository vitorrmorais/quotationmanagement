package com.ericsson.quotationmanagement.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ericsson.quotationmanagement.model.Quotes;

import java.util.ArrayList;
import java.util.List;


public interface QuotesRepository extends JpaRepository<Quotes, String> {

}