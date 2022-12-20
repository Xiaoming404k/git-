package com.yc.base.service;

import com.yc.base.entity.UserModel;
import com.yc.base.entity.UserModelExample;
import com.yc.base.framework.BaseService;
import com.yc.base.framework.R;

public interface UserService extends BaseService<UserModel, UserModelExample> {

	R login(UserModel u);

}
