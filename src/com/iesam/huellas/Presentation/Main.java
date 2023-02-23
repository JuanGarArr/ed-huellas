package com.iesam.huellas.Presentation;

import com.iesam.huellas.data.local.CatFileLocalDataSource;
import com.iesam.huellas.data.remote.CatApiRemoteDataSource;
import com.iesam.huellas.domain.Models.Cat;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        //CatDataRepository
        CatApiRemoteDataSource remoteDataSource = new CatApiRemoteDataSource();
        List<Cat> cats = remoteDataSource.getCats();

        CatFileLocalDataSource fileLocalDataSource = CatFileLocalDataSource.getInstance();
        fileLocalDataSource.saveList(cats);
    }
}