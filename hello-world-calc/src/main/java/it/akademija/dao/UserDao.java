package it.akademija.dao;

//import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.beans.factory.annotation.Autowired;
//import it.akademija.PagingData;
import it.akademija.users.User;


public interface UserDao extends JpaRepository<User, Long>{

//	List<User> getUsers();
//	void createUser(User user);
//	void deleteUser(String username);

	
}
