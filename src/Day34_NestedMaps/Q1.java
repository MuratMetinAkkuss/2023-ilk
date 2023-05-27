package Day34_NestedMaps;

public class Q1 {
    public class Test2 {
        private double width;
        private double height;
        private double screenSize;
        private int maxVolume;
        private int volume = 12;
        private boolean power;

        public Test2(double width, double height, double screenSize) {
            this.width = width;
            this.height = height;
            this.screenSize = screenSize;
        }
        public void powerSwitch() {
            this.power = !power;
        }

        public double channelTuning(int channel) {
            switch (channel) {
                case 1:
                    return 34.56;
                case 2:
                    return 54.89;
                case 3:
                    return 73.89;
                case 4:
                    return 94.98;
            }
            return 0;
        }

        public int decreaseVolume() {
            if (0 < volume) {
                volume--;
            }
            return volume;
        }
        public int increaseVolume() {
            if (maxVolume > volume)
                volume++;
            return volume;
        }

    }

}
