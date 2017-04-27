package com.hejiascm.blockchain.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.hejiascm.blockchain.interfaces.ReceivingRecordDAO;
import com.hejiascm.domains.logistics._ReceivingRecord;
import com.hejiascm.util.FatherToChildUtils;
import com.ibm.crl.bc.hejia.sdk.SdkFactory;
import com.ibm.crl.bc.hejia.sdk.common.BlockchainException;
import com.ibm.crl.bc.hejia.sdk.common.Property;
import com.ibm.crl.bc.hejia.sdk.logistics.ReceivingRecord;
import com.ibm.crl.bc.hejia.sdk.logistics.ReceivingRecordProxy;
import com.ibm.crl.bc.hejia.sdk.util.PropertySerializer;

@Component("ReceivingRecord")
public class ReceivingRecordDAOImpl implements ReceivingRecordDAO {

	public ReceivingRecordDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<_ReceivingRecord> getReceivingRecords(String query, String operator) {
		List<ReceivingRecord> recs = null;
		List<_ReceivingRecord> _recs = null;
		try(ReceivingRecordProxy rp = SdkFactory.getInstance().getReceivingRecordProxy(operator)){
			recs = rp.getReceivingRecords(query);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		
		_recs = new ArrayList<_ReceivingRecord>();
		for(ReceivingRecord rec : recs){
			_ReceivingRecord _rec = new _ReceivingRecord();
			FatherToChildUtils.fatherToChild(rec, _rec);
			
			Property[] props = rec.getProperties();
			if(props != null){
				Map<String,String> map = PropertySerializer.fromProperties(props);
				
				_rec.setTruckNum(map.get("truckNum"));
				_rec.setDriver(map.get("driver"));
				_rec.setOrgId(map.get("orgId"));
				_rec.setDeliveryFillTime(map.get("deliveryFillTime"));
				_rec.setConsignerOrgName(map.get("consignerOrgName"));
				_rec.setConsignerTel(map.get("consignerTel"));
				_rec.setConsigneeOrgName(map.get("consigneeOrgName"));
				_rec.setConsigneeTel(map.get("consigneeTel"));
				_rec.setDeliveryFillName(map.get("deliveryFillName"));
				_rec.setConsignerMan(map.get("consignerMan"));
				_rec.setConsigneeMan(map.get("consigneeMan"));
			}	
			_recs.add(_rec);
		}
		
		return _recs;
	}

	@Override
	public String submitRecevingRecord(_ReceivingRecord rrec, String operator) {
		Property[] props = new Property[]{
				new Property("truckNum", rrec.getTruckNum()),
				new Property("driver", rrec.getDriver()),
				new Property("orgid", rrec.getOrgId()),
				new Property("deliveryFillTime", rrec.getDeliveryFillTime()),
				new Property("consignerOrgName", rrec.getConsignerOrgName()),
				new Property("consignerTel", rrec.getConsignerTel()),
				new Property("consigneeOrgName", rrec.getConsigneeOrgName()),
				new Property("consigneeTel", rrec.getConsigneeTel()),
				new Property("deliveryFillName", rrec.getDeliveryFillName()),
				new Property("consignerMan", rrec.getConsignerMan()),
				new Property("consigneeMan", rrec.getConsigneeMan())
		};
		
		String res = null;
		try(ReceivingRecordProxy rp = SdkFactory.getInstance().getReceivingRecordProxy(operator)){
			res = rp.submitReceivingRecord(rrec.getReceivingRecordFormId(), 
																		    rrec.getDeliveryRecordId(),
																		    rrec.getOrderId(),
																		    rrec.getContractId(), 
																		    rrec.getContractVersion(), 
																			rrec.getName(), 
																		    rrec.getDescription(), 
																		    rrec.getQualityRecordIds(), 
																		    props, 
																		    rrec.getGoods(), 
																		    rrec.getAmount(), 
																		    rrec.getRemarks(),
																		    rrec.getAttachments());
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public void updateReceivingRecord(_ReceivingRecord rrec, String operator) {
		// TODO Auto-generated method stub

	}

}
