package com.cg.mobshop.service;

import java.util.ArrayList;
import java.util.List;

import com.cg.mobshop.dto.Mobile;
import com.cg.mobshop.dto.PurchaseDetails;
import com.cg.mobshop.exception.PurchaseException;

public interface PurchaseService {
	public int addPurchaseDetails(PurchaseDetails pr) throws PurchaseException;
	public List<Mobile> getMobileList() throws PurchaseException;
	public List<Mobile> getMobileList(int min,int max) throws PurchaseException;
	public Mobile updateMobileDetails(Mobile mob) throws PurchaseException;
	
	public PurchaseDetails ValidateDetails(PurchaseDetails pd)throws PurchaseException;
	public boolean validateName(String name) throws PurchaseException;
	public boolean validatePhoneNo(String mob);
	public boolean validateEmail(String email);

}
