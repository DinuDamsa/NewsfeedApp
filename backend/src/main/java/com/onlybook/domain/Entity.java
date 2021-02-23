package com.onlybook.domain;

import java.io.Serializable;

public interface Entity<ID extends Serializable> extends Serializable {
    ID getId();
}