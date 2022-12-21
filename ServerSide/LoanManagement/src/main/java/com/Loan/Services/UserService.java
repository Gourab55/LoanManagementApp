//package com.Loan.Services;
//
//import java.util.HashSet;
//import java.util.Set;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.Loan.Models.Role;
//import com.Loan.Models.User;
//
//@Service
//public class UserService {
//	
//	@Autowired
//	private IUserRepo iuserRepo;
//	
//	@Autowired
//	private IRoleDao iroleDao;
//	
//	public User registerNewUser(User user) {
//		
//		return iuserRepo.save(user);	
//	}
//	public void initRoleAndUser() {
//		
//		Role adminRole= new Role();
//		adminRole.setRole_name("Admin");
//		adminRole.setRole_desc("Admin role");
//		iroleDao.save(adminRole);
//		
//		Role userRole= new Role();
//		userRole.setRole_name("User");
//		userRole.setRole_desc("Default role for newly created record");
//		iroleDao.save(userRole);
//		
//		User adminUser= new User();
//		adminUser.setUsername("admin");
//		adminUser.setPassword("admin@pass");
//		Set<Role> adminRoles= new HashSet<>();
//		adminRoles.add(adminRole);
//		adminUser.setRole(adminRoles);
//		iuserRepo.save(adminUser);
//		
//		User user= new User();
//		user.setUsername("raj");
//		user.setPassword("raj@123");
//		Set<Role> userRoles= new HashSet<>();
//		userRoles.add(userRole);
//		user.setRole(userRoles);
//		iuserRepo.save(user);
//		
//		
//		
//		
//		
//		
//		
//		
//	}
//   
//}
