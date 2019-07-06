package user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.dao.IUserDao;
import user.entity.UserEntity;
import user.service.IUserService;

@Service(value = "userService")
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;

	public void addUser(UserEntity user) {
		userDao.savaObject(user);
	}

	public List<UserEntity> getListUser() {

		return userDao.findHQLList();
	}

	public void del(String id) {
		userDao.delObject(id);

	}

	public void update(String userName, String sex, String age, String province, String id) {
		String hql = "update UserEntity set userName=?,sex=?,age=?,province=?where id=?";
		userDao.updateHQL(hql, new String[] { userName, sex, age, province, id });
	}

}
