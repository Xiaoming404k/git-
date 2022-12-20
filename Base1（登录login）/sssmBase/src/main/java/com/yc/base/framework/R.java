package com.yc.base.framework;

import java.util.Date;
import java.util.HashMap;

import com.yc.base.utils.MD5;

public class R extends HashMap<String, Object> {

	public R() {
		put("code", 201);
		put("message", "操作成功");
		put("success", true);
	}

	public static R ok() {
		return new R();
	}

	public static R err() {
		R r = new R();
		r.put("code", 501);
		r.put("message", "操作失败");
		r.put("success", false);
		return r;
	}

	public R put(String key, Object value) {
		super.put(key, value);
		return this;
	}

	public static void main(String[] args) {
		 //System.out.println(R.ok().put("total", 11).put("user",new Date()));
		System.out.println(MD5.getMD5("123456"));
	}
}
