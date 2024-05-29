package CommandF5.classes;

public class DeschideUsiFortatCommand implements Command {
    private Usa usa;

    public DeschideUsiFortatCommand(Usa usa) {
        this.usa = usa;
    }

    @Override
    public void execute() {
        usa.deschideFortat();
    }
}
