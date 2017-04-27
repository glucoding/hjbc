package com.hejiascm.blockchain.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.hejiascm.blockchain.interfaces.DeliveryRecordDAO;
import com.hejiascm.domains.logistics._DeliveryRecord;
import com.hejiascm.util.FatherToChildUtils;
import com.ibm.crl.bc.hejia.sdk.SdkFactory;
import com.ibm.crl.bc.hejia.sdk.common.BlockchainException;
import com.ibm.crl.bc.hejia.sdk.common.Property;
import com.ibm.crl.bc.hejia.sdk.logistics.DeliveryRecord;
import com.ibm.crl.bc.hejia.sdk.logistics.DeliveryRecordProxy;
import com.ibm.crl.bc.hejia.sdk.util.PropertySerializer;

@Component("DeliveryRecordDAO")
public class DeliveryRecordDAOImpl implements DeliveryRecordDAO {

	public DeliveryRecordDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<_DeliveryRecord> getDeliveryRecords(String query, String operator) {
		List<DeliveryRecord> recs = null;
		List<_DeliveryRecord> _recs = null;
		try(DeliveryRecordProxy dp = SdkFactory.getInstance().getDeliveryRecordProxy(operator)){
			recs = dp.getDeliveryRecords(query);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		
		_recs = new ArrayList<_DeliveryRecord>();
		
		for(DeliveryRecord rec : recs){
			_DeliveryRecord _rec = new _DeliveryRecord();
			FatherToChildUtils.fatherToChild(rec, _rec);
			
			Property[] props = rec.getProperties();
			if(props != null){
				Map<String,String> map = PropertySerializer.fromProperties(props);
				
				_rec.setTruckNum(map.get("truckNum"));
				_rec.setDriver(map.get("driver"));
				_rec.setOrgId(map.get("orgid"));
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
	public String submitDeliveryRecord(_DeliveryRecord drec, String operator) {
		Property[] props = new Property[]{
				new Property("truckNum", drec.getTruckNum()),
				new Property("driver", drec.getDriver()),
				new Property("orgid", drec.getOrgId()),
				new Property("deliveryFillTime", drec.getDeliveryFillTime()),
				new Property("consignerOrgName", drec.getConsignerOrgName()),
				new Property("consignerTel", drec.getConsignerTel()),
				new Property("consigneeOrgName", drec.getConsigneeOrgName()),
				new Property("consigneeTel", drec.getConsigneeTel()),
				new Property("deliveryFillName", drec.getDeliveryFillName()),
				new Property("consignerMan", drec.getConsignerMan()),
				new Property("consigneeMan", drec.getConsigneeMan())
		};
		
		String res = null;
		try(DeliveryRecordProxy dp = SdkFactory.getInstance().getDeliveryRecordProxy(operator)){
			res = dp.submitDeliveryRecord(drec.getDeliveryRecordFormId(), 
																		    drec.getName(), 
																		    drec.getDescription(), 
																		    drec.getOrderId(), 
																		    drec.getContractId(), 
																		    drec.getContractVersion(), 
																		    drec.getBuyerId(), 
																		    drec.getBuyerName(), 
																		    drec.getSellerId(), 
																		    drec.getSellerName(), 
																		    drec.getConsignerId(), 
																		    drec.getConsignerName(), 
																		    drec.getConsigneeId(), 
																		    drec.getConsigneeName(), 
																		    drec.getConsignerAddress(), 
																		    drec.getConsigneeAddress(), 
																		    drec.getQualityRecordIds(), 
																		    props, 
																		    drec.getGoods(), 
																		    drec.getAmount(), 
																		    drec.getRemarks(), 
																		    drec.getAttachments());
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public void updateDeliveryRecord(_DeliveryRecord drec, String operator) {
		// TODO Auto-generated method stub
		
	}

}
