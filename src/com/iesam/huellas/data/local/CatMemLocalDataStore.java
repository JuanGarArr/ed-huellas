package com.iesam.huellas.data.local;

import com.iesam.huellas.domain.Models.Cat;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
public class CatMemLocalDataStore implements CatLocalDataSource{

    private static CatMemLocalDataStore instance = null;

    private Map<Integer, Cat> storage = new TreeMap<>();

    private CatMemLocalDataStore() {

    }

    public void save(Cat cat) {
        storage.put(cat.getId(), cat);
    }

    public Cat findById(Integer idCat) {
        return storage.get(idCat);
    }

    public List<Cat> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void delete(Integer idCat) {

    }


    public static CatMemLocalDataStore getInstance() {

        if (instance == null) {
            instance = new CatMemLocalDataStore();
        }
        return instance;
    }
}
