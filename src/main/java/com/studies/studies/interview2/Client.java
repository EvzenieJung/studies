package com.studies.studies.interview2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Client {

    static Logger logger = Logger.getLogger(Client.class.getName());

    static List<String> sourceUserList = Arrays.asList("name;Alex", "name;John", "name;Bob", "name;Cate", "name;Alice");
    static String sourceUserList2 = "name;Alex, name;John, name;Bob";

    public static void main(String[] args) {
       //interviewTask(sourceUserList);
       interviewTask2(sourceUserList2);
    }


    /**
     * 1. Create class User with unique id (data type is up to you) and name type String
     * 2. Use variable sourceUserList to create collection that contain all users with unique IDs
     * 3. Write all usernames to output with Uppercase letters.
     * 4. Sort created collections by name.
     * @param sourceUserList
     */
    private static void interviewTask(List<String> sourceUserList) {

        List<User> users = new ArrayList<>();
        for (String userString : sourceUserList) {
            String name = userString.split(";")[1];
            User user = new User(name);
            users.add(user);
        }


        users.sort((u1, u2) -> u1.getName().compareToIgnoreCase(u2.getName()));
        users.forEach(user -> System.out.println(user.getName().substring(0,1).toUpperCase() + user.getName().substring(1)));
        System.out.println("---------------------------------");
        users.forEach(user -> logger.info(user.getName().substring(0,1).toUpperCase() + user.getName().substring(1)));
    }

    private static void interviewTask2(String sourceUserList2) {
        List<User> users = new ArrayList<>();

        Pattern pattern = Pattern.compile("name;(\\w+)");

        Matcher matcher = pattern.matcher(sourceUserList2);
        while(matcher.find()) {
            String name = matcher.group(1);
            User user = new User(name);
            users.add(user);
        }
        users.sort((u1, u2) -> u1.getName().compareToIgnoreCase(u2.getName()));
        users.forEach(user -> System.out.println("ID: " + user.getId() + ", Name: " + user.getName().substring(0,1).toUpperCase() + user.getName().substring(1)));
    }

    static class User {
        private UUID id;

        private int anotherId;
        private String name;

        private static int nextId = 1;

        User(String name) {
            this.name = name;
            this.id = UUID.randomUUID();
            this.anotherId = nextId++;
        }

        public UUID getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }
}

