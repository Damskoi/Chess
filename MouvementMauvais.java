
public class MouvementMauvais extends Exception {
    public static final String message = new String("Attention le mouvement que vous souhaitez faire est incorrect veuillez en choisir un valide !!");

    public MouvementMauvais() {
        super(message);
    }
}
