package ru.yandex.practicum.catsgram.model;

import lombok.*;

import java.time.Instant;

@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "id")
public class Post {
    Long id;
    Long authorId;
    String description;
    Instant postDate;
}
