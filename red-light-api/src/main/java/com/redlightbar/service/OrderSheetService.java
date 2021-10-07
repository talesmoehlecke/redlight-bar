package com.redlightbar.service;

import com.redlightbar.model.OrderSheet;

public interface OrderSheetService {
    OrderSheet saveOrderSheet(OrderSheet orderSheet);
    OrderSheet findById(long id);

}
