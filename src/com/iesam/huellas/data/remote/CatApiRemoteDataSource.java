package com.iesam.huellas.data.remote;

import com.iesam.huellas.app.api.ApiClient;
import com.iesam.huellas.domain.Models.Cat;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;

public class CatApiRemoteDataSource {

    private ApiClient apiClient = new ApiClient();

    public List<Cat> getCats() {
        try {
            Response List<Cat> response = apiClient.apiService.getCats().execute();
            if (response.isSuccessful()) {
                return response.body();
            } else {
                throw new RuntimeException();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
