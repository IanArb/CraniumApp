package com.cranium.ianarbuckle.craniumapp.Login;

/**
 * Date 15/04/2015
 * Author: Ian Arbuckle
 * Reference: http://stackoverflow.com/questions/22209046/fix-android-studio-login-activity-template-generated-activity
 */
public class User {

    public long userId;
    public String username;
    public String password;

    public User(long userId, String username, String password) {
        this.userId = userId;
        this.username = username;
        this.password = password;
    }
}
