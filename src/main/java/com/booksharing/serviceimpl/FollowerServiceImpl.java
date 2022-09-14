package com.booksharing.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booksharing.entity.Followers;
import com.booksharing.repository.FollowerRepo;
import com.booksharing.services.FollowerService;

@Service
public class FollowerServiceImpl implements FollowerService {
	@Autowired
	private FollowerRepo followerRepo;

	public Followers addFollower(Followers entity) {
		return this.followerRepo.save(entity);
	}

	public int countFollower(int id) {
		return this.followerRepo.countFollower(id);
	}

}
