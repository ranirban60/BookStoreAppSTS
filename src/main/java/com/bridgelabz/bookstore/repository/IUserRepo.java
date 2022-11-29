package com.bridgelabz.bookstore.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.bookstore.model.UserModel;

@Repository
public interface IUserRepo extends JpaRepository<UserModel, Long> {

	boolean findByEmail(boolean empty);

	Optional<UserModel> findByEmail(String email);

	Optional<UserModel> findByEmailAndPassword(String email, String password);

	Optional<UserModel> findByPassword(String password);




}
