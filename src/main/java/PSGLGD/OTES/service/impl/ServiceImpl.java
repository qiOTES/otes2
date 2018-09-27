package PSGLGD.OTES.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import PSGLGD.OTES.entity.ActiveUser;
import PSGLGD.OTES.entity.Permission;
import PSGLGD.OTES.entity.User;
import PSGLGD.OTES.entity.UserExample;
import PSGLGD.OTES.exception.CustomException;
import PSGLGD.OTES.mapper.PermissionMapperCustom;
import PSGLGD.OTES.mapper.UserMapper;
import PSGLGD.OTES.service.userService;
import PSGLGD.OTES.util.MD5;

public class ServiceImpl implements userService {
	@Autowired
	private UserMapper usermapper;
	@Autowired 
	private PermissionMapperCustom permissionmappercustom;
	public ActiveUser authenticat(String userid, String password) throws Exception {
		User user = this.findUserByuserid(userid);
		if (user == null) {
			throw new CustomException("该用户不存在");
		}
		String password_db = user.getPassword();
		String password_input = new MD5().getMD5ofStr(password);
		if (!password_db.equals(password_input)) {
			throw new CustomException("用户名或密码错误");
		}
		String usercode = user.getUserId();
		List<Permission> menu = this.findMenuByid(userid);
		ActiveUser acuser = new ActiveUser();
		acuser.setUserid(userid);

		acuser.setMenu(menu);
		return acuser;
	}

	public User findUserByID(String userid) {
		UserExample userexample = new UserExample();
		UserExample.Criteria criteria = userexample.createCriteria();
		criteria.andUserIdEqualTo(userid);
		List<User> list = usermapper.selectByExample(userexample);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}
	@Override
	public List<Permission> findMenuByid(String userid)throws Exception{
		return permissionmappercustom.findMenuByid(userid);
	}

	@Override
	public User findUserByuserid(String userid) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Permission> findPermissionByid(String userid) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}