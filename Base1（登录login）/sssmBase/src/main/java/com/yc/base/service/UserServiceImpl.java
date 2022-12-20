package com.yc.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.base.dao.UserModelMapper;
import com.yc.base.entity.UserModel;
import com.yc.base.entity.UserModelExample;
import com.yc.base.entity.UserModelExample.Criteria;
import com.yc.base.framework.BaseDao;
import com.yc.base.framework.BaseServiceImpl;
import com.yc.base.framework.R;
import com.yc.base.utils.MD5;

@Service
public class UserServiceImpl extends BaseServiceImpl<UserModel, UserModelExample> implements UserService {
	@Autowired
	private UserModelMapper userDao;

	@Override
	protected BaseDao<UserModel, UserModelExample> getDao() {
		return userDao;
	}

	@Override
	public R login(UserModel u) {
		UserModelExample ue = new UserModelExample();
		Criteria c = ue.createCriteria();
		c.andUsernameEqualTo(u.getUsername());
		List<UserModel> us = userDao.selectByExample(ue);
		if (us != null && us.size() == 1) {
			UserModel ut = us.get(0);
			if (MD5.getMD5(u.getPassword()).equals(ut.getPassword())) {
				ut.setPassword(null);
				return R.ok().put("token", "x.xx.xxx").put("user", ut);
			}

		}
		return R.err().put("message", "用户名或密码错误");
	}

}
