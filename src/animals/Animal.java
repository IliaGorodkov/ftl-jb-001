package animals;

class Animal {
    protected String name;
    protected Integer weight;
    protected Integer currentPosition = 0;

    protected MoveType moveType;


    public Animal(String name, Integer weight,MoveType moveType) {
        this.name = name;
        this.weight = weight;
        this.moveType = moveType;
    }

    public Animal(MoveType moveType) {
        this.moveType = moveType;
    }

    public void voice(){
        System.out.println("Voice");
    }

    public void runForward(Integer lenght){
        this.currentPosition += lenght;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Integer currentPosition) {
        this.currentPosition = currentPosition;
    }

    public MoveType getMoveType() {
        return moveType;
    }

    public void setMoveType(MoveType moveType) {
        this.moveType = moveType;
    }
}
