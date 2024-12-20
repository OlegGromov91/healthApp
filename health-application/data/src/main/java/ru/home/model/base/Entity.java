package ru.home.model.base;

import java.io.Serializable;

public interface Entity extends Serializable {
    <I> I getId();

}
