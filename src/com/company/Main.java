package com.company;

import static com.company.Gender.FEMALE;
import static com.company.Gender.MALE;

public class Main {

    public static void main(String[] args) {
        User user1 = new User(FEMALE, 34);
        User user2 = new User(MALE, 4);
        User user3 = new User(MALE, 70);
        User user4 = new User(FEMALE, 20);
        User user5 = new User(MALE, 14);

        try (Recurt recurt = new Recurt()) {
            recurte(recurt, user1);
            recurte(recurt, user2);
            recurte(recurt, user3);
            recurte(recurt, user4);
            recurte(recurt, user5);
            recurte(recurt, null);

            System.out.println(recurt);
        } catch (Exception e) {
            System.out.println(e);
        }


    }

    public static void recurte(Recurt recurt, User user) {
        try {
            recurt.recurteByGender(user, MALE);
        } catch (IllegalWorkerAgeException e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (NotApplicableGender e) {
            System.out.println("found another works " + e);
        }
    }

}
