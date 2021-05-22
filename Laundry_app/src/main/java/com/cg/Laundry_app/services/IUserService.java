package com.cg.Laundry_app.services;

import com.cg.Laundry_app.exception.*;
import com.cg.Laundry_app.models.*;

public interface IUserService {
	User signIn(User user) throws NotFoundException;
	User signOut(User user);
	User changePassword(long id, User user)throws NotFoundException;
}
