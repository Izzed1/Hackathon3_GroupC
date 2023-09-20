package com.androidc.hackathon3.data

import com.androidc.hackathon3.model.Product

interface ProductDataSource {
    fun getPlanets(): List<Product>
}

class ProductDataSourceImpl() : ProductDataSource {
    override fun getPlanets(): List<Product> = listOf (
        Product(
            position = 1,
            name = "Banana",
            price = 18000,
            weight = 1,
            supplierName = "Banana Farm",
            rating = 4.9,
            desc = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            imgUrl = "https://raw.githubusercontent.com/hermasyp/CH3-asset-code-challenge/master/product_image/img_product_banana.jpg",
        ),
        Product(
            position = 2,
            name = "Apple",
            price = 19000,
            weight = 1,
            supplierName = "Apple Farm",
            rating = 4.8,
            desc = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            imgUrl = "https://raw.githubusercontent.com/hermasyp/CH3-asset-code-challenge/master/product_image/img_product_apple.jpg",
        ),
        Product(
            position = 3,
            name = "Onion",
            price = 12000,
            weight = 1,
            supplierName = "Onion Farm",
            rating = 4.6,
            desc = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            imgUrl = "https://raw.githubusercontent.com/hermasyp/CH3-asset-code-challenge/master/product_image/img_product_onion.jpg",
        ),
        Product(
            position = 4,
            name = "BSpinach",
            price = 12000,
            weight = 1,
            supplierName = "Spinach Farm",
            rating = 5.0,
            desc = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            imgUrl = "https://raw.githubusercontent.com/hermasyp/CH3-asset-code-challenge/master/product_image/img_product_spinach.jpg",
        ),
        Product(
            position = 5,
            name = "Pineapple",
            price = 12000,
            weight = 1,
            supplierName = "Pineapple Farm",
            rating = 4.0,
            desc = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            imgUrl = "https://raw.githubusercontent.com/hermasyp/CH3-asset-code-challenge/master/product_image/img_product_pineapple.jpg",
        ),
        Product(
            position = 6,
            name = "Cabbage",
            price = 14000,
            weight = 1,
            supplierName = "Cabbage Farm",
            rating = 4.7,
            desc = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            imgUrl = "https://raw.githubusercontent.com/hermasyp/CH3-asset-code-challenge/master/product_image/img_product_cabbage.jpg",
        ),
        Product(
            position = 7,
            name = "Carrot",
            price = 10000,
            weight = 1,
            supplierName = "Carrot Farm",
            rating = 4.6,
            desc = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            imgUrl = "https://raw.githubusercontent.com/hermasyp/CH3-asset-code-challenge/master/product_image/img_product_carrot.jpg",
        ),
        Product(
            position = 8,
            name = "Potato",
            price = 11000,
            weight = 1,
            supplierName = "Potato Farm",
            rating = 4.4,
            desc = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            imgUrl = "https://raw.githubusercontent.com/hermasyp/CH3-asset-code-challenge/master/product_image/img_product_potato.jpg",
        ),
        Product(
            position = 9,
            name = "Lemon",
            price = 8000,
            weight = 1,
            supplierName = "Lemon Farm",
            rating = 4.7,
            desc = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            imgUrl = "https://raw.githubusercontent.com/hermasyp/CH3-asset-code-challenge/master/product_image/img_product_lemon.jpg",
        ),
        Product(
            position = 10,
            name = "Pumpkin",
            price = 21000,
            weight = 1,
            supplierName = "Pumpkin Farm",
            rating = 4.7,
            desc = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            imgUrl = "https://raw.githubusercontent.com/hermasyp/CH3-asset-code-challenge/master/product_image/img_product_pumpkin.jpg",
        ),
    )
}