package com.yc.base.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.base.dao.ProductModelMapper;
import com.yc.base.entity.ProductModel;
import com.yc.base.entity.ProductModelExample;
import com.yc.base.framework.BaseDao;
import com.yc.base.framework.BaseServiceImpl;

@Service
public class ProductServiceImpl extends BaseServiceImpl<ProductModel, ProductModelExample> implements ProductService {

	@Autowired
	private ProductModelMapper productDao;  

	@Override
	protected BaseDao<ProductModel, ProductModelExample> getDao() {
		return productDao;
	}

}
