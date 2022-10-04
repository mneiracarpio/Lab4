package ca.sait.services;

import ca.sait.models.User;

/**
 * Service Provider for account
 * @author Marco
 */
public class AccountService {
    
    public AccountService() {

    }
    
    /**
    *   
    *   Login a user
    *   @param username Username
    *   @param password Password
    *   @return User instance if login credentials are correct, or null
    */
    public User login(String username, String password) {
        if ( "abe".equals(username) && "password".equals(password)){
            User user = new User(username,password);
            return user;
        } else if ( "barb".equals(username) && "password".equals(password)){
            User user = new User(username,password);
            return user;
        } else {
            return null;
        }
    }
    
}
