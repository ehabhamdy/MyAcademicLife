package ehab.com.myacademiclife.model;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by Ehab on 10/22/2016.
 */


@IgnoreExtraProperties
public class User {

    private String username;
    private String gradeYear;


    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String username) {
        this.username = username;
    }

    public User(String username, String gradeYear){
        this.username = username;
        this.gradeYear = gradeYear;
    }
}