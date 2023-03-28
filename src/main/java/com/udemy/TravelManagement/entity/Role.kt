package com.udemy.TravelManagement.entity

import com.udemy.TravelManagement.entity.common.AbstractEntity
import org.springframework.security.core.GrantedAuthority
import javax.persistence.Entity
import javax.persistence.ManyToMany

@Entity
class Role : AbstractEntity(), GrantedAuthority {
    var name: String? = null

    @ManyToMany(mappedBy = "roles")
    var users: Set<User>? = null
    override fun getAuthority(): String {
        return name!!
    }
}