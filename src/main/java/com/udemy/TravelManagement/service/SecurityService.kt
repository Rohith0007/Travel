package com.udemy.TravelManagement.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.stereotype.Service

@Service
class SecurityService {
    @Autowired
    var userDetailsService: UserDetailsServiceImpl? = null

    @Autowired
    var authenticationManager: AuthenticationManager? = null
    fun login(username: String, password: String?): Boolean {
        var state = false
        val userDetails = userDetailsService!!.loadUserByUsername(username)
        val token = UsernamePasswordAuthenticationToken(userDetails, password, userDetails!!.authorities)
        authenticationManager!!.authenticate(token)
        state = token.isAuthenticated
        if (state) {
            SecurityContextHolder.getContext().authentication = token
        }
        return state
    }
}