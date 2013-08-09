package com.siampleblog.dao;

import com.siampleblog.model.BaseModel;
import com.siampleblog.model.Blog;
import com.siampleblog.model.Comment;
import com.siampleblog.model.User;

public class CommonDaoHelper {

	public static void main(String[] args) {
		new CommonDaoHelper().doMain();
	}
	
	private void doMain() {
//		createDbTables();
		GenericDao<Comment> dao = new GenericDao<Comment>(Comment.class);
		dao.reCreateTable();
	}

	public void createDbTables() {
		Class[] clzz = {User.class, Blog.class, Comment.class};
		GenericDao<BaseModel> dao;
		for (Class clz : clzz) {
			dao = new GenericDao<BaseModel>(clz);
			dao.dropTable();
			dao.createTable();
		}
	}

}
