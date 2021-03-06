package com.ddd.validation.infrastructure;

import com.ddd.validation.domain.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Component
public class InMemoryUserStorage {

    private final List<User> storage = new ArrayList<>();

    void add(User user) {
        storage.add(user);
    }

    Stream<User> stream() {
        return storage.stream();
    }
}
