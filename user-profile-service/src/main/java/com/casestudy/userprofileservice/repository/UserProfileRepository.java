package com.casestudy.userprofileservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.casestudy.userprofileservice.entity.UserProfile;

@Repository
public interface UserProfileRepository extends MongoRepository<UserProfile, Integer> {



//	public UserProfile findByUserName(String uName);
//
//	public List<UserProfile> findByMobileNumber(long mobile);
}

	