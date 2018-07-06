package cn.edu.hqu.javaee.chapter7_1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.hqu.javaee.chapter7_1.domain.entity.Hquer;
import cn.edu.hqu.javaee.chapter7_1.repository.HquerRepository;
import cn.edu.hqu.javaee.chapter7_1.service.HquerService;

@Service
public class HquerServiceImpl implements HquerService{
	@Autowired
	HquerRepository hquerRepository;

	@Override
	public Hquer login(String userName, String password) {
		Hquer hquer;
		
		if((hquer=hquerRepository.findByUserName(userName))!=null 
				&& hquer.getPassword().equals(password)) {
			System.out.println(hquer.getUserName());
			return hquer;
		}
		return null;
	}

	@Override
	public boolean register(Hquer hquer) {
		if((hquerRepository.findByUserName(hquer.getUserName()))==null) {
			hquerRepository.save(hquer);
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Hquer getUserDetail(String userName) {
		return hquerRepository.findByUserName(userName);
	}
	
	
	@Override
	public Hquer login(String AdministratorsName, String password) {
		Hquer hquer;
		
		if((hquer=hquerRepository.findByUserName(AdministratorsName))!=null 
				&& hquer.getPassword().equals(password)) {
			System.out.println(hquer.getAdministratorsName());
			return hquer;
		}
		return null;
	}

	@Override
	public boolean register(Hquer hquer) {
		if((hquerRepository.findByUserName(hquer.getAdministratorsName()))==null) {
			hquerRepository.save(hquer);
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Hquer getUserDetail(String AdministratorsName) {
		return hquerRepository.findByUserName(AdministratorsName);
	}

}
