/**
 * 
 */
package com.project.fooddelivery.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.fooddelivery.entity.FDUsers;

/**
 * @author Ronny
 *
 */
@Repository
public interface UserRepository extends JpaRepository<FDUsers, Long>{

}