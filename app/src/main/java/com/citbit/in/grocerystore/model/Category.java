package com.citbit.in.grocerystore.model;

/**
 * Grocery App
 * https://github.com/quintuslabs/GroceryStore
 * Created on 18-Feb-2019.
 * Created by : Santosh Kumar Dash:- http://santoshdash.epizy.com
 */
public class Category {
    String id;
    String name;
    String image;
    String token;
    Boolean hasSubCategory;

    public Category(String id, String categry, String image, Boolean hasSubCategory) {
        this.id = id;
        this.name = categry;
        this.image = image;
        this.hasSubCategory = hasSubCategory;
    }

    public Category(String categry, String token) {
        this.name = categry;
        this.token = token;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategry() {
        return name;
    }

    public void setCategry(String name) {
        this.name = name;
    }

    public String getCateimg() {
        return image;
    }

    public void setCateimg(String image) {
        this.image = image;
    }
}
