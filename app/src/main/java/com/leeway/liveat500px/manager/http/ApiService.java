package com.leeway.liveat500px.manager.http;

import com.leeway.liveat500px.dao.PhotoItemCollectionDao;

import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by Lee Lorz on 1/17/2017.
 */

public interface ApiService {

    @POST("list")
    Call<PhotoItemCollectionDao> loadPhotoList();

}
