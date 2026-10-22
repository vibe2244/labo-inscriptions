package cm.laboacademy.inscriptions;

/**
 * Calcule les frais d'inscription d'un étudiant selon son niveau.
 */
public class FraisInscription {

    private static final int FRAIS_LICENCE = 50000;
    private static final int FRAIS_MASTER = 75000;

    public int calculer(String niveau, boolean boursier) {
        int fraisDeBase = switch (niveau) {
            case "L1", "L2", "L3" -> FRAIS_LICENCE;
            case "M1", "M2" -> FRAIS_MASTER;
            default -> throw new IllegalArgumentException("Niveau inconnu : " + niveau);
        };
        return boursier ? fraisDeBase / 2 : fraisDeBase;
    }
}
