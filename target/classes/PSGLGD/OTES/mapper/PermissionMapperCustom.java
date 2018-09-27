package PSGLGD.OTES.mapper;

import java.util.List;

import PSGLGD.OTES.entity.Permission;

public interface PermissionMapperCustom {
		public List<Permission> findMenuByid(String userid);
}
