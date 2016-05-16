package com.benny.study;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

@Slf4j
public class CreateH2Database {
    @Autowired
    protected JdbcTemplate jdbcTemplate;

    public void create() {
        log.info("Creating H2 Database");
        createUsers();
    }

    private void createUsers() {
        log.info("Creating users table");
        jdbcTemplate.execute("create table if not exists users (id serial, first_name varchar(255), last_name varchar(255))");
        String[] names = "John Woo;Jeff Dean;Josh Bloch;Josh Long".split(";");
        for (String fullname : names) {
            String[] name = fullname.split(" ");
            log.info("Inserting user record for " + name[0] + " " + name[1] + "\n");
            jdbcTemplate.update(
                "INSERT INTO users(first_name,last_name) values(?,?)",
                name[0], name[1]);
            }
        }
    }