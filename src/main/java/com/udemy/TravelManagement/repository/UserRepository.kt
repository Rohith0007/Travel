package com.udemy.TravelManagement.repository

import com.udemy.TravelManagement.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User?, Long?> {
    fun findByEmail(email: String?): User?
}