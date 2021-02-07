export class Product {
  description: string;
  price: number;
  currency: string;
  title: string;
  category: string;
  productImage: string


  constructor(description: string, price: number, currency: string, title: string, category: string, productImage: string) {
    this.description = description;
    this.price = price;
    this.currency = currency;
    this.title = title;
    this.category = category;
    this.productImage = productImage;
  }
}
