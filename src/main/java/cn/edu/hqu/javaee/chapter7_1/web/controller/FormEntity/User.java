package cn.edu.hqu.javaee.chapter7_1.web.controller.FormEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class User {
	@Getter
	@Setter
	String userName;
	@Getter
	@Setter
	String password;

};
