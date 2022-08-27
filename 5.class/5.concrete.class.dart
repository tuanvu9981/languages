class Product {
  String name = '';
  String madeIn = '';
  var maker;
  double price = 0;
  var _MACAddress;

  Product(
      var maker, String name, String madeIn, double price, String MACAddress) {
    this.name = name;
    this.madeIn = madeIn;
    this.maker = maker;
    this.price = price;
    this._MACAddress = MACAddress;
  }

  set productName(String name) {
    this.name = name;
  }

  set productPrice(double price) {
    this.price = price;
  }

  get productMaker {
    return this.maker;
  }

  double get productPrice {
    return this.price;
  }

  printInfo() {
    print("Product: ${this.name}");
    print("\t+ maker: ${this.maker}");
    print("\t+ made in: ${this.madeIn}");
    print("\t+ price: ${this.price} \$");
  }
}

void main() {
  var phone = new Product(
      "Xiaomi Group", "Xiaomi Note 11", "China", 250.67, '123.432.42');
  phone.printInfo();

  phone.productPrice = 260.87; //setter
  print("New price: ${phone.productPrice}"); //getter
}
