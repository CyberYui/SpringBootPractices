package com.example.demo.Interface;

import com.example.demo.Entities.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

//If you see these words in control panel,that means this interface worked
//---------Found 1 Reactive MongoDB repository interfaces.
public interface UserRepository extends ReactiveMongoRepository<User,String> {

}
