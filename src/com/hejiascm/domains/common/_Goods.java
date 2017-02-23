package com.hejiascm.domains.common;

import com.ibm.crl.bc.hejia.sdk.common.Currency;
import com.ibm.crl.bc.hejia.sdk.common.Goods;

public class _Goods extends Goods {

	public _Goods() {
		// TODO Auto-generated constructor stub
	}

	public _Goods(String id, String serial, String name, String description, String specs, String unit, Long quantity,
			String producer, Currency unitPrice, Double taxRate, Currency totalAmount) {
		super(id, serial, name, description, specs, unit, quantity, producer, unitPrice, taxRate, totalAmount);
		// TODO Auto-generated constructor stub
	}

}
