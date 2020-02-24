package com.egorowoodstore.dao;


import com.egorowoodstore.model.Cart;
import org.springframework.stereotype.Repository;

import java.io.IOException;

public interface CartDao {

    Cart getCartById (int cartId);

    Cart validate(int cartId) throws IOException;

    void update(Cart cart);
}
