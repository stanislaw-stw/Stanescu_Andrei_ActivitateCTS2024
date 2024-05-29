package CommandF5.classes;

public class PuneUsiInModLiberCommand implements Command {
    private Usa usa;

    public PuneUsiInModLiberCommand(Usa usa) {
        this.usa = usa;
    }

    @Override
    public void execute() {
        usa.puneInModLiber();
    }
}
