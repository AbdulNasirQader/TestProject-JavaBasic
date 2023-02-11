package Class23;

public class Computer {


        String brand;
        String processor;
        int memory;

        public void start() {
            System.out.println("Starting computer");
        }

        public void shutDown() {
            System.out.println("Shutting down computer");
        }
    }

    class Apple extends Computer {
        String os;

        public Apple(String brand, String processor, int memory, String os) {
            this.brand = brand;
            this.processor = processor;
            this.memory = memory;
            this.os = os;
        }

        @Override
        public void start() {
            System.out.println("Starting Apple computer");
        }

        public void showOS() {
            System.out.println("Running " + os);
        }
    }

    class Lenovo extends Computer {
        String graphicsCard;

        public Lenovo(String brand, String processor, int memory, String graphicsCard) {
            this.brand = brand;
            this.processor = processor;
            this.memory = memory;
            this.graphicsCard = graphicsCard;
        }

        @Override
        public void start() {
            System.out.println("Starting Lenovo computer");
        }

        public void showGraphicsCard() {
            System.out.println("Graphics card: " + graphicsCard);
        }
    }

    class HP extends Computer {
        int storage;

        public HP(String brand, String processor, int memory, int storage) {
            this.brand = brand;
            this.processor = processor;
            this.memory = memory;
            this.storage = storage;
        }

        @Override
        public void start() {
            System.out.println("Starting HP computer");
        }

        public void showStorage() {
            System.out.println("Storage: " + storage + "GB");
        }
    }

    class Dell extends Computer {
        String graphicsCard;

        public Dell(String brand, String processor, int memory, String graphicsCard) {
            this.brand = brand;
            this.processor = processor;
            this.memory = memory;
            this.graphicsCard=graphicsCard;
        }

        @Override
        public void start() {
            System.out.println("Starting Dell computer");
        }

        public void showDisplaySize() {
            System.out.println("Display size: " + graphicsCard + " inches");
        }
    }


