abstract class Media {
  var price;
  var publisher;

  Media(double price, String publisher) {
    this.price = price;
    this.publisher = publisher;
  }

  set mediaPrice(double newPrice) {
    this.price = newPrice;
  }

  double get mediaPrice {
    return this.price;
  }

  // abstract method
  printInfo() {}
}

/* ****************************************************************************** */

class Magazine extends Media {
  var magazineName;
  var magazineType;

  Magazine(String name, double price, String publisher) : super(price, publisher) {
    this.magazineName = name;
    setTypeFromMagazineName(this.magazineName);
  }

  setTypeFromMagazineName(String name){
    switch(name){
      case "Vogue": {
        this.magazineType = "fashion";
        break;
      }
      case "Nature": {
        this.magazineType = "science";
        break;
      }
      case "Dan Tri": {
        this.magazineType = "general";
        break;
      }
      default: {
        this.magazineType = "unidentified";
        break;
      }
    }
  }

  @override
  printInfo() {
    print("Magazine: ${this.magazineName}");
    print("\t+ Publisher: ${this.publisher}");
    print("\t+ Type: ${this.magazineType}");
    print("\t+ Price: ${this.price} \$");
  }
}

/* ****************************************************************************** */

class Picture {
  var imageUrl;
  var description;
  var name;

  // Picture(String imageUrl, String description, String name){
  //   this.imageUrl = imageUrl;
  //   this.description = description;
  //   this.name = name;
  // }

  set imageUrlPicture(String url){
    this.imageUrl = url;
  }

  set namePicture(String name){
    this.name = name;
  }

  set descriptionPicture(String description){
    this.description = description;
  }

  showPicture(){
    print("Picture: ${this.name}");
    print("\t+ Link: ${this.imageUrl}");
    print("\t+ Description: ${this.description}");
  }
}

class Book extends Media with Picture {
  var bookName;
  var author;
  var picture = new Picture();

  Book(String author, double price, String bookName, String publisher):super(price, publisher){
    this.author = author;
    this.bookName = bookName;

    // DIRECT ASSIGN
    this.picture.name = "solar_system.png";
    this.picture.imageUrl = "https://imageonline/solar/solar_system.png";
    this.picture.description = "A picture about whole solar system";
  }

  @override
  printInfo() {
    print("\nBook: ${this.bookName}");
    print("\t+ Publisher: ${this.publisher}");
    print("\t+ Price: ${this.price} \$");
    print("\t+ Picture: ${this.picture.name} ");
    print("\t\t+ Url: ${this.picture.imageUrl} ");
    print("\t\t+ Description: ${this.picture.description} ");
  }
}

/* ****************************************************************************** */

void main(){
  var magazine = new Magazine("Vogue", 10.03, "West US Publisher");
  magazine.printInfo();

  var newBook = new Book("Johnson & Mary", 102.32, "A trip to Vietname", "Society & Culture Publisher");
  newBook.printInfo();

}
