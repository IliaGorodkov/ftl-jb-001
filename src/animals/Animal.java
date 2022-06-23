package animals;

class Animal {
    protected String name;
    protected Integer weight;
    protected Integer currentPosition = 0;

    protected Boolean canFly = false;

    public Animal(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }

    public Animal() {

    }

    public void voice(){
        System.out.println("Voice");
    }

    public void runForward(Integer lenght){
        this.currentPosition += lenght;
    }



}
