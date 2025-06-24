package in.rahul.SuperSport.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.rahul.SuperSport.entity.UserEntity;
import java.util.Optional;



public interface UserRepository extends JpaRepository<UserEntity, Long>{

    Optional<UserEntity> findByEmail(String email);
    
    Boolean existsByEmail(String email);
    
    // Optional<UserEntity> findByUserId(String userId);
}
