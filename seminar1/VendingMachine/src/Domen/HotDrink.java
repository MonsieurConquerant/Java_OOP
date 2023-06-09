package Domen;

public class HotDrink extends Product {
        private int volume;
        private int temperature;
    
        /**
         * Create a product for VM
         *
         * @param productId       id product
         * @param productName
         * @param productCategory
         * @param price
         * @throws Exception
         */
        public HotDrink(int productId, String productName, String productCategory, double price, int volume, int temperature) throws Exception {
            super(productId, productName, productCategory, price);
            this.volume = volume;
            this.temperature = temperature;
        }

        public int getVolume() {
            return volume;
        }

        public void setVolume(int volume) {
            this.volume = volume;
        }

        @Override
        public String toString()
        {
            return "Product{" +
            "name='" + super.getProductName() + '\'' +
            "category='" + super.getProductCategory() + '\'' +
            ", cost=" + super.getPrice() +
            ", volume=" + volume + "temperature=" + temperature +
            '}';
        }
    }