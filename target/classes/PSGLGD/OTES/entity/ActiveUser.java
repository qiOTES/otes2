package PSGLGD.OTES.entity;

import java.io.Serializable;
import java.util.List;

public class ActiveUser implements Serializable{
		private String userid;
		private String password;
		private List<Permission> menu;
		private List<Permission> permission;
		public String getUserid() {
			return userid;
		}
		public List<Permission> getMenu() {
			return menu;
		}
		public void setMenu(List<Permission> menu) {
			this.menu = menu;
		}
		public List<Permission> getPermission() {
			return permission;
		}
		public void setPermission(List<Permission> permission) {
			this.permission = permission;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
}
