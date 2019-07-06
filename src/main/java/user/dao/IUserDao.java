package user.dao;

import org.springframework.stereotype.Repository;
import user.entity.UserEntity;

@Repository(value="userDao")
public class IUserDao extends BasicDao<UserEntity>{
	
	
}
