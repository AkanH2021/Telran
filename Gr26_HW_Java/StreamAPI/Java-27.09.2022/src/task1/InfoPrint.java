package task1;

enum Compass {
    NORTH,
    SOUTH,
    EAST,
    WEST,
    MIDDLE;

    static class Directions {
        Compass direction;

        public Directions(Compass direction) {
            this.direction = direction;
        }

        public void DirectionsInfoPrint() {
            switch (direction) {
                case NORTH -> System.out.println("In the Norh of Germany there is a Denmark");
                case SOUTH -> System.out.println("In the South of Germany there is a Liechtenstein.");
                case EAST -> System.out.println("In the East of Germany there are Poland and Czechia.");
                case WEST -> System.out.println("In the West of Germany there are Netherlands and Belgium.");
                default -> System.out.println("In the middle of Germany there is Unstrut-Hainich.");
            }
        }
    }
}


