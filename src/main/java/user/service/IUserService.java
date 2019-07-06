package user.service;

import java.util.List;

import user.entity.UserEntity;

public interface IUserService {

	public void addUser(UserEntity user);

	public List<UserEntity> getListUser();

	public void del(String id);

	public void update(String userName, String sex, String age, String province, String id);
}
