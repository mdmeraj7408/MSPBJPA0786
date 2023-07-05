package com.springboot.jpa;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.jpa.dao.UserRepository;
import com.springboot.jpa.entity.User;

@SpringBootApplication
public class SpringBootJpaApplication {

	public static void main(String[] args) {
		 ConfigurableApplicationContext context = SpringApplication.run(SpringBootJpaApplication.class, args);
        UserRepository repository = context.getBean(UserRepository.class);
        /*User user = new User(); 
		
		 * user.setName("Meraj"); user.setCity("Lucknow");
		 * user.setStatus("I am java Developer"); User save = repository.save(user);
		 * System.out.println(save);
		 * System.out.println("SpringBootJpaApplication.main()");
		 * 
		 * create user Object User user=new User(); user.setName("AMir");
		 * user.setCity("Lko"); user.setStatus("C# programmer");
		 * 
		 * User user1=new User(); user1.setName("Zunaid"); user1.setCity("Faizabad");
		 * user1.setStatus("UI Programmer"); List<User> users = List.of(user,user1);
		 * Iterable<User> all = repository.saveAll(users); all.forEach(user2->{
		 * System.out.println(user2); });
		 */
        //update id 1
        
		/*
		 * Optional<User> byId = repository.findById(1); User user = byId.get();
		 * System.out.println(user); user.setName("Ankit"); User result =
		 * repository.save(user); System.out.println(result);
		 */
	
//get all user
	Iterable<User> all = repository.findAll();
	/*
	 * Iterator<User> iterator = all.iterator(); while(iterator.hasNext()) { User
	 * next = iterator.next(); System.out.println(next); }
	 */
	/*
	 * all.forEach(new Consumer<User>() {
	 * 
	 * @Override public void accept(User t) { System.out.println(t); }
	 * 
	 * });
	 */
	/*
	 * delete user ById repository.deleteById(53); System.out.println("deleted");
	 */
/*repository.deleteAll(all);*/

	all.forEach(user->{System.out.println(user);});
	
	}

}
