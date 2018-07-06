package cn.edu.hqu.javaee.chapter7_1.repository;

import cn.edu.hqu.javaee.chapter7_1.domain.entity.Hquer;

public interface HquerRepository {
	public void save(Hquer hquer);
	public Hquer findByUserName(String userName);
	public void Administratorssave(Hquer hquer);
	public Hquer findByAdministratorsName(String AdministratorsName);
}
