package org.segun;

import org.junit.jupiter.api.BeforeEach;

class StoreSalesTest {
    private static User myUser;
    private static Product myProduct;
    private static StoreSales mySales;
    private static StoreStock myStock;


    @BeforeEach
    void setUp() {
        myUser = new User("Olaide", Roles.CUSTOMER);
        myUser.loadWallet(1000.0);
        myProduct = new Product("crackers", "Whole Wheat", 200, (3.49 * 200));
        myStock = new StoreStock();
        myStock.reStock();
        mySales = new StoreSales(myStock);
    }

//    @Test
//    void sell() {
//        assertEquals(myProduct, mySales.sell(myUser, "Whole Wheat", 200));
//    }
}
