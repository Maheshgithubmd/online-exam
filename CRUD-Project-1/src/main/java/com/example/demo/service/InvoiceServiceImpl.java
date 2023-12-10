package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.InvoiceNotFoundException;
import com.example.demo.model.Invoice;
import com.example.demo.repo.InvoiceRepository;

@Service
public class InvoiceServiceImpl {

	@Autowired
	private InvoiceRepository repo;

	public Invoice saveInvice(Invoice invoice) {
		return repo.save(invoice);
	}

	public List<Invoice> getAllInvoices() {
		return repo.findAll();
	}

	public Invoice getInvoiceById(Long id) {
		Optional<Invoice> opt = repo.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		} else {
			throw new InvoiceNotFoundException("Invoice with Id : " + id + " Not Found");
		}

	}

	public void deleteInvoiceById(Long id) {
		repo.delete(getInvoiceById(id));
	}

	public void updateInvoice(Invoice invoice) {
		repo.save(invoice);
	}
}