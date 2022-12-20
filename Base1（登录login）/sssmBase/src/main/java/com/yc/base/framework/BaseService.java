package com.yc.base.framework;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BaseService<T, TE> {
	long countByExample(TE example);

	int deleteByExample(TE example);

	int deleteByPrimaryKey(Integer id);

	int insert(T record);

	int insertSelective(T record);

	List<T> selectByExample(TE example);

	T selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") T record, @Param("example") TE example);

	int updateByExample(@Param("record") T record, @Param("example") TE example);

	int updateByPrimaryKeySelective(T record);

	int updateByPrimaryKey(T record);

}
