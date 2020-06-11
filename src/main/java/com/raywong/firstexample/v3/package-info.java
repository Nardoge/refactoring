/**
 *     1. 增加 htmlStatement 方法，由于抽离了计算的代码，所以增加新的 htmlStatement 方法变得很容易
 *     2. 将 getCharge ， getFrequentRenterPoints 两个方法抽离出 Rental ，放到 Movie 中。因为 Movie 在未来是
 *        可能不断变化的封装在 Movie 内，可以减少影响。所以选择在 Movie 内计算费用。
 *     3. 引入State 模式，引入 Price 类 ，通过 Price 类进行子类化操作，时刻修改价格。
 *     4.将 getCharge 方法从 Movie 类抽离到 Price ，并将 Price 的 getCharge 方法的具体实现下放到各个子类中。
 *     5.getFrequentRenterPoints 方法从 Movie抽离到 Price 中。
 *     6.将计算积分的行为，留一个在默认，然后通过子类覆盖。
 */
package com.raywong.firstexample.v3;