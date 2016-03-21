package com.company;

import java.util.Arrays;

import static com.company.Const.MIN_WORKERS_AGE;
import static com.company.Const.MAX_WORKERS_AGE;

public class Recurt implements AutoCloseable{
    private int max = 2;
    private User[] employee = new User[max];
    private int count =0;


    public boolean recurte(User user){
        check(user);
        if(user.getAge() <45){
            return rec(user);
        } else {
            return false;
        }

    }

    public boolean recurteByGender(User user, Gender gender){
        check(user);
        Gender userGender = user.getGender();
        if (userGender.equals(gender)){
            return rec(user);
        }
        throw new NotApplicableGender(gender.toString(), userGender.toString());
    }

    private void check(User user){
        if(user == null){
            throw new NullPointerException("User can't be null");
        }
        int age  = user.getAge();
        if(age < MIN_WORKERS_AGE || age > MAX_WORKERS_AGE){
            throw new IllegalWorkerAgeException(String.format("Wokers age might be betwen %s and %s not applicable %s", MIN_WORKERS_AGE, MAX_WORKERS_AGE, age));
        }
    }

    private boolean rec(User user){
        if(count < max-1) {
            employee[count] = user;
            count++;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Recurt{" +
                "employee=" + Arrays.toString(employee) +
                ", count=" + count +
                '}';
    }

    @Override
    public void close() throws Exception {
        employee = null;
    }
}
