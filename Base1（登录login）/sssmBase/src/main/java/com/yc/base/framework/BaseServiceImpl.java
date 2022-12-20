package com.yc.base.framework;

import java.util.List;

public abstract class BaseServiceImpl<T, TE> implements BaseService<T, TE> {

	protected abstract BaseDao<T, TE> getDao();

	@Override
	public long countByExample(TE example) {
		return getDao().countByExample(example);
	}

	@Override
	public int deleteByExample(TE example) {
		return getDao().deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return getDao().deleteByPrimaryKey(id);
	}

	@Override
	public int insert(T record) {
		return getDao().insert(record);
	}

	@Override
	public int insertSelective(T record) {
		return getDao().insertSelective(record);
	}

	@Override
	public List<T> selectByExample(TE example) {
		return getDao().selectByExample(example);
	}

	@Override
	public T selectByPrimaryKey(Integer id) {
		return getDao().selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(T record, TE example) {
		return getDao().updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(T record, TE example) {
		return getDao().updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(T record) {
		return getDao().updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(T record) {
		return getDao().updateByPrimaryKey(record);
	}

}
