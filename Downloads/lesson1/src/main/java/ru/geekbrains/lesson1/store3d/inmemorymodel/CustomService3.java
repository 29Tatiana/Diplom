package ru.geekbrains.lesson1.store3d.inmemorymodel;

public class CustomService3 implements ModelChangedObserver {
    @Override
    public void applyUpdateModel() {
        // TODO: Реагирует на изменение в хранилище моделей ...
        System.out.println("CustomService3 reacted on model changed");
    }
}