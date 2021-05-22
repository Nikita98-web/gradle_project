package com.cg.Laundry_app.repository;

import com.cg.Laundry_app.exception.NotFoundException;
import com.cg.Laundry_app.models.User;

public interface IUserRepository {
	User signIn(User user)throws NotFoundException;
	User signOut(User user);
	User changePassword(long id, User user)throws NotFoundException;
}
