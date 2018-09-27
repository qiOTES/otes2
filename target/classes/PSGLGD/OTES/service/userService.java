package PSGLGD.OTES.service;

import java.util.List;

import PSGLGD.OTES.entity.ActiveUser;
import PSGLGD.OTES.entity.Permission;
import PSGLGD.OTES.entity.User;

public interface userService {
		public ActiveUser authenticat(String userid,String password)throws Exception;
		public User findUserByuserid(String userid)throws Exception;
		public List<Permission> findMenuByid(String userid)throws Exception;
		public List<Permission> findPermissionByid(String userid)throws Exception;
}
