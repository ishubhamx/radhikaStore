package com.citbit.in.grocerystore.api;


import com.citbit.in.grocerystore.model.Category;
import com.citbit.in.grocerystore.model.CategoryResult;
import com.citbit.in.grocerystore.model.Order;
import com.citbit.in.grocerystore.model.OrdersResult;
import com.citbit.in.grocerystore.model.PlaceOrder;
import com.citbit.in.grocerystore.model.ProductResult;
import com.citbit.in.grocerystore.model.Token;
import com.citbit.in.grocerystore.model.User;
import com.citbit.in.grocerystore.model.UserResult;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * RetrofitExample
 * https://github.com/quintuslabs/RetrofitExample
 * Created on 18-Feb-2019.
 * Created by : Santosh Kumar Dash:- http://santoshdash.epizy.com
 */

public interface RestService {

    @POST("api/v1/auth/register")
    Call<UserResult> register(@Body User user);

    @POST("api/v1/auth/login")
    Call<UserResult> login(@Body User user);

    @POST("api/v1/category/getAllCategories")
    Call<CategoryResult> allCategory(@Header("Authorization") String token);

    @POST("api/v1/product/newProduct")
    Call<ProductResult> newProducts(@Header("Authorization") String token);

    @POST("api/v1/product/homepage")
    Call<ProductResult> popularProducts(@Header("Authorization") String token);

    @POST("api/v1/product/getProductsByCategory")
    Call<ProductResult> getCategoryProduct(@Header("Authorization") String token, @Body Category category);

    @POST("api/v1/order/placeorder")
    Call<OrdersResult> confirmPlaceOrder(@Header("Authorization") String token, @Body PlaceOrder placeOrder);

    @POST("api/v1/order/orderDetails")
    Call<OrdersResult> orderDetails(@Header("Authorization") String token, @Body Order order);

    @POST("api/v1/auth/updateUser")
    Call<UserResult> updateUser(@Header("Authorization") String token, @Body User user);

    @GET("api/v1/product/search")
    Call<ProductResult> searchProduct(@Header("Authorization") String token, @Query("s") String search);
}
