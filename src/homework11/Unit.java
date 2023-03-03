package homework11;
//EX. 5
public enum Unit {
    METER{
        @Override
        public String getBaseUnit(){
            return METER.toString();
        }
    },
    KILOGRAM{
        @Override
        public String getBaseUnit(){
            return KILOGRAM.toString();
        }
    },
    SECOND{
        @Override
        public String getBaseUnit(){
            return SECOND.toString();
        }
    },
    AMPERE{
        @Override
        public String getBaseUnit(){
            return AMPERE.toString();
        }
    },
    KELVIN{
        @Override
        public String getBaseUnit(){
            return KELVIN.toString();
        }
    },
    MOLE{
        @Override
        public String getBaseUnit(){
            return MOLE.toString();
        }
    },
    CANDELA{
        @Override
        public String getBaseUnit(){
            return CANDELA.toString();
        }
    };

    public abstract String getBaseUnit();



    public String getBase() {
        Unit[] unit = Unit.values();
        for (Unit un : unit) {
            switch (un) {
                case KILOGRAM:
                    return KILOGRAM.toString();
                case METER:
                    return METER.toString();
                case SECOND:
                    return SECOND.toString();
                case AMPERE:
                    return AMPERE.toString();
                case KELVIN:
                    return KELVIN.toString();
                case MOLE:
                    return MOLE.toString();
                case CANDELA:
                    return CANDELA.toString();
            }

        }
        return null;
    }
}
