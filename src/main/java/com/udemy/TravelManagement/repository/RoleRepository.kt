package com.udemy.TravelManagement.repository

import com.udemy.TravelManagement.entity.Role
import org.springframework.data.jpa.repository.JpaRepository

interface RoleRepository : JpaRepository<Role?, Long?>