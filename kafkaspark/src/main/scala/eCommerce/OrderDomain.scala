// OrderDomain.scala
package eCommerce

/*
Sample Data:
1,101,John Smith,201,Pen,Stationery,Card,24,10,2021-01-10 10:12,India,Mumbai,www.amazon.com,36766,Y,
2,102,Mary Jane,202,Pencil,Stationery,Internet Banking,36,5,2021-10-31 13:45,USA,Boston,www.flipkart.com,37167,Y,
3,103,Joe Smith,203,Some mobile,Electronics,UPI,1,4999,2021-04-23 11:32,UK,Oxford,www.tatacliq.com,90383,Y,
4,104,Neo,204,Some laptop,Electronics,Wallet,1,59999,2021-06-13 15:20,India,Indore,www.amazon.in,12224,N,Invalid CVV.
5,105,Trinity,205,Some book,Books,Card,1,259,2021-08-26 19:54,India,Bengaluru,www.ebay.in,99958,Y,
*/

import java.sql.Timestamp

object Domain {
  case class OrderRecord(transactionTimestamp: Timestamp, order_id: String, datetime: String,
    customer_id: Int, customer_name: String, 
    product_id: Int, product_name: String, product_category: String, qty: Int, price: Double, amount: Double,
    country: String, city: String, ecommerce_website_name: String, payment_type: String, 
    payment_txn_id: String, payment_txn_success: String, failure_reason: String)
}
