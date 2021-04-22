package ru.valaubr.models;

import ru.valaubr.enums.Permissions;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CatalogWhiteList {
    private Long id;
    private User user;
    private Catalog catalog;
    private Permissions permissions;
}
