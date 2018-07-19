package br.com.rdg.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("account")
public class AccountController {

    @GetMapping
    public Set<String> findAll() {
        Set<String> users = new HashSet<>();
        users.add("Danilo");
        users.add("Renata");
        users.add("Sandra");
        users.add("José");
        users.add("Wellington");
        users.add("Josy");
        users.add("Gustavo");
        return users;
    }
}